# EXEMPLE 2 LIGNES EN ENTREE
#############################################################
# EXEMPLE 2 LIGNES EN ENTREE
#############################################################


con=file("stdin", "r")
liste=scan(file=con, what=integer(), nline=1, quiet=TRUE)
permut=scan(file=con, what=integer(), nline=2, quiet=TRUE)

#############################################################

i <- 1;
verif<-FALSE;

x<- function(l){
	a<-c();
	for(j in 1:length(l))
	{
		a[j]<-(l[j]-3)/2;
	}
	 return (a);
}

t<-x(permut)

while(i <= length(liste))
{
	if(!(i == t[liste[i]] & t[i] == liste[i])) {
	verif<-TRUE;
	cat(FALSE);
	i<- length(liste)+1;
	}
	i <- i + 1;
}

if(!verif){
cat(TRUE);
}

