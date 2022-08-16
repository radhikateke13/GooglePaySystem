package MyProject;

import java.util.Scanner;

public class AppDemo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int Pass=1111;
		int pin=0000;
		System.out.println("Enter Your Phone PassWord: ");
		Pass=sc.nextInt();
			
		if(Pass==1111) 
		{
			System.out.println("--------------------------------");
            System.out.println("-----Login Succesfully----");
	    }
		else 
		{
		System.out.println("-----Incorrect Password----");
		System.out.println("Reenter your password: ");
		Pass=sc.nextInt();
  		}
		System.out.println("----------------------------------");
		System.out.println("-----Enter your Choice-----");
		System.out.println("1.Mobile Payment\t2.Bank Transfer \t3.pay to UPI id \t4.Mobile recharge \t5.Pay Contact");
		
		while(true) {
    		int choice= sc.nextInt();
    		switch(choice) {
    		
    		case 1:
    			System.out.println("-----------------------------------");
    			System.out.println("Enter Mobile Number : ");
    			int number=sc.nextInt();
    			System.out.println("Enter Amount To Be Pay : ");
    			double amount=sc.nextDouble();
    			System.out.println("Enter 4 Digit Pin: ");
    			int Pin=sc.nextInt();
    			if(Pin==pin) {
    				System.out.println("-----Trasection Succesfully-----");
    				System.out.println("-----Transection id-----");
    				System.out.println("-----0001112233300-----");
    			}else {
    				System.out.println("-----Close The App-----");
    			}
    			break;
    			
    		case 2:
    			System.out.println("------------------------------------");
    			System.out.println("Enter Your Account Number: ");
    			int anumber=sc.nextInt();
    		    System.out.println("Enter the Name of Holder  = ");
    		     String name  = sc.next();
    			System.out.println("Enter Your Bank IFSC Code= ");
    			 int IFSC = sc.nextInt();
    			 System.out.println("Enter Amount To Be Pay = ");
     			double amount1=sc.nextDouble(); 
     			System.out.println("Enter 4 Digit Pin: ");
    			int Pin1=sc.nextInt();
    			if(Pin1==pin) {
    				System.out.println("-----Trasection Succesfully-----");
    				System.out.println("-----Transection id-----");
    				System.out.println("-----0001112233300-----");
    			}else {
    				System.out.println("-----Close The App-----");
    			}
    			break;
    			
    		case 3:
    			System.out.println("---------------------------------");
    		System.out.println("Enter Your UPI id= ");
    		int upi1=sc.nextInt();
    			 System.out.println("Enter Amount To Be Pay = ");
      			double amount2=sc.nextDouble(); 
    			System.out.println("Enter 4 Digit Pin= ");
    			int Pin2=sc.nextInt();
    			if(Pin2==pin) {
    				System.out.println("-----Trasection Succesfully-----");
    				System.out.println("-----Transection id-----");
    				System.out.println("-----0001112233300-----");
    			}else {
    				System.out.println("-----Close The App-----");
    			}
    			break;
    			
    		case 4:
    		System.out.println("---------------------------------");
    		System.out.println("Enter Mobile Number = ");
	        long Mob = sc.nextLong();
	        System.out.println("Select the plan  =  \n 1.236 :- Unlimited Calling ,1.5gb/day,100sms/day \n 2.199 :- Unlimited Calling ,1.0gb/day,100sms/day 28 days \n 3.179 :- Unlimited Calling ,1.5gb/day,100sms/day , only for 23 days \n 4.666 :- Unlimited Calling ,1.5gb/day,100sms/day 84 days");
	       int plan = sc.nextInt();
	    
	       switch(plan)
	       {
	           case 1 :
	               System.out.println("Enter UPI pin = ");
	               int pin3 = sc.nextInt();
	               if (pin == pin3) {
	                   System.out.println("-----Recharge Successful-----\n");
	                   System.out.println("-----Transaction Id = 4765463723-----");

	               } else {
	                   System.out.println("invalid pin \n");
	               }
	               break;
	           case 2 :
	               System.out.println("Enter UPI pin = ");
	                pin3 = sc.nextInt();
	               if (pin == pin3) {
	                   System.out.println("-----Recharge Successful-----\n");
	                   System.out.println("-----Transaction Id = 7453536733-----");

	               } else {
	                   System.out.println("invalid pin \n");
	               }
	               break;
	           case 3 :
	               System.out.println("Enter UPI pin = ");
	               pin3 = sc.nextInt();
	               if (pin == pin3) {
	                   System.out.println("-----Recharge Successful-----\n");
	                   System.out.println("-----Transaction Id = 5643463723-----");

	               } else {
	                   System.out.println("invalid pin \n");
	               }
	               break;
	           case 4 :
	               System.out.println("Enter UPI pin = ");
	               pin3 = sc.nextInt();
	               if (pin == pin3) {
	                   System.out.println("-----Recharge Successful-----\n");
	                   System.out.println("-----Transaction Id = 986533723-----");

	               } else {
	                   System.out.println("invalid pin \n");
	               }
	               break;
	       }
	       break;
	       
	       
    		case 5:
    			System.out.println("---------------------------------------");
    			System.out.println("Enter mobile Number= ");
    			double m=sc.nextDouble();
    			System.out.println("Enter Amount To Be Pay= ");
    			double amt= sc.nextDouble();
    			System.out.println("Enter 4 Digit Pin= ");
    			int Pin3=sc.nextInt();
    			if(Pin3==pin) {
    				System.out.println("-----Trasection Succesfully-----");
    				System.out.println("-----Transection id-----");
    				System.out.println("-----0001112233300-----");
    			}else {
    				System.out.println("-----Close The App-----");
    			}
    			break;
		}
}

}
}