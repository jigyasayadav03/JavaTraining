/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section23;

import java.io.*;

/**
 *
 * @author jigyasa_yadav
 */
class Custo implements Serializable {

    String name;
    int Id = 0;
    String purchase;

    Custo() {

    }

    Custo(String n, String p) {
        this.Id = 1;
        this.name = n;
        //Id++;
        this.purchase = p;
    }
      public String toString()
    {
        return "\nCustomer Details\n"+
                "\n Customer Id "+Id+
                "\nCustomer Name "+name+
                "\nitem Bought "+ purchase ; 
                
    }
}

public class SerializedCustomer {

    public static void main(String[] args) throws Exception {
        Custo c = new Custo("jigyasa", "software");
        FileOutputStream fos = new FileOutputStream("/home/jigyasa_yadav/txtFiles/Customer.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        fos.close();
        oos.close();
        //for desriaizing 
        FileInputStream fis = new FileInputStream("/home/jigyasa_yadav/txtFiles/Customer.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Custo c1 = (Custo) ois.readObject();
        System.out.println(c1);
       
        fis.close();
        ois.close();

    }

}
