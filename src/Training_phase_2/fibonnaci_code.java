package Training_phase_2;

public class fibonnaci_code {

	  public static void main(String[] args) {
		System.out.println(fib(5));
	  }
	  
	  
	  public static int fib(int n) {
		 
		  if(n == 0) {
			 return 0;
		 }
		  
		  if(n == 1) {
			  return 1;
		  } 
		  
		  else {			  
			  return ((fib(n-1) + fib(n-2)));
		  }
		  
		  
	  }

}
