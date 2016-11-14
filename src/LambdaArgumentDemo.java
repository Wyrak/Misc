import java.time.*;

interface StringFunc {
	String func(String str);
}

interface MyOwnPredicate {
	boolean test
}


public class LambdaArgumentDemo {

	static String changeStr(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambda Expressions Expand Java";
		String outStr;
		
		System.out.println("Here is the input string: " + inStr);

		StringFunc reverse = (str) -> 
		{String result = ""; 
			for (int i = 0; i < str.length() ; i++) {
				result = str.charAt(i) + result;}
			return result;
		};
		
		outStr = changeStr(reverse,inStr);
		
		System.out.println("Here is the output string: " + outStr);
		
		StringFunc invertCase = (str) -> {
			return str.toUpperCase();
		};
		outStr = changeStr(invertCase,inStr);
		outStr = changeStr(s -> s.toLowerCase() ,inStr);
		
		
		System.out.println("Here is the output string: " + outStr);
		
		System.out.println(LocalDateTime.now().plusHours(1).plusMonths(3));
	}

}
