package String;

public class StringExample {
	public static void main(String[] args) {
		
//		String s="wasif";
//		s.concat("Arshad");
//		System.out.println(s);
		
//		StringBuffer str = new StringBuffer("Wasif");
//		str.append("arshad");
//		System.out.println(str);
		
		String s1 = new String("wasif");
		String s2 = new String("wasif");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3="wasif";
		String s4="wasif";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));


	}

}
