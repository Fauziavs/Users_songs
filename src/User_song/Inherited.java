package User_song;

import java.util.Scanner;

public class Inherited {
	
	 public static void m1()
	{
		Scanner sc =new Scanner(System.in);
		  System.out.println("Enter User1");
		  String user = sc.nextLine();
		  String User1="User1";
		  
		  if(User1.equals(user))
	{   
			  
			
		 System.out.println("Enter Song:s1");
		  String S1=sc.nextLine();  
		  System.out.println(S1);
		  System.out.println("Enter Song:s2");
		  String S2=sc.nextLine();  
		  System.out.println(S2);
		  System.out.println("Enter Song:s3");
		  String S3=sc.nextLine();  
		  System.out.println(S3);
		  System.out.println("Enter Song:s4");
		  String S4=sc.nextLine();  
		  System.out.println(S4);
		  
		  String[] ar= {S1,S2,S3,S4};
		  
		  System.out.println("Most recent songs lastly played");
		  for(int i=1;i<=3;i++)
		  {
			  System.out.println(ar[i]);
		  }
		  
	  }
		  
		  else{System.out.println("Please enter User1 to listen songs respectively as S1,S2,S3,S4 "); };
			  
		  
	 }
	 
	}


