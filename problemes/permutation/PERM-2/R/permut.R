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

while(i <= length(liste))
{
	if(!(i == permut[liste[i]] & permut[i] == liste[i])) {
	verif<-TRUE;
	cat(FALSE);
	i<- length(liste)+1;
	}
	i <- i + 1;
}

if(!verif){
cat(TRUE);
}

