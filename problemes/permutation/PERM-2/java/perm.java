import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class perm {

	public static void main(String[] args) throws FileNotFoundException {
		StdinExtract stdinentre = new StdinExtract();
		ArrayList<String> entrees = stdinentre.getEntrees();
		String[] strArray = entrees.get(0).split(" ");
		int[] intArray = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
   			intArray[i] = Integer.parseInt(strArray[i]);
		}
		strArray = entrees.get(1).split(" ");
		int[] intArray2 = new int[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
   			intArray2[i] = Integer.parseInt(strArray[i]);
		}

		boolean res = permutation(intArray, intArray2, strArray.length);

   		System.out.println(res);

	}

	static boolean permutation(int liste[], int permut[], int taille){
	int i=0;
	while(i < taille){
		if(  ((i+1) != permut[liste[i]-1]) || (permut[i] != liste[i]) ) {
		//	printf("i: %d, p: %d, l: %d \n",(i+1), permut[liste[i]-1], liste[i] );
			return false;
		}
		i++;
	}
	return true;
}



}


 class StdinExtract
{
    public ArrayList<String> entrees;
    public StdinExtract()
    {
      this.entrees = new ArrayList<>();
    }

    public ArrayList<String> getEntrees()
    {

    try
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while((input=br.readLine())!=null)
        {
            this.entrees.add(input);
        }

    }
    catch(IOException io)
    {
        io.printStackTrace();
    }

    return this.entrees;
  }

}