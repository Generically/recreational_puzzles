package adventofcodetwentytwentyfour;
import utils.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class DayEight {
	public static void main(String[] args) {
		String input = "...............e...........j6....................."
				+ ".....1...............................t.....i......"
				+ ".....4.......3..............x..tL......m.........."
				+ ".......L.....................Dxj.................."
				+ "4....X..................F.....................m..."
				+ ".............4.......x....F........k.............."
				+ "......3...................t..........i.........Z.."
				+ "....L..................y.....F..e.....Z..........."
				+ "X.............1........C..........i...D..........."
				+ "........4.....................D.....k.X...m......."
				+ "...1...............D........e......6.............."
				+ "...3.Y...................................m8......."
				+ "..OL.........................x....Z....g.........."
				+ "....3......5.........................6j..........."
				+ "...................J..5r.F..k...y................."
				+ ".......................................Z..a......."
				+ "...........................5........j.........a.u."
				+ "...p..............Y....X.........................."
				+ "...O.........................kd..................."
				+ "........................t.................i......."
				+ "..................J..............u...........z...."
				+ ".O.....9.............J..............p..u.........."
				+ ".....9............................................"
				+ "l...6.....1........e......I................a......"
				+ "...................................az............."
				+ "........M.......J...................gI....z......."
				+ ".......Y...l...........p......g....d.......W......"
				+ "........5l....9................d.....g............"
				+ ".A....9.l.Y............I..............B.......s..."
				+ "..................................K.....B........."
				+ "....M.............7.......8..........h.....K......"
				+ ".......0f...oc..............G...d7.......z...s..yW"
				+ "...M........0...........Gf.....................T.."
				+ "................r......G..................w....h.."
				+ "...........cP................G.8.R..............T."
				+ ".................A.............N............u..B.."
				+ "..H.c..b............................K...CB.....y.."
				+ "......c...bP...2............7..K.................."
				+ "......b.o....0.......P.............s........h.R..."
				+ "......2........f..S........8.....................R"
				+ "U....2..............p..............7.............."
				+ ".HE..b......A.............N..............w....C..."
				+ "................................N.............w..."
				+ ".........E...........M................W.......T..."
				+ "......E...rS2...........W....................N...."
				+ ".....SP..n.....r..0..............................."
				+ ".....H..............A............................w"
				+ "..........n..U....................s..............."
				+ "..n.So.....U................f....................."
				+ "Ho................................................";
		int count = 0;
		String temp = "Ho................................................";
		int len = temp.length();
		// y=mx+b 
		// m = (y2-y1)/(x2-x1)
		// b = y1-(m)*(x1)
		HashMap<String, String> str = new HashMap<String, String>();
		for(int i =0; i < len; i++) {
			for(int j=0;j<len;j++) {
				str.put(j+","+i,""+input.charAt(i*len+j));
			}
		}
		
		
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				if(input.charAt(i*len+j) != '.') {
					int x1 = j;
					int y1 = i;
					
					for(int r = 0; r < input.length(); r++) {
						int x2 = (r)%len;
						int y2 = (r-x2)/len;
						if(x1 != x2 || y1 != y2) {
							if(input.charAt(y2*len+x2) == input.charAt(i*len+j)) {
								//System.out.println(x2+", "+y2+", "+r+", "+input.charAt(i*len+j)+", "+input.charAt(y2*len+x2));
								double m = -1;
								try {
									m = ((y2-y1)/(x2-x1*1.0));
									//System.out.println((y2-y1)+"/"+(x2-x1));
									//System.out.println(((y2-y1)/(x2-x1*1.0)));
								}
								catch (Exception e) {
									System.out.println(e);
									m = 0;// TODO: handle exception
								}
								double b = y1 - m*x1;
								/* partOne version
							 	int px = x1+(x1-x2);
								int py =(int) Math.round((m*px)+b);
								System.out.println(px+", "+py);
								if(str.get(px+","+py)!=null) {
									str.put(px+","+py, "#");
								}
								 */
								for(int z = 0; z <  len; z++) {
									int px = x1+z*(x1-x2);
									int py =(int) Math.round((m*px)+b);
									System.out.println(px+", "+py);
									if(str.get(px+","+py)!=null) {
										str.put(px+","+py, "#");
									}
								}
							}
						}
					}
				}
			}
		}
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				System.out.print(str.get(j+","+i));
				if(str.get(j+","+i).equals("#")) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.println(str.size()+", "+input.length()+", "+count);
	}
}