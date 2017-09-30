package Training_phase_2;

public class sum {
  public static void main(String[] args) {
	  System.out.println(calculate(2));
  }
  
  
  public static int calculate(int n) {
	  if (n== 0) {
		  return 0;
	  }
	  if (n==1) {
		  return 1;
	  }
	  
	  return calculate(n-1)+n;
  }
}
