import sys
data = sys.stdin.readlines()

for i in range(len(data)):
	data[i] = map(int, data[i].rstrip().split())


def permutation(liste, permut):
	i=0
	while(i < len(liste)):
                if(  ((i+1) != permut[liste[i]-1]) or (permut[i] != liste[i]) ):
                        return False
                i+=1
        return True

def fx(permut):
        for i in range(len(permut)):
                permut[i] = (permut[i]-3)/2
        return permut

        

print(str(permutation(data[0],fx(data[1]))).upper())
