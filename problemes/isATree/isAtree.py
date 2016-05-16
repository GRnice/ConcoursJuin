file = open("input.txt","r",encoding="utf-8")
data = file.readlines()
file.close()

firstLine = data[0]
firstLine = firstLine[0:-1]
tabFirst = firstLine.split(' ')
nbNode = int(tabFirst[0])
nbEdge = int(tabFirst[1])

structure = None



def BFS(nbNode):
    racine.marqueur = 1
    pile=racine.child
    while (len(pile) > 0):
        node = pile.pop()
        if (node.marqueur == 1):
            print("FALSE")
            return
            
        if (len(node.child) > 0):
            pile.extend(node.child)

        node.marqueur = 1
        nbNode = nbNode - 1

    if (nbNode == 0):
        print("TRUE")
    else:
        print("FALSE")


class Node:
    def __init__(self,ident):
        self.ident = ident
        self.child = list()
        self.marqueur = 0

    def addChild(self,node):
        self.child.append(node)


dico =dict()
racine = None
for i in range(1,nbEdge+1,1):
    line = data[i]
    line = line[0:-1]
    line = line.split(' ')
    print(line)
    
    idNode = int(line[0])
    idNode2 = int(line[1])
    if not idNode in dico:
        dico[idNode] = Node(idNode)

    if not idNode2 in dico:
        dico[idNode2] = Node(idNode2)

    if (i == 1):
        racine = dico[idNode]

    node = dico[idNode]
    node.addChild(dico[idNode2])

BFS(nbNode)

        
    
    
