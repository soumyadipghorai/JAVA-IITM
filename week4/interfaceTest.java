/**
 * InnerinterfaceTest
 */
interface Appraisable {
    default void increment(Employee e){
        e.updateSalary(5000);
    }
    void checkAndUpdateSalary();
}

interface SpecialAppraisable extends Appraisable {
    default void spIncrement(Employee e){
        e.updateSalary(7000);
    }
}

class Employee implements SpecialAppraisable{
    private String name; 
    private double salary; 
    private int numLeaves; 

    public Employee(String name, double salary, int numLeaves){
        this.name = name; 
        this.salary = salary; 
        this.numLeaves = numLeaves;
    }

    public void updateSalary(double amount){
        salary += amount;
    }

    public double getSalary(){
        return salary;
    }

    public void checkAndUpdateSalary(){
        if (salary >= 5000 && numLeaves <= 6){
            increment(this);
        }
        else {
            spIncrement(this);
        }
    }

    public String toString(){
        return name + " " + salary + " " + numLeaves;
    }
}
public class interfaceTest {
    public static void printUpdatedEmpList(Employee[] eList){
        for (Employee employee : eList){
            employee.checkAndUpdateSalary();
        }

        for (Employee employee : eList){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Employee[] eArr = {
            new Employee("john", 52000, 5),
            new Employee("KJdud", 52000, 7),
            new Employee("kjnajdnc", 52000, 5)
        };

        printUpdatedEmpList(eArr);
    }
}
