package string.functions;

public class Equals {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "Green Technology";
		String s5 = "GreenTechnology";
		String s6 = "Nisha";
		String s7 = "nisha";		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s4.equals(s5));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s6.equalsIgnoreCase(s7));
		
		String s = "Velmurugank451@gmail.com";
	    if (s.contains("@")) {
	    	System.out.println("valid email id");			
		}		    
	    String ss = "Nishakerala24@gmail.com";
	    if (ss.contains("gmail")) {
	    	System.out.println(ss.replace("gmail", "yahoo"));		
		}
		
	}

}
