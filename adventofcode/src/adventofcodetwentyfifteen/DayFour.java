package adventofcodetwentyfifteen;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DayFour {
	// it would take like 2 mins to makes this multithread but it took 20 seconds to run and i only need the output once so its fine
	public static void main(String[] args) throws NoSuchAlgorithmException {
		MessageDigest md = java.security.MessageDigest.getInstance("MD5");
		String input = "yzbqklnj";
		byte[] bytes = input.getBytes();
		bytes = md.digest(bytes);
		String output = "";
		
		int iter = 0;
		while (true){
			input = "yzbqklnj" + iter;
			bytes = input.getBytes();
			bytes = md.digest(bytes);
			output = "";
			for(int i = 0; i < bytes.length; i ++) {
				output += String.format("%02x",bytes[i]);
			}
			if(output.substring(0,6).equals("000000")) {
				break;
			}
			iter+=1;
		}	
		System.out.println(input + "\n" + output + "\n" + iter);
	}

}
