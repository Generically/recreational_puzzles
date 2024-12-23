package adventofcodetwentytwentyfour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class DayTwentyThree {
	static String dirName = "src/adventofcodetwentytwentyfour";
	static String fileName = "daytwentythreeinput.txt";
	static File dir = new File(dirName);

	static ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File (dir, fileName));
		while (s.hasNext()){
			ArrayList<String> temp = new ArrayList<String>();
			String[] tempstr = s.next().split("-");
			temp.add(tempstr[0]);temp.add(tempstr[1]);
		    list.add(temp);
		}
		s.close();
		System.out.println("Nodes read from file");
		
		for(int i = 0; i < list.size(); ++i) {
			for(int j = 0; j < list.get(i).size(); ++j) {
				if(!nodeLocations.containsKey(list.get(i).get(j))) {
					nodeLocations.put(list.get(i).get(j), nodes.size());
					nodes.add(new node(list.get(i).get(j)));
					
				}
			}
		}
		System.out.println("Nodes created");
		
		for(int i = 0; i < list.size(); ++i) {
			nodes.get(nodeLocations.get(list.get(i).get(0))).addConnection(list.get(i).get(1));
			nodes.get(nodeLocations.get(list.get(i).get(1))).addConnection(list.get(i).get(0));
		}
		
		System.out.println("Connections created");

		ArrayList<ArrayList<String>> containingT = new ArrayList<ArrayList<String>>();
		double count = 0;
		ArrayList<runnable> threads = new ArrayList<runnable>();
		for(node n : nodes) {
			threads.add(new runnable(n));
		}
		System.out.println("Threads Created");
		int threadNumber = threads.size();
		for(Thread T : threads) {
			T.start();
		}
		System.out.println("Threads Running");
		double counterThread = 0;
		for(Thread T : threads) {
			try {
				T.join();
				counterThread++;
				System.out.println("Completed " + (counterThread/threadNumber)*100 + "%");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Groups Created " + groups.size());
		
		ArrayList<ArrayList<String>> grouping = new ArrayList<ArrayList<String>>();
		grouping.addAll(groups.keySet());
		
		System.out.println("Groups Parsed");
		
		for(ArrayList<String> a : grouping) {
			if(a.size()==3) {
				boolean containsT = false;
				for(String str : a) {
					if(str.charAt(0) == 't') {
						containsT = true;
					}
				}
				if(containsT) {
					containingT.add(a);
				}
			}
		}
		
		System.out.println("Groups Counted\n");
		
		System.out.println("Part 1 ANS:");
		System.out.println("Size 3 groups containing t:\n" + containingT.size());
		
		ArrayList<Integer> sizes = new ArrayList<Integer>();
		for(ArrayList<String> arr : groups.keySet()) {
			sizes.add(arr.size());
		}
		
		System.out.println("\nPart 2 ANS:");
		System.out.println("Biggest group = " + Collections.max(sizes));
		int index = sizes.indexOf(Collections.max(sizes));
		String pwd = "";
		ArrayList<String> biggest = new ArrayList<String>();
		biggest.addAll(grouping.get(index));
		Collections.sort(biggest);
		for(String str : biggest) {
			pwd += str+",";
		}
		pwd = pwd.substring(0,pwd.length()-1);
		System.out.println("PWD:\n" + pwd);

	}
	
	//static int maxLen = 3;
	public static  HashMap<ArrayList<String>, Integer> groups = new HashMap<ArrayList<String>, Integer>();
	@SuppressWarnings("unchecked")
	public static synchronized void getGroupSize(node N, ArrayList<String> gr) {
			gr.add(N.node);
			Collections.sort(gr);
			if(!groups.containsKey(gr)) {
			groups.put(gr, 0);
			/*
			 * if(gr.size()>maxLen) { return; }
			 */
			for(String other : N.getConnections()) {

				if(nodes.get(nodeLocations.get(other)).getConnections().containsAll(gr)) {
					getGroupSize(nodes.get(nodeLocations.get(other)), (ArrayList<String>) gr.clone());
				}
				
			}
		}
	}
	
	static HashMap<String, Integer> nodeLocations = new HashMap<String, Integer>();
	static ArrayList<node> nodes = new ArrayList<node>();
}
class node {
	ArrayList<String> connections = new ArrayList<String>();
	String node;
	public node(String Node){
		this.node = Node;
	}
	
	public ArrayList<String> getConnections(){
		return connections;
	}
	
	public void addConnection(String otherNode) {
		connections.add(otherNode);
	}
}

class runnable extends Thread{
	node n;
	runnable(node N){
		this.n = N;
	}
	public void run() {
		DayTwentyThree.getGroupSize(this.n, new ArrayList<String>());
		//DayTwentyThree.groups.add(null);
	}
}
