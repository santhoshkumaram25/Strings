package string.functions;

import javax.sql.rowset.Joinable;

public class Strings {
	public static void main(String[] args) {
		String a ="Automation";
		System.out.println(a.length());
		System.out.println(a.charAt(6));
		System.out.println(a.indexOf('t'));//index of string
		String b = "1234567890";
		System.out.println(b.indexOf('1'));//index of int
		System.out.println(b.lastIndexOf('1'));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.contains("ma"));
		String c ="automat ion";
		System.out.println(a.contains(c));
		System.out.println(a.startsWith("A"));
		System.out.println(a.endsWith("n"));
		System.out.println(c.trim());//remove the unwanted space from the string
		System.out.println(c.replaceFirst("ion","ic"));
		System.out.println(a.replaceAll("Auto","****"));
		System.out.println(a.concat(b));
		System.out.println(a.substring(1));
		System.out.println(a.substring(1, 9));
		String d = "@";
		String e = "Axess";
		String f = String.join("-", a,d, e);
		System.out.println(f);
		System.out.println(a.isEmpty());	
	}
}
