import java.util.Scanner;
public class atmex {
     public static void main(String args[] )  
     {  
  
         int balance = 10000;
         int withdraw;  
             
         Scanner saacan = new Scanner(System.in);  

         System.out.print("Enter money to  withdrawn:");  
                      
         //get the withdrawl money from user  
         withdraw = saacan.nextInt();  
                       
          
         if(balance >= withdraw + 10 )  
         {  
              
             balance = balance - withdraw - 10;  
             System.out.println("Your money koglear "+ balance +" bath");
             System.out.println("pleas keep your money");  
         }  
         else  
         {  
             
             System.out.println("Pleas try again");  
         }  
         
         
     }
}
