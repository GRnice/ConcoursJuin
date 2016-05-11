import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	 
	
	public static int zeroDroite(ArrayList<Integer> tab ){
		int max=0;
		
		for(int i=0; i < tab.size(); i++){
			if(tab.get(i) == 0){
				max = i;
			}
		}
		
		return max;
	}
	
	public static int max(ArrayList<Integer> tab ){
		int max=tab.get(0);
		
		for(int i=1; i < tab.size(); i++){
			if(tab.get(i) > max){
				max = tab.get(i);
			}
		}
		
		return max;
	}
	
	public static void deleteMax(ArrayList<Integer> tab ){
		int max=tab.get(0);
		int indMax=0;
		
		for(int i=1; i < tab.size(); i++){
			if(tab.get(i) > max){
				max = tab.get(i);
				indMax = i;
			}
		}
		
		tab.remove(indMax);
	}
	
	public static void trier(ArrayList<Integer> tabO){
		 Collections.sort(tabO, new Comparator<Integer>() {
			    @Override
			    public int compare(Integer tc1, Integer tc2) {
			        return tc1-tc2;
			    }
			});
	 }
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("./g"));
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(scan.hasNextInt()){
			list.add(scan.nextInt());
		}
		
		int n=list.get(0);
		//int tabT [] = new int[n];
		//int tabI [] = new int[n];
		//int res [] = new int[n];
		ArrayList<Integer> tabT = new ArrayList<Integer>();
		ArrayList<Integer> tabO = new ArrayList<>();
		ArrayList<Integer> tabI = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();

		ArrayList<Integer> tabCoupe = new ArrayList<Integer>();
		
		for(int i=0; i< n ;i++){
			tabT.add(list.get(i+1));
			tabI.add(list.get(i+1+n));
			res.add(-1);
		}
	
		tabO.addAll(tabT);
		trier(tabO);


		
//		if(max == (n-1)){
//			res.set(max, vmax);
//			deleteMax(tabT);
//			tabI.remove(max);
//			tabO.remove(tabO.size()-1);
//		}
//		else{
//			for(int i=(max+1); i<tabT.size(); i++){
//				tabCoupe.add(tabT.get(i));
//			}
//			deleteMax(tabT);
//			tabI.remove(max);
//			tabO.remove(tabO.size()-1);
//		}
//		
//		max = zeroDroite(tabI);
//		vmax = max(tabT);
//		
//		if(max == (n-1)){
//			res.set(max, vmax);
//			tabI.remove(max);
//			tabO.remove(tabO.size()-1);
//		}
//		else{
//			res.set(max, vmax);
//			for(int i=(max+1); i<tabT.size(); i++){
//				tabCoupe.add(tabI.get(i));
//			}
//			deleteMax(tabT);
//			tabI.remove(max);
//			tabO.remove(tabO.size()-1);
//			
//			for(int i=tabCoupe.size()-1; i<= 0; i++){
//			//System.out.println(tabO.get(tabO.size()-1-tabI.get(tabI.size()-1)+1));
//			res.set(tabT.size(), tabO.get(tabO.size()-1-tabI.get(tabI.size()-1)+1));
//			tabO.remove(tabO.indexOf(tabO.get(tabO.size()-1-tabI.get(tabI.size()-1)+1)));
//			tabI.remove(tabI.size()-1);
//			tabT.remove(tabT.size()-1);
//			}
//			tabCoupe.clear();
//			
//		}
//		
//		max = zeroDroite(tabI);
//		vmax = max(tabT);
	while(!tabT.isEmpty()){
		int max = zeroDroite(tabI);
		int vmax = max(tabO);
	//	System.out.println(vmax);
		if(max == tabT.size()-1){
			res.set(max, vmax);
			tabI.remove(max);
			tabO.remove(tabO.size()-1);
			deleteMax(tabT);
		}
		else{
			res.set(max, vmax);
			for(int i=(max+1); i<tabT.size(); i++){
			//	System.out.println(tabI.get(i));
				tabCoupe.add(tabI.get(i));
				
			}
			///System.out.println(tabI);
		//	System.out.println();
			//System.out.println(tabT);
			deleteMax(tabT);
			tabI.remove(max);
			tabO.remove(tabO.size()-1);
		//	System.out.println(tabCoupe.size());

			for(int j=0; j< tabCoupe.size(); j++){
		//	System.out.println("tailt: "+tabT.size());
			res.set(tabT.size(), tabO.get(tabO.size()-1-tabI.get(tabI.size()-1)+1));
			tabO.remove(tabO.indexOf(tabO.get(tabO.size()-1-tabI.get(tabI.size()-1)+1)));
			tabI.remove(tabI.size()-1);
			tabT.remove(tabT.size()-1);
			}
			tabCoupe.clear();

		}

	}
		
		//////////////////////////////
//		for(int i=0; i<tabT.size();i++){
//			System.out.println(tabT.get(i));
//		}
//		System.out.println();
//		for(int i=0; i<tabI.size();i++){
//			System.out.println(tabI.get(i));
//		}
//		System.out.println();
//		for(int i=0; i<tabO.size();i++){
//			System.out.println(tabO.get(i));
//		}
//		
//		System.out.println();
//		for(int i=0; i<res.size();i++){
//			System.out.println(res.get(i));
//		}
		
		System.out.println(res);
		
	}
}
