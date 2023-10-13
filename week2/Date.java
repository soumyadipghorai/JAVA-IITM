/*
 * day, month, year instance var of date and private 
 * default public if not mentioned explicitly 
 * All classes defined in same directory form part of same package
 * accessor --> reports the value 
 * mutator --> updates the value
 * if you don't create a constructor if can still create an object with sensible defaults 
*/

import java.io.Console;
import java.util.Scanner;
import javax.swing.text.Style;

public class Date {
    private int day, month, year;

    // constructor 
    public Date(int d, int m, int y){
        day = d; 
        month = m; 
        year = y;
    }
    // overloading 
    public Date(int d, int m){
        day = d; 
        month = m; 
        year = 2021;
        // this(d, m, 2021);
    }
    // copy constructor
    public Date(Date d){
        this.day = d.day; 
        this.month = d.month; 
        this.year = d.year;
    }

    public void UseDate(){
        Date d1, d2;
        d1 = new Date(12, 4, 1954);
        d2 = new Date(d1);
    }
    public void setDate(int day, int month, int year){
        this.day = day; 
        this.month = month; 
        this.year = year;
    }

    // public void UseDate(){
    //     Date d;
    //     d = new Date(13, 8, 2015);
    // }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public static void main(String[] args){
        Console cons = System.console(); 
        String username = cons.readLine("user name"); // string 
        char[] password = cons.readPassword("password"); // array of character --> don't echo characters on the screen

        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int age = in.nextInt();
        System.out.println('a'); // print and moves to next line 
        System.out.print('a'); // print and doesn't moves to next line 
        System.out.printf("bn"); // generates formatted output  
    }
}
