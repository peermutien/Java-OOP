package com.oop;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
       
        System.out.println("Enter the cricket format\n");
    	System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		
       Scanner sc= new Scanner(System.in);
       int format = sc.nextInt();
       
       if(format == 1)								// FOR ODI FORMAT
       {
           ODIMatch obj = new ODIMatch();
           
           System.out.println("Enter the Current Score\n");
           Scanner sc1 = new Scanner(System.in);
           int currentScore = sc1.nextInt();
           
           System.out.println("Enter the Current Over\n");
           Scanner sc2= new Scanner(System.in);
           float currentOver = sc2.nextInt();
           
           System.out.println("Enter the Target Score\n");
           Scanner sc3= new Scanner(System.in);
           int targetScore = sc3.nextInt();
           
           obj.setCurrentScore(currentScore);
           obj.setCurrentOver(currentOver);
           obj.setTargetScore(targetScore);
       
           float reqRunRate = obj.calculateRunrate();
           int balls = obj.calculateBalls();
           obj.display(Math.round(reqRunRate *100.0)/100.0,balls);
       }
       
       else if(format == 2)					// FOR T20 FORMAT
       {
           T20Match obj = new T20Match();
           
           System.out.println("Enter the Current Score\n");
           Scanner sc1 = new Scanner(System.in);
           int currentScore = sc1.nextInt();
        
           System.out.println("Enter the Current Over\n");
           Scanner sc2= new Scanner(System.in);
           float currentOver = sc2.nextInt();
       
           System.out.println("Enter the Target Score\n");
           Scanner sc3= new Scanner(System.in);
           int targetScore = sc3.nextInt();
           
           obj.setCurrentScore(currentScore);
           obj.setCurrentOver(currentOver);
           obj.setTargetScore(targetScore);
        
           float reqRunRate = obj.calculateRunrate();
           int balls = obj.calculateBalls();
           obj.display(Math.round(reqRunRate *100.0)/100.0,balls);
       }
       
       else if(format == 3)				//FOR TEST FORMAT
       {
         TestMatch obj = new TestMatch();
         
         System.out.println("Enter the Current Score\n");
         Scanner sc1 = new Scanner(System.in);
         int currentScore = sc1.nextInt();
        
         System.out.println("Enter the Current Over\n");
         Scanner sc2= new Scanner(System.in);
         float currentOver = sc2.nextInt();
        
         System.out.println("Enter the Target Score\n");
         Scanner sc3= new Scanner(System.in);
         int targetScore = sc3.nextInt();
         
         obj.setCurrentScore(currentScore);
         obj.setCurrentOver(currentOver);
         obj.setTargetScore(targetScore);
        
         float reqRunRate = obj.calculateRunrate();
         int balls = obj.calculateBalls();
         obj.display(Math.round(reqRunRate *100.0)/100.0,balls);
       }
       
       else				// INVALID FORMAT
       {
         System.out.println("invalid input\n");
         return;
       }
}
}