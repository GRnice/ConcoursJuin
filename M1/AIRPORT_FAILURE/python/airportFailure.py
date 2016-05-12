import sys , math , copy

data = sys.stdin.readlines()

class Airport:
    def __init__(self,name,x,y):
        self.name = name
        self.x = x
        self.y = y
        self.listAirportSubstitution = []
        self.mark = 0
        self.free = True
        self.capacite = 2

    def __str__(self):
        string = "\nAEROPORT\n"
        string += "nom: "+self.name+"\n"
        string += "x:"+str(self.x)+"\n"
        string += "y:"+str(self.y)+"\n"
        string += "aeroports de substitution\n{"
        for i in range(len(self.listAirportSubstitution)):
            string += self.listAirportSubstitution[i].__str__()+" "

        string += "}\n"
        return string

    def addAirportSubstitution(self,airport):
        self.listAirportSubstitution.append(airport)

    def reserve(self):
        self.capacite -= 1
        if (self.capacite == 0):
            self.free = False

class Plane:
    def __init__(self,name,x,y,destination):
        self.name = name
        self.x = x
        self.y = y
        self.destination = destination

    def __str__(self):
        string = "\nAVION\n"
        string += "nom: "+self.name+"\n"
        string += "x:"+str(self.x)+"\n"
        string += "y:"+str(self.y)+"\n"
        string += "destination"+self.destination+"\n"
        return string

class Sortmaster:
    def __init__(self,avionObj,airportObj,hashmapAirport):
        self.airport = airportObj
        self.avion = avionObj
        self.hashAirport = hashmapAirport

    def sortByNormeOnly(self,listeAirport):
        return sorted(listeAirport,cmp = self.compareNormeOnly)

    def compareNormeOnly(self,a1,a2):
        airport1 = self.hashAirport[a1]
        airport2 = self.hashAirport[a2]
        deltaY1 = (airport1.y - self.airport.y)
        deltaX1 = (airport1.x - self.airport.x)
        norme1 = math.sqrt(deltaY1**2 + deltaX1**2)

        deltaY2 = (airport2.y - self.airport.y)
        deltaX2 = (airport2.x - self.airport.x)
        norme2 = math.sqrt(deltaY2**2 + deltaX2**2)
        return int(norme1 - norme2)



def initHashmapAirport(hashmap , data):
    for i in range(len(data)):
        line = data[i]
        line = line[0:-1]
        line = line.split(' ')
        name = line[0]
        posx = int(line[1])
        posy = int(line[2])
        airport = Airport(name,posx,posy)
        for j in range(3,len(line) , 1):
            airport.addAirportSubstitution(line[j])
        
        hashmap[name] = airport

    return hashmap

def initHasmapPlane(hashmap , data):
    for i in range(len(data)):
        line = data[i]
        line = line[0:-1]
        line = line.split(' ')
        name = line[0]
        posx = int(line[1])
        posy = int(line[2])
        destination = line[3]
        plane = Plane(name , posx , posy , destination)
        hashmap[name] = plane
    

def redirigerAvion2(avionObj , hashAirport,marker):
    airport = avionObj.destination
    #def iterative_dfs(graph, start, path=[]):
    q= [avionObj.destination]
    sorter = Sortmaster(avionObj , hashAirport[avionObj.destination] , hashAirport)
    elt = None

    while (len(q) > 0):            
        voisins = sorter.sortByNormeOnly(q)
        q = []
        for i in range(len(voisins)):
            voisin = hashmapAirport[voisins[i]]

            if voisin.mark != marker and voisin.free:
                print(voisin.name,"for",avionObj.name)
                voisin.reserve()
                return

            elif voisin.mark != marker:
                q.extend(hashAirport[voisin.name].listAirportSubstitution)
                voisin.mark = marker
            
        

hashmapAirport = dict()
hashmapPlane = dict()
nbAirport = int(data[0].rstrip())
initHashmapAirport(hashmapAirport,data[1:nbAirport+1])
nbAirplane = int(data[nbAirport+1].rstrip())
initHasmapPlane(hashmapPlane,data[nbAirport+2:nbAirport+2+nbAirplane])

##print(hashmapAirport["SANFRANCISCO"])
##print(hashmapAirport["BERKELEY"])
##print(hashmapAirport["OAKLAND"])
##
##print(hashmapPlane["AF754"])
##print(hashmapPlane["AA135"])

airportFail = data[nbAirport+2+nbAirplane]
airportFail = airportFail[0:-1]
airportFail = airportFail.split(' ')
for i in range(1,len(airportFail),1):
    hashmapAirport[airportFail[i]].free = False

##print("fail airport",airportFail)

cle = hashmapPlane.keys()
marker = 1
for nom in cle:
    if not hashmapAirport[hashmapPlane[nom].destination].free:
        redirigerAvion2(hashmapPlane[nom],hashmapAirport,marker)
        marker += 1
