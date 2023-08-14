/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Consumerrr;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author jigyasa_yadav
 */
class Movie {

    String name;
    String release_Date;
    int year;
    String publication;

    public Movie(String name, String release_Date, int year, String publication) {
        this.name = name;
        this.release_Date = release_Date;
        this.year = year;
        this.publication = publication;
    }

    @Override
    public String toString() {
        return "{" + "name=" + name + ", release_Date=" + release_Date + ", year=" + year + ", publication=" + publication + '}';
    }

}

public class DisplayMovieInformation {

    public static void main(String[] args) {
        ArrayList< Movie> al = new ArrayList<>();
        al.add(new Movie("AAaaa", "23 Jan", 2015, "AR cinemas"));
        al.add(new Movie("Aashiqui", "2 June", 2020, "Tk cinemas"));
        al.add(new Movie("Omg2", "11 August", 2023, "Jai hind cinemas"));
        al.add(new Movie("Gadar 2", "14 August", 2023, "disney"));
        al.add(new Movie("AAaaa", "23 Jan", 2015, "AR cinemas"));
        Consumer<Movie> c = (m) -> {

            System.out.println("Movie name is " + m.name);
            System.out.println("Movie release date is " + m.release_Date);

        };
        for (Movie m : al) {
            c.accept(m);
        }

    }
}
