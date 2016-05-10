import re,sys

data = sys.stdin.readline()

pat = re.compile('\d{1,3}\.\d{1,3}\.\d{1,3}\.\d{1,3}')

res=pat.findall(data)

for elt in res:
	print(elt)
