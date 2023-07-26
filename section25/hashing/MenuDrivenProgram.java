/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section25.hashing;

/**
 *
 * @author jigyasa_yadav
 */
import java.io.*;
import java.util.*;

class Account implements Serializable {

    String accno;
    String name;
    double balance;

    Account() {
    }//neccesarry for serializing 

    Account(String a, String n, double b) {
        accno = a;
        name = n;
        balance = b;
    }

    public String toString() {
        return "Account No:" + accno + "\nName :" + name + "\nBalance :" + balance + "\n";
    }
}

public class MenuDrivenProgram {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Account acc;
        HashMap<String, Account> hm = new HashMap<>();

        try {
            FileInputStream fis = new FileInputStream("/home/jigyasa_yadav/txtFiles/Accounts.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int count = ois.readInt();
            for (int i = 0; i < count; i++) {
                acc = (Account) ois.readObject();
                System.out.println(acc);
                hm.put(acc.accno, acc);
            }
            fis.close();
            ois.close();

        } catch (Exception e) {

        }
        FileOutputStream fos = new FileOutputStream("/home/jigyasa_yadav/txtFiles/Accounts.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        int choice;
        String accno, name;
        double balance;
        do {
            System.out.println("1. Create Account");
            System.out.println("2. Delete Account");
            System.out.println("3. View Account");
            System.out.println("4. View  All Accounts");
            System.out.println("5. Save Accounts");
            System.out.println("6. Exit");
            System.out.println("Enter your choice ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Details Accno, Name ,balance ");
                    accno = sc.nextLine();
                    name = sc.nextLine();
                    balance = sc.nextDouble();
                    acc = new Account(accno, name, balance);
                    hm.put(accno, acc);
                    System.out.println("Account Created for " + name);

                    break;
                case 2:
                    System.out.println("Enter Accno");

                    accno = sc.nextLine();
                    //removing using accc no 
                    hm.remove(accno);
                    break;
                case 3:
                    System.out.println("Enter Accno");
                    accno = sc.nextLine();
                    acc = hm.get(accno);
                    System.out.println(acc);
                    break;
                case 4:
                    for (Account a : hm.values()) {
                        System.out.println(a);
                    }
                    break;

                case 5:
                case 6:
                    oos.writeInt(hm.size());

                    for (Account a : hm.values()) {
                        oos.writeObject(a);
                    }

            }

        } while (choice != 6);
        oos.flush();
        oos.close();

        fos.close();
    }
}
