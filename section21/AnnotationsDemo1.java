/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package section21;

/**
 *
 * @author jigyasa_yadav
 */
import java.lang.annotation.Annotation;

@interface MyAnno
{
    String name();
    String project();
    String date() default "today";
    String version() default "13";
            }

@MyAnno(name="Ajay",project="Bank")
public class AnnotationsDemo1
{
    //@MyAnno(name="Ajay")
    int data;
    
    //@MyAnno(name="Ajay")
    public static void main(String[] args) 
    {
        //@MyAnno(name="Ajay")
        int x;
    }
}