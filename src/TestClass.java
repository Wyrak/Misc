public class TestClass {
    
    public static void main(String[] args){
        int k = 2;
        do{
            System.out.println(k);
        }while(--k>0);
    }
    public void switchTest(byte x){
    	   switch(x){
    	      case 'b':   // 1
    	      default :   // 2
    	      case -2:    // 3
    	      case 80:    // 4
    	   }
    	}
}