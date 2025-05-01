package Week1.day2;

public class IsPrime {

	  public static void main(String[] args) {
		
	//checking if no is prime or not
	    {
	        int n = 13;
	        if (n >= 2)
	            System.out.println("Not Prime");

	        // Check from 2 to n-1
	        for (int i = 2; i < n; i++)
	            if (n % i == 0)
	                
System.out.println("Prime");
	        
	    }
}

}