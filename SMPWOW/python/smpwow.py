import sys

lines = sys.stdin.readlines()
lines = lines[0]
lines = int(lines[0:-1])
string = "W"

for i in range(lines):
    string += "o"

string += "w"
print(string)
