package threaded_computation;

public class ThreadedMethod extends Thread{

	//I would be almost willing to bet I missed something here, it just seems like there's probably be an edge case I missed somewhere but I can't find one
	
	static int cases;
	static int num;
	static int middle;
	static int end;
	long totalTime;
	
	public void main(String[] args) {
		num = (int)(Math.random()*151);
		if(num==0) {
			middle = 19;
			end = 91; //swap odd special case 0
			cases=0;
		}
		else if(num < 10) {
			middle = num*100+19;
			end = 910+(num%10); //swap odd special case
			cases=0;
		}
		else if(num < 19) {
			middle = num*100+19;
			end = 9010+num/10+(num%10)*100; //swap odd
			cases=0;
			}
		else if(num < 120 && num > 99) { 
			middle = (num-100)*100+20; 
			end = middle+1; // swap even
			cases = 1;
			}
		else {
			middle=num+1900; 
			if(middle%2==0) {
				end=middle-middle%10+1; cases = 5; // no swap even
				cases = 2;
			}
			else {
				end = middle-(middle/1000)*1000-(middle%10)+(middle%10)*1000+(middle/1000); //no swap odd
				cases = 3;
			}
		}
	}
	
	public void run() {
		main(null);
		switch(cases) {
		case 0: //case 0 is when swap odd
			System.out.printf("Number = %d\nLeft two digits = %s\nRight two digits = %s\n%s > %s so swap\nNew number = %d\n%d is odd so swap leftmost digit (%d) with rightmost digit (%d)\nEnd value = %d\n\n", num+1900, (num+1900+"").substring(0, 2) , (1900+num+"").substring(2,4), (num+1900+"").substring(0, 2), (1900+num+"").substring(2,4), middle, middle, 9, num%10, end);
			break;
		case 1: //case 1 is when swap even
			System.out.printf("Number = %d\nLeft two digits = %s\nRight two digits = %s\n%s > %s so swap\nNew number = %d\n%d is even so set last digit to 1\nEnd value = %d\n\n", num+1900, (num+1900+"").substring(0, 2) , (1900+num+"").substring(2,4), (num+1900+"").substring(0, 2), (1900+num+"").substring(2,4), middle, middle, end);
			break;
		case 2: //case 2 is when no swap even
			System.out.printf("Number = %d\nLeft two digits = %s\nRight two digits = %s\n%s <= %s so NO swap\nNew number = %d\n%d is even so set last digit to 1\nEnd value = %d\n\n", num+1900, (num+1900+"").substring(0, 2) , (1900+num+"").substring(2,4), (num+1900+"").substring(0, 2), (1900+num+"").substring(2,4), middle, middle, end);
			break;
		case 3: //case 3 is when no swap odd
			System.out.printf("Number = %d\nLeft two digits = %s\nRight two digits = %s\n%s <= %s so NO swap\nNew number = %d\n%d is odd so swap leftmost digit (%s) with rightmost digit (%d)\nEnd value = %d\n\n", num+1900, (num+1900+"").substring(0, 2) , (1900+num+"").substring(2,4), (num+1900+"").substring(0, 2), (1900+num+"").substring(2,4), middle, middle, (middle+"").substring(0,1), num%10, end);
			break;
		}
	}
}