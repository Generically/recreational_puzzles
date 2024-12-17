package adventofcodetwentytwentyfour;

import java.math.BigInteger;
import java.util.ArrayList;

public class DaySeventeenOutputDerv {
	// this is not a general solution for part 2, would need relatively significant rewrite if the program were changed 
	// this works because my input program roughly just divides by 8 and outputs the new modulus each time with a bit of loss (around 0.1%)
	// then again for a general solution you would need to essentially write a decompiler
	static BigInteger regA = new BigInteger("0");	
	static BigInteger regB = new BigInteger("0");
	static BigInteger regC = new BigInteger("0");
	static int[] program = {2,4,1,6,7,5,4,6,1,4,5,5,0,3,3,0};
	static int[] checker = {2,4,1,6,7,5,4,6,1,4,5,5,0,3,3,0};

	static int pointer = 0;
	static int combo = 0;
	static int inst;
	static ArrayList<BigInteger> output = new ArrayList<BigInteger>();
	static ArrayList<BigInteger> ezCheck = new ArrayList<BigInteger>();
	public static void main(String[] args) throws Exception {
		
		BigInteger counter = new BigInteger("0");
		BigInteger max = counter.add(new BigInteger("100"));
		
		for(int h=0; h<program.length;h++) {
			ezCheck.add(0,new BigInteger(""+program[program.length-1-h]));
			//System.out.println(ezCheck);
			while (max.subtract(counter).longValue() > 0) {	
				output = new ArrayList<BigInteger>();
				regA = counter;
				regB = new BigInteger("0");
				regC = new BigInteger("0");
				pointer = 0;
				combo = 0;
				inst = 0;
	
				for(int i=0;pointer < program.length;pointer+=2) {
					inst = program[pointer];
					combo = program[pointer+1];
		
					if(inst == 0) {
						adv();
					}
					else if(inst == 1) {
						bxl();
					}
					else if(inst == 2) {
						bst();
					}
					else if(inst == 3) {
						jnz();
					}
					else if(inst == 4) {
						bxc();
					}
					else if(inst == 5) {
						out();
					}
					else if(inst == 7) {
						cdv();
					}
				}
				if(output.equals(ezCheck)) {
					System.out.println(counter);
					System.out.println(output);
					counter = counter.multiply(new BigInteger("8"));
					max = counter.add(new BigInteger("10000000"));
					break;
				}

				counter = counter.add(new BigInteger("1"));
			}
		}
	}
	
	//got rid of most of the functions as they weren't called by this specific program
	public static void adv() throws Exception {//division
		if(combo < 4) {
			String temp = ""+Math.pow(2, combo);
			temp = temp.substring(0,temp.length()-2);
			regA = (regA.divide(new BigInteger(temp)));
			return;
		}
	}
	
	public static void bxl() {//bitwise XOR
		regB = regB.xor(new BigInteger(""+combo));
	}
	
	public static void bst() {
		if(combo == 4) {
			regB = regA.mod(new BigInteger("8"));		
		}
	}
	
	public static void jnz() {
		if(regA.equals(new BigInteger("0"))) {
			return;
		}
		pointer = combo;
		pointer = pointer-2;
	}
	
	public static void bxc() {
		regB = regB.xor(regC);
	}
	
	public static void out() {
		if(combo == 5) {
			output.add(regB.mod(new BigInteger("8")));
			//System.out.print(regB%8+",");
		}
	}
	
	public static void cdv() {
		if(combo == 5) {
			String temp = ""+Math.pow(2, regB.longValue());
			temp = temp.substring(0,temp.length()-2);
			regC = (regA.divide(new BigInteger(temp)));
		}
	}
}
