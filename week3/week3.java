/*
 * Employee e = new Manager(secretary, 0, secretary)  
 * this worsk as manager is a subtype of employee
 * 
 * Manager m = new Employee(); 
 * this doesn't work 
 * 
 * Employee[] e = new Manager()[100]; 
 * as in place of manager we can use any child class, or employee 
 * 
 * int[] a = new int[100] ==> from that logic this makes sense  
 */

import java.util.Arrays;

class Employee{
    private String name; 
    private double salary; 

    public boolean setName(String s) {
        this.name = s;
        return true;
    }
    public boolean setSalary(double s) {
        this.salary = s; 
        return true; 
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    public Employee(String n, double s){
        name = n; salary = s;
    }

    public Employee(String n){
        this(n, 500.00);
    }

    public double bonus(float percent){
        return (percent/100.0)*this.salary;
    }
}

// subclass manager inherits from parent class employee
// private fields of employee are not accessible by manager
class Manager extends Employee{
    private String secretary;
    public boolean setSecretary(String name){
        this.secretary = name;
        return true;
    };
    public String getSecretary(){
        return this.secretary;
    };

    public Manager(String n, double s, String sn){
        super(n, s); // calls constructor of Employee 
        secretary = sn;
    }

    // over riding 
    public double bonus(float percent){
        // as salary is not available ==> private in parent class 
        return 1.5 * super.bonus(percent);
    }
}

public class week3{
    public int find(Object[] objarr, Object o){
        int i; 
        for (i = 0; i < objarr.length; i++){
            if (objarr[i] == o){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Employee[] emparray = new Employee[2]; 
        Employee e = new Employee("name", 20); 
        Manager m = new Manager(null, 0, null); 

        emparray[0] = e; 
        emparray[1] = m; 

        // every employee of the emparray will have their respective bonus function 
        // although one is employee and the other is manager
        for (int i = 0; i < emparray.length; i++){
            System.out.print(emparray[i].bonus(5));
        }

        double[] darr = new double[100]; 
        int[] iarr = new int[500];

        Arrays.sort(darr); // sorts double array
        Arrays.sort(iarr); // sorts int array 

        // type cast 
        double d = 29.39; 
        int nd = (int) d; // --> 29
    }
}