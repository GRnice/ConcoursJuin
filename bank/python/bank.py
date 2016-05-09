import sys


data = sys.stdin.readlines()

for i in range(len(data)):
    data[i]=data[i].replace("\n","")


def breakRNA(seqRNA, *breakPoint):
    seqRNAList = []
    noOfBreakPoints = len(breakPoint)
    for breakPt in range(noOfBreakPoints):
        for index in breakPoint:
            seqRNAList.append(seqRNA[:index])
            seqRNA = seqRNA[index:]
        break
    return seqRNAList

for i in range(len(data)):
    data[i]=data[i].replace(" ","")
data.sort(key=int)
res=[]
for elt in data:
    res.append(" ".join(breakRNA(elt,2,8,4,4,4,4)))
d={}
for elt in res:
    d[elt]=res.count(elt)

for elt in res:
    if(res.count(elt) > 1):
        res.pop(res.index(elt))

for elt in res:
    print(elt+" "+str(d[elt]))



