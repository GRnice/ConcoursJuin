import sys

data = sys.stdin.readline().split(" ")
data[-1]=data[-1].replace("\n","")

data.sort(key=len)

res=0

for elt1 in data:
    for elt2 in data:
        if(elt1 != elt2):
			if(elt2.find(elt1) >= 0):
				res=True
    data.pop(0)

if(res==True):
	print("NO")
else : print("YES")