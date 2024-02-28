package string.functions;

import java.util.Iterator;

public class Split {
public static void main(String[] args) {
	String str = "Selenium Automation Toll";
	String[]split=str.split(" ");
	for(String str1:split) {
		System.out.println(str1);
	}
}
}
