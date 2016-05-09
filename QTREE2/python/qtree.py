dico =dict()
racine = None

file = open("input.txt","r",encoding="utf-8")
data = file.readlines()
file.close()

firstLine = data[0]
firstLine = firstLine[0:-1]
tabFirst = firstLine.split(' ')
nbNode = int(tabFirst[0])
nbEdge = int(tabFirst[1])

class Node:
    def __init__(self,ident):
        self.ident = ident
        self.parent = None
        self.marqueur = 0
        self.visited_ = False
        self.iemeVisite = None
        self.poids = 0

    def addParent(self,idNode):
        self.parent = idNode

    def visited(self,marqueur):
        self.visited_ = marqueur

    def getPoids(self):
        return self.poids


def calculDistance(liste):
    res = 0
    node = None
    for i in range(len(liste)):
        node = dico[liste[i]]
        res = res + node.poids

    print(res)

def printIemeNode(liste,i):
    print(liste[i-1])

def searchPath(fromN,toN,marqueur):
        Lfrom = list()
        Lto = list()
        fromInitial = fromN
        toInitial = toN
        iemeNoeudVisite = 0
        dico[fromN].iemeVisite = iemeNoeudVisite
        dico[toN].iemeVisite = iemeNoeudVisite
        dico[fromN].visited(marqueur)
        dico[toN].visited(marqueur)
        Lfrom.append(fromN)
        Lto.append(toN)

        pereFrom = dico[fromN].parent
        pereTo = dico[toN].parent
        
        if (pereFrom == None and pereTo == None):
            print(Lfrom)
            return

        if (dico[fromN].parent == dico[toN] or dico[toN].parent == dico[fromN]):
            print("["+str(fromN)+","+str(toN)+"]")

        
        
        while(True):
            iemeNoeudVisite += 1
            pereFrom = dico[fromN].parent
            pereTo = dico[toN].parent
                
            if pereFrom != None:
                if (pereFrom.visited_ == marqueur):

                    
                    if (Lfrom[-1] == toInitial):
                        return Lfrom

                    Lto = Lto[:pereFrom.iemeVisite+1]
                    Lto.reverse()
                    Lfrom.extend(Lto)
                    return Lfrom

                
                fromN = pereFrom.ident
                dico[pereFrom.ident].iemeVisite = iemeNoeudVisite
                dico[pereFrom.ident].visited(marqueur)
                Lfrom.append(fromN)

            if pereTo != None:
                
                if (pereTo.visited_ == marqueur):
                    if (Lto[-1] == fromInitial):
                        return Lto

                    Lfrom = Lfrom[:pereTo.iemeVisite+1]
                    Lto.reverse()
                    Lfrom.extend(Lto)
                    return Lfrom

                toN = pereTo.ident
                dico[pereTo.ident].iemeVisite = iemeNoeudVisite
                dico[pereTo.ident].visited(marqueur)
                Lto.append(toN)
                




def build():
    for i in range(1,nbEdge+1,1):
        line = data[i]
        line = line[0:-1]
        line = line.split(' ')
        
        idNode = int(line[0])
        idNode2 = int(line[1])
        poids = int(line[2])
        if not idNode in dico:
            dico[idNode] = Node(idNode)

        if not idNode2 in dico:
            dico[idNode2] = Node(idNode2)

        if (i == 1):
            racine = dico[idNode]

        node = dico[idNode]
        node.poids = poids
        dico[idNode2].addParent(node)


def request():
    i = nbEdge + 1
    marqueur = 0
    while(True):
        marqueur += 1
        line = data[i]
        line = line[0:-1]
        line = line.split(' ')
        if (line[0] == "DONE"):
            return

        elif(line[0] == "DIST"):
            src = int(line[1])
            dest = int(line[2])
            tab = searchPath(src,dest,marqueur)
            calculDistance(tab)

        elif(line[0] == "KTH"):
            src = int(line[1])
            dest = int(line[2])
            iemeNoeud = int(line[3])
            tab = searchPath(src,dest,marqueur)
            printIemeNode(tab,iemeNoeud)

        i = i + 1
            

build()
request()          

        
    
    
