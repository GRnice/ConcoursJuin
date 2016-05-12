import sys

dico =dict()
racine = None

data = sys.stdin.readlines()
line1 = data[0]
line1 = line1[0:-1]
line1 = line1.split(' ')
allNodes = data[1]
allNodes = allNodes[0:-1]
allNodes = allNodes.split(' ')

nbNode = int(line1[0])
nbTransition = int(line1[1])

for i in range(len(allNodes)):
    dico[allNodes[i]] = []

state = True

for i in range(2,nbTransition + 1 , 1):
    line = data[i]
    line = line[0:-1]
    line = line.split(' ')
    src = line[0]
    symbole = line[1]
    dest = line[2]
    tab = dico[src]
    if symbole in tab:
        state = False
        print("INDETERMINISTE")
        break
    
    else:
        tab.append(symbole)

if (state):
    print("DETERMINISTE")
