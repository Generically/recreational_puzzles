package countSteppingNumbersInRange;

import java.math.BigInteger;
import java.util.HashMap;

public class BigIntegerGeneralizedMemoizedOptimizedBruteForce {
	public static BigInteger count = new BigInteger("0");
	static String maximum = "";
	
	
	public int countSteppingNumbers(String low, String high) { // for LeetCode :)
        BigInteger ans = calculate(low, high);
        return ans.mod(new BigInteger("1000000007")).intValueExact();
    }

	public static BigInteger calculate(String min, String max) {
		BigInteger sumTotal = new BigInteger("0");
		
		maximum = max;
		count = BigInteger.ZERO;
		for(int i = 1; i <= 9; ++i) {
			Storage = new HashMap<String, BigInteger>();

			recur(i, 1, "");
		}
		
		sumTotal = sumTotal.add(count);
		
		min = new BigInteger(min).subtract(BigInteger.ONE).toString();
		
		
		maximum = min;
		count = BigInteger.ZERO;
		Storage = new HashMap<String, BigInteger>();
		for(int i = 1; i <= 9; ++i) {
			recur(i, 1, "");
		}
		
		sumTotal = sumTotal.subtract(count);
		
		return sumTotal;
	}
	
 	static HashMap<String, BigInteger> Storage = new HashMap<String, BigInteger>();
	public static BigInteger recur(int number, int depth, String recall) {

		if(maximum.startsWith(recall)) {Storage = new HashMap<String, BigInteger>();}
		
		recall += (""+number);
		BigInteger localCount = BigInteger.ZERO;
		
		if(recall.equals(maximum)) {
			count = count.add(BigInteger.ONE);
			return BigInteger.ZERO;
		}
		if(isGreater(recall, maximum)) {
			return BigInteger.ZERO;
		}

		if(Storage.containsKey(depth+","+number)) {
			localCount = Storage.get(depth+","+number); 
			count = count.add(localCount.add(BigInteger.ONE)); 
			return localCount.add(BigInteger.ONE);
		}

		
		count = count.add(BigInteger.ONE);
		
		if(number-1>=0) {
			localCount = recur(number-1, depth+1, recall);
		}
		
		if(number+1<=9) {
			localCount = localCount.add(recur(number+1, depth+1, recall));
		}
		
		Storage.putIfAbsent(depth+","+number, localCount);
		return localCount.add(BigInteger.ONE);
	}
	
	private static boolean isGreater(String a, String b) {
		if(a.length() > b.length()) {return true;}
		if(a.length() < b.length()) {return false;}
		
		for(int i = 0; i < a.length(); i++) {
			if(Integer.parseInt(""+a.charAt(i)) > Integer.parseInt(""+b.charAt(i))) {
				return true;
			}
			else if(Integer.parseInt(""+a.charAt(i)) < Integer.parseInt(""+b.charAt(i))){
				return false;
			}
		}
		return false;
	}
}
