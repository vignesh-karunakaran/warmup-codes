
public class Stringsquare {
//first i tryed using array sir but after reading question again i stoped it 
	//
	//this method is refered in website sir
	public static String rev(String s, int i) {
		  int k = i % s.length();
		  return s.substring(k) + s.substring(0, k);
		}
	////
	
	public static void main(final String... args) {
		// TODO Auto-generated method stub
		String s;
		Scanner v=new Scanner(System.in);
		s= v.next();
		for (int i = 0; i < s.length(); i++) {
		    System.out.println(rev(s, i));
		  }

	

}

}
