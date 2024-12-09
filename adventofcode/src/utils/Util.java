package utils;
import java.util.ArrayList;
import java.util.Arrays;

public class Util {

	public class Strings{
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
			String nums = "0123456789";
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
	}
	
	public class Maths{
		// found out about this on stackOverFlow
		public String baseConvertIntString(int num, int base) {
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
	}
}
