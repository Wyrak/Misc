public class A{
   int i = 6;
   
   public static void main(String[] args) {
	   B b = new B();
	   b.j = b.i;
	   
       int a = Integer.MIN_VALUE;
       int f = -a;
       System.out.println(Integer.toBinaryString(-8));
       System.out.println(Integer.toBinaryString(-2));
       System.out.println(Integer.toBinaryString(-10));
       System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
       System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
	   float v = 4532;
       
	     Integer i1 = new Integer(1) ;
	      Long m1 = new Long(1);
	      if( i1.equals(m1)) System.out.println("equal");   // 1
	      else System.out.println("not equal");
       
	   short t = Short.MAX_VALUE;
	   
	   int c1 = 1761;
	   char c2 = (char)c1;
	   System.out.println(c2);
	   
	   
	   short s = Short.MAX_VALUE;
//	   char c = s;
	//   System.out.println( c == Short.MAX_VALUE);
	   
	   char[] ca = new char[0];
	   System.out.println(5%2.5);
	   
	   
   }
}
class B extends A{
   int j;
   
   B() {
	   
	   this(10);
	  int c = 't';
	  // super();
	   int j = 10;
	 
   }
   
   B(int j) {
	   this.j = j;
   }
   

}