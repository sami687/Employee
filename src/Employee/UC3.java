package Employee;

public class UC3 {
	   public static void main(String args[]){
		   int IS_FULL_TIME = 2;
		   int EMP_RATE_PER_HOUR = 20;
            int IS_PART_TIME = 1;
     	   int empHrs = 0;
    	   int empWage = 0;

            
    	   double empcheck = Math.floor(Math.random() * 10) % 2;
    	   if (empcheck == IS_PART_TIME) {
   	        empHrs = 4;
    	   } else if(empcheck == IS_FULL_TIME) {
    		   empHrs = 8;
    	   }else {
    	        	
    	        empHrs = 4;}
    	   int salary = empHrs * EMP_RATE_PER_HOUR;
    	   System.out.println("Salary is: " + salary);
       }
       
    }



