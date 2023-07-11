/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section19;

import java.util.Scanner;

/**
 *
 * @author jigyasa_yadav
 */
class ICICI{
    Scanner sc= new Scanner(System.in);
   static String name;
    static String accno;
    static float balance;
ICICI(String name,
    String accno) {
    this.accno=accno;
    this.name=name;
}   
public void DepositAmt(int amt){
    balance=balance+amt;
    System.out.println("Amount deposited.");
    System.out.println("you want to show your balance:");
    String res=sc.nextLine();
    if("yes".equals(res)){
        ShowBalance();
    }
    else {
        System.exit(0);
    }

}
public void Withdrawlamt(int amt){
    balance=balance-amt;
    System.out.println("Withdrawal Successfull!1");
    System.out.println("you want to show your balance:");
    String res=sc.nextLine();
    if("yes".equals(res)){
        ShowBalance();
    }
    else {
        System.exit(0);
    }
}
public static  void ShowBalance(){
    System.out.println("your current balance is: "+balance);
    
}
}
public class BankProgram {
    public static void main(String[] args) {
        
    Scanner s=new Scanner(System.in);
        System.out.print("Please enter your Name :");
        String name=s.nextLine();
        System.out.print("Please enter your Account number :");
         String accno=s.nextLine();
            ICICI i=new ICICI( name , accno);
         System.out.println("Choose What you want to do?? ");
         System.out.println("1 for deposit ");
             System.out.println    ( "2 for withdrawl");
               System.out.println   ( "3 for balance ");
         int ans= s.nextInt();
         int amt;
         switch (ans){
             case 1:
                 System.out.println("enter the amout you want to deposit :");
                 amt =s.nextInt();
                i.DepositAmt(amt);
                break;
                
                 case 2:
                 System.out.println("enter the amout you want to withdraw :");
                amt =s.nextInt();
                i.Withdrawlamt(amt);
                break;
                 case 3:
                              ICICI.ShowBalance();
                break;
                 default:
                     System.out.println("Please choose a valid response!!1");
        break;
         }  
    }
    
}
