class Date{
    private int day, month, year; 

    public Date(int day, int month, int year){
        this.day = day; 
        this.month = month; 
        this.year = year; 
    }

    public Date(int day, int month){
        this.day = day; 
        this.month = month; 
        this.year = 2021;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }
}

class Employee{
    private String name; 
    private double salary; 

    public Employee(String name, double salary){
        this.name = name; 
        this.salary = salary; 
    }

    public double bonus(float percent){
        return (percent/100.0)*this.salary;
    }
}

class Manager extends Employee{
    private String secretary;

    public String getSecretary(){
        return secretary;
    }
    public Manager(String name, double salary, String sc){
        super(name, salary);
        this.secretary = sc;
    }

    public double bonus(float percent){
        return super.bonus(percent) * 1.5;
    }
}

public class practice{
    public static void main(String[] args){
        Date d = new Date(1, 2, 2000);
        System.out.println(d.getDay());
        System.out.println(d.getMonth());
        System.out.println(d.getYear());

        Date d1 = new Date(1, 2);
        System.out.println(d1.getDay());
        System.out.println(d1.getMonth());
        System.out.println(d1.getYear());

        int[] arr = new int[3];
        arr[0] = 1; arr[1] = 2; arr[2] = 3;
        System.out.println(arr);
        
        int[] arr1 = {1, 2, 3}; 
        System.out.println(arr1);

        Employee e = new Employee("ghorai", 100);
        System.out.println(e.bonus(25));

        Employee e1 = new Manager("ghorai", 100, "sc");
        System.out.println(e1.bonus(50));
        System.out.println(((Manager) e1).getSecretary());

        Employee[] empArr = new Employee[2]; 
        empArr[0] = e;
        empArr[1] = e1;

        for (int i = 0; i < empArr.length; i++){
            System.out.println(empArr[i].bonus(50));
        }
    }
}