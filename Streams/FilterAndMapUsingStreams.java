/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author jigyasa_yadav
 */
public class FilterAndMapUsingStreams {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.add(20);
        al.add(23);
        al.add(22);
        al.add(32);
        al.add(45);
        al.add(46);
        System.out.println(al);
        List<Integer> l=al.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println("the even number in the list are: ");
        System.out.println(l);
        
        //mapping the list to double its elemnts
                List<Integer> l1=al.stream().map(I-> I*2).collect(Collectors.toList());
        System.out.println("the new list is :"+l1);
    }
}
