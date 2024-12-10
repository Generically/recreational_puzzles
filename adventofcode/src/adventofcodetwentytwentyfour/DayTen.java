package adventofcodetwentytwentyfour;

import java.util.ArrayList;
import java.util.HashMap;
import utils.Util;

public class DayTen {
	static HashMap<String, String> map = new HashMap<String, String>();
	static ArrayList<String> nines = new ArrayList<String>();
	public static void main(String[] args) {
		String input = "8980123016789892101689654329890101234676787803452543078309879871001876521096558901690196301216541016076298976543498764391252108749236543212512534785456438732128034321965874786510340344567430762364201743043787676569742347654305432189145510063210478010234983165891021657801806562345498156932010507207432278078691898707896756723894376561012890136910951078761212588765476598587292993234542384212345430349965106230349438787010503347302105896543223423212123456765432761245621987698734511103430907658789010189210890345678012360023456789834965412367800170123998710987643210987012345632345671156543781032109875696545670123654098943278521269210349567678743098709874310765456943035432105843856123210781238122345432103487410345676292500110569014901225621001259612987859210104322348990543031073430876650345698876521589656768761294298652198234395678734503067834385987098510556923219878710564321478632129430678762345781230870160145065456954101052178965015699084556125323217036787801234326903432678789964103445499812510894310569521276541065487321345678121002376520987843038903213038981023876703491247891034510789081010212743201098581458035678012362369213232130165012012349876794566921017045435454104567887612123294508767543289813032106998743899654300210321789865417652212367786701210107654110176567654670874370547898512310329874322178945410308292348965670340342347878924300123432321910143743498123065945656901542323210985654565463218765217687654334567149812787672347435430101419859874322347805670369018167892101561230134812301109894566845210905890110567876522100234527874347895432183432102345898543101110567898543210";
				  
		String line = "5432183432102345898543101110567898543210";
		
		int len = line.length();
		ArrayList<String> zeros = new ArrayList<String>();
		
		for(int i =0; i < len; i++) {
			for(int j=0;j<len;j++) {
				map.put(j+","+i,""+input.charAt(i*len+j));
				if(input.charAt(i*len+j) == '0') {
					zeros.add(j+","+i);
				}
			}
		}
		int total = 0;
		for(int i = 0; i < zeros.size(); i++) {
			recur(zeros.get(i), new int[] {0,0});
			
			total += nines.size();
			System.out.println(nines.size());
			for(String r : nines) {
				System.out.println(r);
			}
			nines = new ArrayList<String>();
		}	
		
		System.out.println(total);
	}
	
	public static void recur(String str, int[] previous) {
		if(map.get(str).equals("9")) {
			// to get the part 1 answer uncomment this if statement
			//if(nines.contains(str)!=true) {
				nines.add(str);
			//}
		}
		int[] location = Util.Strings.strToIntarr(str);
		try {
			if((Integer.parseInt(map.get(location[0]+","+location[1]))-Integer.parseInt(map.get((location[0]+1)+","+location[1]))) == -1) {
					recur((location[0]+1)+","+location[1], location);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if((Integer.parseInt(map.get(location[0]+","+location[1]))-Integer.parseInt(map.get((location[0]-1)+","+location[1]))) == -1) {
					recur((location[0]-1)+","+location[1], location);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if((Integer.parseInt(map.get(location[0]+","+location[1]))-Integer.parseInt(map.get(location[0]+","+(location[1]+1)))) == -1) {
					recur(location[0]+","+(location[1]+1), location);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		try {
			if((Integer.parseInt(map.get(location[0]+","+location[1]))-Integer.parseInt(map.get(location[0]+","+(location[1]-1)))) == -1) {
					recur(location[0]+","+(location[1]-1), location);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
