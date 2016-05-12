import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	
	
	
	public static int dji(Graph G, int n, int s, int d){
		Integer dist[]=new Integer[n];
		Integer prev[]=new Integer[n];
		ArrayList<Integer[]> res = new ArrayList<>();
		ArrayList<Edge> Q = new ArrayList<>();
		
		for(int i=0; i<G.getEdgess().size() ; i++){
			dist[i]= 999999;
			//prev[edges.get(0).getNumero()]=null;
			Q.add(G.getEdgess().get(i));
		}
		
		dist[s-1]=0;
		
		while(!Q.isEmpty()){
			int min=999999999;
			
			for(int i=0; i<Q.size();i++){
			    if(dist[Q.get(i).getNumero()-1]<=min){
			    	min=Q.get(i).getNumero();
			    }
			}
			
		    int alt;
		    Edge u=null;
		    
		    for(int i =0; i<Q.size();i++){
		    	if(Q.get(i).getNumero()==min){
		    		//System.out.println("min: " + (min));
		    		//System.out.println(min);
		    		u = Q.get(i);
					Q.remove(i);
		    	}
		    }
//	    	System.out.println("min: " + min);
//		    System.out.println(Q);
		    for(int i=0; i<u.getVoisin().size();i++){
	    		//System.out.println("je suis "+u.getNumero());
		    	alt= dist[u.getNumero()-1] + u.getPoids();
		    	if(u.isVoisin(d) && u.getNumero() == s){
			    	if(alt <= dist[u.getVoisin().get(i)-1]){
			    		dist[u.getVoisin().get(i)-1]=alt;
			    		prev[u.getVoisin().get(i)-1]= u.getNumero();
			    		//break;
			    	}
		    	}
		    	else if(u.isVoisin(d) && u.getNumero() != s){
			    	if(alt <= dist[u.getVoisin().get(i)-1]){
			    	//	System.out.println("je suis "+u.getNumero());
			    		dist[u.getVoisin().get(i)-1]=alt;
			    		prev[u.getVoisin().get(i)-1]= u.getNumero();
			    	}		    		
		    	}
		    	else{
		    	if(alt < dist[u.getVoisin().get(i)-1]){
		    		dist[u.getVoisin().get(i)-1]=alt;
		    		prev[u.getVoisin().get(i)-1]= u.getNumero();
		    	}
		    	}
		    } 
		}
		//res.add(dist);
		//res.add(prev);
	//	for(int i=0; i< n;i++){
		//}
		return dist[d-1];
	}
	
	public static int dji2(Graph G, int n, int s, int d, int p){
		Integer dist[]=new Integer[n];
		Integer prev[]=new Integer[n];
		ArrayList<Integer[]> res = new ArrayList<>();
		ArrayList<Edge> Q = new ArrayList<>();
		int acc=0;
		
		for(int i=0; i<G.getEdgess().size() ; i++){
			dist[i]= 999999;
			//prev[edges.get(0).getNumero()]=null;
			Q.add(G.getEdgess().get(i));
		}
		
		dist[s-1]=0;
		
		while(!Q.isEmpty()){
			int min=999999999;
			
			for(int i=0; i<Q.size();i++){
			    if(dist[Q.get(i).getNumero()-1]<=min){
			    	min=Q.get(i).getNumero();
			    }
			}
			
		    int alt;
		    Edge u=null;
		    
		    for(int i =0; i<Q.size();i++){
		    	if(Q.get(i).getNumero()==min){
		    		//System.out.println("min: " + (min));
		    		//System.out.println(min);
		    		u = Q.get(i);
					Q.remove(i);
		    	}
		    }
//	    	System.out.println("min: " + min);
//		    System.out.println(Q);
		    for(int i=0; i<u.getVoisin().size();i++){
		    	alt= dist[u.getNumero()-1] + u.getPoids();
		    	if(u.isVoisin(d) && u.getNumero() == s && alt == p){
			    	if(alt <= dist[u.getVoisin().get(i)-1]){
			    	//	System.out.println("je suis "+u.getNumero());
			    		acc=1;
			    		dist[u.getVoisin().get(i)-1]=alt;
			    		prev[u.getVoisin().get(i)-1]= u.getNumero();
			    	}
		    	}
		    	else if(u.isVoisin(d) && u.getNumero() != s && alt == p){
			    	if(alt <= dist[u.getVoisin().get(i)-1]){
			    		//System.out.println("je suis "+u.getNumero());
			    		acc++;
			    		dist[u.getVoisin().get(i)-1]=alt;
			    		prev[u.getVoisin().get(i)-1]= u.getNumero();
			    	}		    		
		    	}
		    	else{
		    	if(alt < dist[u.getVoisin().get(i)-1]){
		    		dist[u.getVoisin().get(i)-1]=alt;
		    		prev[u.getVoisin().get(i)-1]= u.getNumero();
		    	}
		    	}
		    } 
		}
		//res.add(dist);
		//res.add(prev);
	//	for(int i=0; i< n;i++){
		//	System.out.println("nb chemin: " +acc);
		//}
		return acc;
	}

	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("./d"));
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();

		while(scan.hasNextInt()){
			list.add(scan.nextInt());
		}
		
		int n=list.get(0);
		int s=list.get(1);
		int d=list.get(2);

		ArrayList<Edge> edges = new ArrayList<Edge>();
		Graph G;
		
		int j=1;
		for(int i=3; i <=(n*3); i+=3){
			ArrayList<Integer> v =  new ArrayList<Integer>();
			for(int nb=list.get(i); nb<= list.get(i+1); nb++){
				if(nb==-1){
					v.add(list.get(i+1));
					break;
				}
				else{
				v.add(nb);
				}
			}
			//v.add(list.get(i));
			//v.add(list.get(i+1));			
			edges.add(new Edge(j,v , list.get(i+2),n));
			j++;
		}
		
		G= new Graph(edges);
		
		//System.out.println(G);
		
		//ArrayList<Integer[]> res = dji(G,n,s,d);
		int r = dji(G,n,s,d);
		int res = dji2(G,n,s,d,r);
		
		
//		for(int i=0; i < n; i++){
//			System.out.println(res.get(0)[i] +" ");
//		}

		System.out.println(r+" "+res+"\n");

	}
}


 class Graph {
	
	private ArrayList<Edge> edges;
	
	public Graph(ArrayList<Edge> e){
		this.edges = e; 
	}
	
	public ArrayList<Edge> getEdgess(){
		return this.edges;
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


 class Edge {
	
	private int numero;
	private int poids;
	private ArrayList<Integer> voisin;
	private Boolean tabVisit[];
	
	public Edge(int n, ArrayList<Integer> v, int p, int nb){
		this.numero = n;
		this.poids = p;
		this.voisin = v;
		this.tabVisit = new Boolean[nb];
	}
	
	public int getNumero(){
		return this.numero;
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