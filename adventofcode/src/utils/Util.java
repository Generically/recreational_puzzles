package utils;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Util {

	public class Strings{
		static HashMap<String, Long> map = new HashMap<String, Long>();
		static ArrayList<String> patters = new ArrayList<String>();
		@SuppressWarnings("unchecked")
		public static Long possiblePatterns(String design, ArrayList<String> patts) {
			patters = (ArrayList<String>) patts.clone();
			return recurPossiblePatterns(design);		
		}
		public static Long recurPossiblePatterns(String design) { 
			long counter = 0;
			for(String s : patters) {
				if(design.equals("")) {
					return 1L;
				}
				if(design.indexOf(s) == 0) {
					if(map.containsKey(design)) {
						return map.get(design);
					}
					else {
						counter += recurPossiblePatterns(design.replaceFirst(s, ""));
					}
				}
			}
			map.putIfAbsent(design, counter);
			return counter;
		}
		
		public static ArrayList<String> recur(ArrayList<ArrayList<String>> set, ArrayList<String> output, String str, int[] previous, boolean setting) {
			if(setting) {
				output.add(str);
				//counterP.add(str);
			}
			int[] location = Util.Strings.strToIntarr(str);
			//System.out.println(str);
			try {
				if(set.get(location[0]).get(location[1]).equals(set.get(location[0]+1).get(location[1])) && output.contains((location[0]+1+","+(location[1]))) == false ) {
						recur(set, output, (location[0]+1)+","+location[1], location, setting);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			try {
				if(set.get(location[0]).get(location[1]).equals(set.get(location[0]-1).get(location[1])) && output.contains((location[0]-1+","+(location[1]))) == false) {
						recur(set, output,(location[0]-1)+","+location[1], location, setting);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			try {
				if(set.get(location[0]).get(location[1]).equals(set.get(location[0]).get(location[1]+1)) && output.contains((location[0]+","+(location[1]+1))) == false) {
						recur(set, output,location[0]+","+(location[1]+1), location, setting);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			try {
				if(set.get(location[0]).get(location[1]).equals(set.get(location[0]).get(location[1]-1)) && output.contains((location[0]+","+(location[1]-1))) == false) {
						recur(set, output,location[0]+","+(location[1]-1), location, setting);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
			
			return output;
		}
		
		
		public static String[] split(String str, String splitChar) {
			int len = Util.Strings.stringCounter(str, splitChar);
			String[] splitStrings = new String[len+1];
			for(int i=0; i<len; i++) {
				splitStrings[i] = str.substring(0,str.indexOf(splitChar));
				str = str.substring(str.indexOf(splitChar)+splitChar.length());
			}

			return splitStrings;
		}

		
		public static int stringCounter(String str, String chars) {
			// takes in two strings and returns how many times chars occurs in str
			// returns a default value of the most times a value occured
			int count = 0;
			int index = str.indexOf(chars);
			while (index != -1){
				str = str.substring(index+chars.length());
				count++;
				index = str.indexOf(chars); 
					
			}
				return count;
		}		
	
		public static String removeDuplicate(String str) {
		for(int i = 0; i < str.length(); i++) {
			String character = ""+str.charAt(i);
			if(str.indexOf(character) == str.lastIndexOf(character)) {
				continue;
			}
			str = str.replaceFirst(character, "");
		}
		return str;
	}
	
		public static int[] letterStreakCounter(String str, int subStringSize) {
			int[] arr = new int[0];
			int counter = 0;
			for (int i = subStringSize; i < str.length()-(subStringSize-1); i++) {
				System.out.println(str.substring(i,i+subStringSize) + "\t" + str.substring(i-subStringSize,i));
				if(str.substring(i,i+subStringSize).equals(str.substring(i-subStringSize,i))) {
					counter++;
					continue;
				}
				if(counter != 0) {
					arr = Arrays.copyOf(arr, arr.length+1);
					arr[arr.length-1] = counter+1;
					counter = 0;
				}
			}
			if(counter != 0) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = counter+1;
				counter = 0;
			}
			if(arr.length == 0) {
				arr = Arrays.copyOf(arr, arr.length+1);
				arr[arr.length-1] = 0;
			}
			return arr;			
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public static ArrayList fullCharCounter(String str, String chars) {
			// I'll fix the warnings later
			ArrayList list = new ArrayList();
			if(chars == null) {
				for(int i = 0; i < str.length(); i++) {
					if(list.contains(str.charAt(i))) {
						//System.out.println(""+ list.get(str.indexOf(str.charAt(i))));
						list.set(list.indexOf(str.charAt(i))+1, Integer.parseInt(""+ list.get(list.indexOf(str.charAt(i))+1))+1);
					}
					else {
						list.add(str.charAt(i));
						list.add(1);
					}
				}
				return list;
			}
			
			for(int i = 0; i < chars.length(); i++) {
				list.add(chars.charAt(i));
				list.add(stringCounter(str, ""+chars.charAt(i)));
			}
			
			return list;
		}
		
		public static int[] strToIntarr(String str) {
			// string to int[]
			String nums = "0123456789-";
			String tempStr = "";
			int[] output = new int[0];
			
			for(int i = 0; i < str.length(); i++) {
				if(nums.indexOf(str.charAt(i)) != -1){
					tempStr += str.charAt(i);
				}
				else {
					if(tempStr != "") {
						output = Arrays.copyOf(output, output.length+1);
						output[output.length-1] = Integer.parseInt(tempStr);
						tempStr="";
					}
				}
			}
			if(tempStr != "") {
				output = Arrays.copyOf(output, output.length+1);
				output[output.length-1] = Integer.parseInt(tempStr);
				tempStr="";
			}
			return output;
		}
		
		public static int[] charCounter(String str, char[] chars) {
			int[] count = new int[chars.length];
			for(int i = 0; i < chars.length; i++) {
				for(int j = 0; j < str.length(); j++) {
					if(str.charAt(j) == chars[i]) {
						count[i]++;
					}
				}
			}
			return count;	
		}

		public static boolean repeatsWithLettersInbetween(String str, int subStrLength, int minGapBetween, int maxGapBetween) {
			
			String temp;
			if(maxGapBetween == -1) {
				for(int i = subStrLength; i < str.length()+1-subStrLength; i++) {
					if(str.charAt(i) == ']') {
						continue;
					}
					try {
						if(i-minGapBetween >= 0) {
							temp = str.replaceFirst(str.substring(i, subStrLength+i+minGapBetween), "]");
						}
						else if(subStrLength+i+minGapBetween >= str.length()) {
							temp = str.replaceFirst(str.substring(i-minGapBetween, subStrLength+i+minGapBetween), "]");
						}
						else {
							temp = str.replaceFirst(str.substring(i-minGapBetween, str.length()), "]");
						}
						
						if(temp.contains(str.substring(i, i+subStrLength))) {
							return true;
						}
					}
					catch(Exception E){
						return false;
					}
				}
				
				return false;
			}
		if(maxGapBetween < minGapBetween) {
			return false;
		}
		
		for(int i = subStrLength-1; i < str.length()+1-subStrLength; i++) {
			try {
				temp = str.substring(i-subStrLength,i+subStrLength+maxGapBetween);
				if(temp.substring(0,subStrLength).equals(temp.substring(temp.length()-subStrLength,temp.length()))) {
					return true;
				}
			}
			catch(Exception E){}
		}
		return false;
		}
		
		public static String intToStr(int[] list) {
			String out = "";
			for(int i = 0; i < list.length; i++) {
				out+=""+list[i];
				if(i < list.length-1) {
					out+=",";
				}
			}
			//out = out.
			return out;
		}
		
		public static boolean twoDArrayListContains(ArrayList<ArrayList<String>> list, String str) {
			for(ArrayList<String> listerator : list) {//we want failfast
				if(listerator.contains(str)) {
					return true;
				}
			}
			return false;
		}
	}
	
	public class Maths{
		
		public static int orthogonalBFS(int[][] grid, int[] start, int[] end) {     
	        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
	        Queue<int[]> map =new LinkedList<>();
	        int rMax = grid.length;
	        int cMax = grid[0].length;
	        
	        if(grid[start[0]][start[1]]==1) return -1; 
	        
	        map.offer(new int[] {start[0],start[1],1});
	        
	        while(!map.isEmpty()){
	            int[] location = map.poll();
	            int r = location[0];
	            int c = location[1];
	            int distance = location[2];
	            if(r==end[0] && c==end[1]) return distance;
	            
	            for(int[] d : dir){
	                int r2 = r + d[0];
	                int c2 = c + d[1];
	                if(r2<rMax && r2>=0 && c2<cMax && c2>=0 && grid[r2][c2]==0){
	                    map.offer(new int[] {r2,c2,distance+1});
	                    grid[r2][c2] = 8;
	                }
	            }
	        }
	        return -1;
	    }
		
		
		public int BFS(int[][] grid, int[] start, int[] end) {     
	        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1},{1,1},{-1,1},{1,-1},{-1,-1}};
	        Queue<int[]> map =new LinkedList<>();
	        int rMax = grid.length;
	        int cMax = grid[0].length;
	        
	        if(grid[start[0]][start[1]]==1) return -1; 
	        
	        map.offer(new int[] {start[0],start[1],1});
	        
	        while(!map.isEmpty()){
	            int[] location = map.poll();
	            int r = location[0];
	            int c = location[1];
	            int distance = location[2];
	            if(r==end[0] && c==end[1]) return distance;
	            
	            for(int[] d : dir){
	                int r2 = r + d[0];
	                int c2 = c + d[1];
	                if(r2<rMax && r2>=0 && c2<cMax && c2>=0 && grid[r2][c2]==0){
	                    map.offer(new int[] {r2,c2,distance+1});
	                    grid[r2][c2] = 8;
	                }
	            }
	        }
	        return -1;
	    }
		
		public static double[] findIntersection(double a1, double b1, long c1, double a2, double b2, long c2) { //find intersect of two lines of equation ax+by=c
			double determinant = a1 * b2 - a2 * b1;

	        if (determinant == 0) {
	            return null;
	        }
	        double x = (b2 * c1 - b1 * c2) / determinant;
	        double y = (a1 * c2 - a2 * c1) / determinant;

	        return new double[] {x,y};
	    }
		
		public static ArrayList<String> perimiterFromPoints(ArrayList<String> points) {
			ArrayList<Integer[]> P = new ArrayList<Integer[]>();
			for(String i : points) {
				P.add(new Integer[] {Util.Strings.strToIntarr(i)[0], Util.Strings.strToIntarr(i)[1]});
			}
			// P is the set of points in each garden
			// i is each point of the garden
			ArrayList<String> perm = new ArrayList<String>();
				for(Integer[] i : P) {
					if(!points.contains((i[0]+1)+","+(i[1]))) {
						perm.add((i[0]+1)+","+(i[1])+",0");
					}
					if(!points.contains((i[0]-1)+","+(i[1]))) {
						perm.add((i[0]-1)+","+(i[1])+",1");
					}
					if(!points.contains((i[0])+","+(i[1]+1))) {
						perm.add((i[0])+","+(i[1]+1)+",2");
					}
					if(!points.contains((i[0])+","+(i[1]-1))) {
						perm.add((i[0])+","+(i[1]-1)+",3");
					}
				}
			return perm;
		}
		
		// counter for the number of groups of objects with exist next to eachOther
		public static int removeConnectingCounter(ArrayList<String> array) {
			int index = 0;
			int count = 0;
			while(array.size()>0) {
				int[] curr = Util.Strings.strToIntarr(array.get(0)); // if there exists a point next to the one im at which shares its direction
				array.remove((curr[0])+","+(curr[1])+","+curr[2]);

				
				if(array.contains((curr[0]+1)+","+(curr[1])+","+curr[2])) {
					array = removeConnecting(array, index);
				}
				if(array.contains((curr[0]-1)+","+(curr[1])+","+curr[2])) {
					array = removeConnecting(array, index);
				}
				if(array.contains((curr[0])+","+(curr[1]+1)+","+curr[2])) {
					array = removeConnecting(array, index);
				}
				if(array.contains((curr[0])+","+(curr[1]-1)+","+curr[2])) {
					array = removeConnecting(array, index);
				}
				count++;
			}
			return count;
		}
		// removes groups from the array, a group is a set of elements which differ from each other by 1 in an orthogonal direction
		public static ArrayList<String> removeConnecting(ArrayList<String> array, int index) {
			int[] curr = Util.Strings.strToIntarr(array.get(index)); // if there exists a point next to the one im at which shares its direction
			
			array.remove((curr[0])+","+(curr[1])+","+curr[2]);
			if(array.contains((curr[0]+1)+","+(curr[1])+","+curr[2])) {
				array = removeConnecting(array, index);
			}
			if(array.contains((curr[0]-1)+","+(curr[1])+","+curr[2])) {
				array = removeConnecting(array, index);
			}
			if(array.contains((curr[0])+","+(curr[1]+1)+","+curr[2])) {
				array = removeConnecting(array, index);
			}
			if(array.contains((curr[0])+","+(curr[1]-1)+","+curr[2])) {
				array = removeConnecting(array, index);
			}
			return array;
		}
		
		// found out about this on stackOverFlow
		public static String baseConvertIntString(int num, int base) {
		    return Integer.toString(num, base);
		}
		
		public static int sumIntarr(int[] arr) {
			int output = 0;
			for (int i = 0; i < arr.length; i++) {
				output += arr[i];
			}
			return output;
		}
		
		public static int[] firstMinimumVal(int[] list) {
			// takes in a list of numbers and returns the first occurrence of the minimum value along with its index
			int[] min = {list[0],0};
			for(int i = 1; i < list.length; i++) {
				if(list[i] < min[0]) {
					min[0]=list[i];
					min[1]=i;
				}
			}
			return min;
		}
		
		public static int[] firstMaximalVal(int[] list) {
			int[] max = {list[0],0};
			for(int i = 1; i < list.length; i++) {
				if(list[i] > max[0]) {
					max[0]=list[i];
					max[1]=i;
				}
			}
			return max;
		}
		
		
		// recursively goes through the HashMap and generates an ArrayList of the groups which exist in the graph (a group is defined as a set of keys which differ by 1 which share the same value)
		public static ArrayList<String> recursiveGrouping(HashMap<String, String> set, String str, int[] previous, ArrayList<String> output) {
			output.add(str);
			int[] location = Util.Strings.strToIntarr(str);
				if(set.get(location[0]+","+location[1]).equals(set.get((location[0]+1)+","+location[1])) && output.contains((location[0]+1+","+(location[1]))) == false ) {
					output = (recursiveGrouping(set, (location[0]+1)+","+location[1], location, output));
				}
				if(set.get(location[0]+","+location[1]).equals(set.get((location[0]-1)+","+location[1])) && output.contains((location[0]-1+","+(location[1]))) == false) {
					output = (recursiveGrouping(set, (location[0]-1)+","+location[1], location, output));
				}
				if(set.get(location[0]+","+location[1]).equals(set.get(location[0]+","+(location[1]+1))) && output.contains((location[0]+","+(location[1]+1))) == false) {
					output = (recursiveGrouping(set, location[0]+","+(location[1]+1), location, output));
				}
				if(set.get(location[0]+","+location[1]).equals(set.get(location[0]+","+(location[1]-1))) && output.contains((location[0]+","+(location[1]-1))) == false) {
					output = (recursiveGrouping(set, location[0]+","+(location[1]-1), location, output));
				}
			
			return output;
		}
	}
}
