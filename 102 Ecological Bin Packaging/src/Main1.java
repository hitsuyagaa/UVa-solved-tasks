import java.util.Scanner;
 
class Main1 {
	public static void main(String[] args) throws Exception {
		Scanner in=new Scanner(System.in);
		while(in.hasNextInt()) {
			int b1=in.nextInt();
			int g1=in.nextInt();
			int c1=in.nextInt();
			int b2=in.nextInt();
			int g2=in.nextInt();
			int c2=in.nextInt();
			int b3=in.nextInt();
			int g3=in.nextInt();
			int c3=in.nextInt();
			int total=b1+g1+c1+b2+g2+c2+b3+g3+c3;
 
			String ret="BCG";
			int maxv=b1+c2+g3;
			if(maxv<b1+g2+c3) {
				ret="BGC";
				maxv=b1+g2+c3;
			}
			if(maxv<c1+b2+g3) {
				ret="CBG";
				maxv=c1+b2+g3;
			}
			if(maxv<c1+g2+b3) {
				ret="CGB";
				maxv=c1+g2+b3;
			}
			if(maxv<g1+b2+c3) {
				ret="GBC";
				maxv=g1+b2+c3;
			}
			if(maxv<g1+c2+b3) {
				ret="GCB";
				maxv=g1+c2+b3;
			}
			System.out.printf("%s %d%n", ret, total-maxv);
		}
		in.close();
	}
}