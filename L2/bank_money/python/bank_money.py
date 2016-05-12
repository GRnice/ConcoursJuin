import sys

data = sys.stdin.readlines()


for i in range(len(data)):
	data[i]=data[i].replace("\n","")


res=dict()

for elt in data:
	var=elt.split()
	if(var[0] == "CREATECOUNT"):
		res[var[1]]=0
	if(var[0] == "DELETECOUNT"):
		del res[var[1]]
	if(var[0] == "CREDITCOUNT"):
		res[var[1]]+=int(var[2])
	if(var[0] == "DEBITCOUNT"):
		res[var[1]]-=int(var[2])
	if(res.has_key(var[1])):
		print(var[1]+":"+str(res[var[1]]))
