import java.util.function.*;

interface MyValue {
	double getValue();
}

interface MyPvalue {
	double getPValue(double n);
}

class Panda {
	int size=10;
}

interface NumericTest {
	boolean test(int i, int j);
}

interface StringPredicate {
	boolean test(String s);
}


public class LambdaDemo {

	MyValue mv = () -> 76.4;
	MyPvalue mpv = (n) -> 1/n;
	
	NumericTest nt1 = (i,j) -> i < j;
	NumericTest nt2 = (i,j) -> i > j;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LambdaDemo ld = new LambdaDemo();
		
		System.out.println(ld.mv.getValue() + " " + ld.mpv.getPValue(4.0));
		System.out.println(ld.nt1.test(1, 2) + " " + ld.nt2.test(1, 2));
		
		Predicate<String> shorterThan10chars = s -> s.length() < 10;
		System.out.println(shorterThan10chars.test("abcdefghi"));
		
		Predicate<Panda> pandaSizeTest = pandaObject -> pandaObject.size < 15;
		System.out.println(pandaSizeTest.test(new Panda()));

	}

}
