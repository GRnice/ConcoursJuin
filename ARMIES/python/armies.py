import sys

lines = sys.stdin.readlines()
counterBajtocja=0
lineBajtocja = None
lineMegabajtolandia = None

lineBajtocja = lines[1]
lineMegabajtolandia = lines[3]

lineBajtocja = lineBajtocja[0:-1]
lineBajtocja = lineBajtocja.replace(" ","+")
lineBajtocja = eval(lineBajtocja)
lineMegabajtolandia = lineMegabajtolandia[0:-1]
lineMegabajtolandia = lineMegabajtolandia.replace(" ","+")
lineMegabajtolandia = eval(lineMegabajtolandia)

counterBajtocja = lineBajtocja - lineMegabajtolandia

if(counterBajtocja < 0):
    print("Megabajtolandia")

elif (counterBajtocja > 0):
    print("Bajtocja")

else:
    print("Draw")
    
