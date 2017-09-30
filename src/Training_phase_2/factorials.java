package Training_phase_2;

public class factorials {
   public static void main (String[] args) {
	   System.out.println(factorials(3));
	   System.out.println(fac(4));
   }
   
   
   
   public static int factorials(int n) {
	   if (n== 0) {
		   return 0;
	   }
	   if(n == 1) {
		   return 1;
		  
	   }
	   
	   return factorials(n-1)*n;
   }
   
   public static int fac(int n) {

	   if (n <= 1) {
	      return 1;
	   }

	   return (n * fac(n-1));
	 }
}
