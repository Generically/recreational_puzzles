package adventofcodetwentytwentyfour;

import java.util.ArrayList;

import utils.Util;

public class DaySeventeen {

	static long regA = 5420376L;
	static long regB = 0;
	static long regC = 0;
	static int[] program = {2,4,1,6,7,5,4,6,1,4,5,5,0,3,3,0};
	static int[] checker =           {3,3,0};

	//2,4,1,6,7,5,4,6,1,4,5,5,0,3,3,0
	//x,x,x,x,x,5,4,6,1,4,5,5,0,3,3,0
	//				6, 1, 4, 5, 5, 0, 3, 3, 0
	//677547, 5420380, 43363047, 346904376, 2775233106, 22201864848
	
	
//	static int regA = 117440;
//	static int regB = 0;
//	static int regC = 0;
//	static int[] program = {0,3,5,4,3,0};
	static int pointer = 0;
	static int combo = 0;
	static int inst;
	static ArrayList<Integer> output = new ArrayList<Integer>();
	static ArrayList<Integer> ezCheck = new ArrayList<Integer>();
	public static void main(String[] args) {
		for(int i : checker) {
			ezCheck.add(i);
		}
		/*
		 * Combo operands 0 through 3 represent literal values 0 through 3.
			Combo operand 4 represents the value of register A.
			Combo operand 5 represents the value of register B.
			Combo operand 6 represents the value of register C.
			Combo operand 7 is reserved and will not appear in valid programs.
		 */
		long counter = 1*8;
		long max = 137;
		while (counter > 0) {	
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			output = new ArrayList<Integer>();
			regA = counter;
			regB = 0;
			regC = 0;
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
				else if(inst == 6) {
					bdv();
				}
				else if(inst == 7) {
					cdv();
				}
				//pointer = pointer+2;
			}
//			System.out.println(output);
//			System.out.println(counter);
			//ezCheck.add(0,output.get(0));
			
			//System.out.println("\n"+ezCheck);
			//System.out.println(output);
			if(output.equals(ezCheck)) {
				System.out.println(output);
				System.out.println(counter);
			}
			//ezCheck.remove(0);
			counter++;
//			if(counter%500000==0) {
//				System.out.println(counter);
//			}
		}
		//System.out.println(counter-1);
		//System.out.println("\n"+regA+","+regB+","+regC+","+pointer);
	}

	public static void adv() {//division
		if(combo < 4) {
			regA = (Math.floorDiv(regA,(long) Math.pow(2, combo)));
		}
		else if(combo == 4) {
			regA = (long) (regA/(Math.pow(2, regA)));
		}
		else if(combo == 5) {
			regA = (long) (regA/(Math.pow(2, regB)));
		}
		else if(combo == 6) {
			regA = (long) (regA/(Math.pow(2, regC)));
		}
	}
	
	public static void bxl() {//bitwise XOR
		regB = regB ^ combo;
	}
	
	public static void bst() {
		if(combo < 4) {
			regB = combo%8;
		}
		else if(combo == 4) {
			regB = regA%8;		
		}
		else if(combo == 5) {
			regB = regB%8;		
		}
		else if(combo == 6) {
			regB = regC%8;		
		}
	}
	
	public static void jnz() {
		if(regA == 0) {
			return;
		}
		pointer = combo;
		pointer = pointer-2;
	}
	
	public static void bxc() {
		regB = regB ^ regC;
	}
	
	public static void out() {
		if(combo < 4) {
			output.add(combo%8);
			//System.out.print(combo%8+",");
		}
		else if(combo == 4) {
			output.add((int) (regA%8));
			//System.out.print(regA%8+",");
		}
		else if(combo == 5) {
			output.add((int) (regB%8));
			//System.out.print(regB%8+",");
		}
		else if(combo == 6) {
			output.add((int) (regC%8));
			//System.out.print(regC%8+",");
		}
	}
	
	public static void bdv() {
		if(combo < 4) {
			regB = (int) (regA/(Math.pow(2, inst)));
		}
		else if(combo == 4) {
			regB = (int) (regA/(Math.pow(2, regA)));
		}
		else if(combo == 5) {
			regB = (int) (regA/(Math.pow(2, regB)));
		}
		else if(combo == 6) {
			regB = (int) (regA/(Math.pow(2, regC)));
		}
	}
	
	public static void cdv() {
		if(combo < 4) {
			regC = (int) (regA/(Math.pow(2, inst)));
		}
		else if(combo == 4) {
			regC = (int) (regA/(Math.pow(2, regA)));
		}
		else if(combo == 5) {
			regC = (int) (regA/(Math.pow(2, regB)));
		}
		else if(combo == 6) {
			regC = (int) (regA/(Math.pow(2, regC)));
		}
	}
}
