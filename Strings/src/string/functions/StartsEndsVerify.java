package string.functions;

public class StartsEndsVerify {
	public static void main(String[] args) {
		String a = "Welcome to java class";
		if (a.startsWith("W")) {
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
		String b = "Hai i am Nisha";
		String c = " ";
		
		System.out.println(b.startsWith("w"));
		System.out.println(a.endsWith("class"));
		System.out.println(a.endsWith("java"));
		System.out.println(a.isEmpty());
		System.out.println(c.isEmpty());
		
		
	}
	

}
