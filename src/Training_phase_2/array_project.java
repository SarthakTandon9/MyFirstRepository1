package Training_phase_2;

public class array_project {
   public static void main(String[] args) {
	   int[] max = {2,4,3,8};
	   int[] min = {2,8,4,3,1};
	   double[] average = {1,10,100,1000,10000,100000,1000000};
	   System.out.println(maximum(max));
	   System.out.println(minimum(min));
	   System.out.println(average(average));
   }
   
   public static int maximum(int[] n) {
	   int max = 0;
	   for(int i = 0; i<n.length; i++) {
		   if(n[i]> max) {
			   max =  n[i];
		   }
	   }
      return max;
   } 

   public static int minimum(int[] x) {
	   int min = x[0];
	   for(int i = 0; i<x.length;i++) {
		   if(x[i]<min) {
			   min = x[i];
		   }
	   }
	   return min;
   }
   
   public static double average(double[] n) {
	   double sum= 0;
	   double ave = 0;
	   for(int i = 0; i<n.length; i++) {
		   sum = sum + n[i];
		   ave = sum/n.length;
	   }
	   return ave;
   }
   


}