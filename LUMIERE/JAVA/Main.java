import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
	
	
	public static int lumi(Graph G, int n){
		return 0;
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("./c"));
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while(scan.hasNextInt()){
			list.add(scan.nextInt());
		}
		
		int n=list.get(0);
		
		ArrayList<Edge> edges = new ArrayList<Edge>();
		Graph G;
		
		int j=1;
		for(int i=1; i <=(n*2); i+=2){
			ArrayList<Integer> v =  new ArrayList<Integer>();
				if(list.get(i)==-1){
					v.add(list.get(i+1));
				}
				else{
				v.add(list.get(i));
				v.add(list.get(i+1));
				}
						
			edges.add(new Edge(j,v , 0,n));
			j++;
		}
		
		G= new Graph(edges);
		
	//	System.out.println(G);

		

	//	System.out.println("\n");			


		int acc=0;
		int e=0;
		while(!G.getFini()){
			G.trierVoisins();
			while(G.getEdgess().get(e).getAlume()){
				e++;
			}
			//System.out.println("//////////////////////////////// " + "\n");
			//System.out.println("j'allume le: " + G.getEdgess().get(e).getNumero() );
			G.getEdgess().get(e).setAlume(true);
			G.updateEdge();
			acc++;
			e=0;
//			System.out.println(acc + "\n");
//			for(int i=0; i < n ; i++){
//				System.out.println(G.getEdgess().get(i).getNumero() +" voisins: "+Graph.getVoisinsAllume(G.getEdgess().get(i))+" "+ G.getEdgess().get(i).getVoisin()  +"\n");
//			}
		}
		

		System.out.println(acc + "\n");
		
	}
}

 class Edge {
	
	private int numero;
	private int poids;
	private ArrayList<Integer> voisin;
	private Boolean tabVisit[];
	private Boolean alume;
	
	public Edge(int n, ArrayList<Integer> v, int p, int nb){
		this.numero = n;
		this.poids = p;
		this.voisin = v;
		this.tabVisit = new Boolean[nb];
		this.alume = false;
	}
	
	public int getNumero(){
		return this.numero;
	}
	
	public boolean getAlume(){
		return alume;
	}
	
	public void setAlume(boolean b){
		this.alume = b;
	}
	
	public Boolean[] getTabVisit(){
		return this.tabVisit;
	}
	
	public ArrayList<Integer> getVoisin(){
		return this.voisin;
	}
	
	public boolean isVoisin(int n){
		for(int i=0; i< voisin.size(); i++){
			if(voisin.get(i)== n){
				return true;
			}
		}
		return false;
	}
	
	public int getNbVoisin(){
		return voisin.size();
	}
	
	public void addVoisin(int n){
		voisin.add(n);
	}
	
	public void deleteVoisin(int n){
		for(int i=0; i< voisin.size(); i++){
			if(voisin.get(i)== n){
				voisin.remove(i);
			}
		}
	}
	
	public int getPoids(){
		return this.poids;
	}
	
	@Override
	public String toString(){
		return "numero: "+ getNumero()+" voisin:"+ getVoisin()+" poids: "+getPoids(); 
	}
}



 class Graph {
	
	private static ArrayList<Edge> edges;
	private static ArrayList<Edge> edges2 = new ArrayList<Edge>();

	public Graph(ArrayList<Edge> e){
		this.edges = e; 
		this.edges2.addAll(e);
		updateVoisin();
	}
	
	public void updateVoisin(){
		for(int i=0;i< edges.size();i++){
			ArrayList<Integer> v = edges.get(i).getVoisin();
			for(int j=0;j<v.size();j++){
					if(!edges.get(v.get(j)-1).isVoisin(i+1)){
				
				edges.get(v.get(j)-1).addVoisin(i+1);
					}
			}
		}
	}
	
	public void updateEdge(){
		for(int i=0;i< edges.size();i++){
			if(!edges2.get(i).getAlume()){
				ArrayList<Integer> v = edges2.get(i).getVoisin();
				int al=0;
				for(int j=0;j<v.size();j++){
						if(edges2.get(v.get(j)-1).getAlume()){
							al++;
						}
				}
				if(al == v.size()){
					edges2.get(i).setAlume(true);
				}
			}
		}
	}
	
	public ArrayList<Edge> getEdgess(){
		return this.edges;
	}
	
	public ArrayList<Edge> getEdgess2(){
		return this.edges2;
	}
	
	// crééer short avec acc dans getvoisins si voisin bool est alume
	
	public static Integer getVoisinsAllume(Edge e){
		ArrayList<Integer> v = e.getVoisin();
		int allume = 0;
		for(int i=0; i< v.size();i++){
			if(!edges2.get(v.get(i)-1).getAlume()){
				allume++;
			}
		}
		return allume;				
	}
	
	public boolean getFini(){
		for(int i=0; i< edges.size(); i++){
			if(!edges.get(i).getAlume()){
				return false;
			}
		}
		return true;
	}
     
	public void trierVoisins(){
	 Collections.sort(edges, new Comparator<Edge>() {
		    @Override
		    public int compare(Edge tc1, Edge tc2) {
		        return getVoisinsAllume(tc2)-getVoisinsAllume(tc1);
		    }
		});
 }
	
	
	public ArrayList<Edge> getVoisins(Edge e){
		ArrayList<Integer> v = e.getVoisin();
		ArrayList<Edge> res = new ArrayList<Edge>();
		for(int i=0; i< v.size();i++){
			res.add(edges.get(v.get(i)-1));
		}
		return res;
	}
	
	@Override
	public String toString(){
		String res="";
		for(int i=0; i< edges.size(); i++){
			res+= edges.get(i).toString()+"\n";
		}
		return res;
	}
	
}
