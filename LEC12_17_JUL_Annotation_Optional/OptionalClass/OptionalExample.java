package Optional_17_07;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		
		String s1="wasif";
		String s2="";
		String s3=null;
//		System.out.println(s1.length());
//		System.out.println(s2.length());
//		System.out.println(s3.length());
		
//		 Optional<String> op = Optional.ofNullable(s3);
////		 System.out.println(op.orElse("Hello"));
//		 if(op.isPresent())
//		 {
//			 System.out.println(op.get());
//		 }
		 
		 Optional<String> ops = Optional.empty();
		 System.out.println(ops.get());
		 
		 


	}

}
