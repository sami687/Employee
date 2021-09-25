package Employee;

public class UC4 {
	   public static void main(String args[]){
		   int IS_FULL_TIME = 2;
		   int EMP_RATE_PER_HOUR = 20;
           int IS_PART_TIME = 1;
    	   int empHrs = 0;
    	   int empWage = 0;
    	   double empcheck = Math.floor(Math.random() * 10) % 3;
           int i = (int)empcheck;
           switch(i) {
           case 1:
        	   empHrs = 4;
        	   break;
           case 2:
        	   empHrs = 8;
        	   break;
        	   default:
        		   empHrs = 0;
           
           }
	   int salary = empHrs * EMP_RATE_PER_HOUR;
			   System.out.println("Salary is :" + salary);
}
}