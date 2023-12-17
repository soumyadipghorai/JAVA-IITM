### Abstract class : 
provide an abstact definition in `Shape`. can't create objects from a class that has abstract functions. but can still declare variables whose type is an abstract class.
```java 
public abstract class Shape{
    public abstract double perimeter();
} 

public abstract class Comparable{
    public abstract int cmp(Comparable s); 
    // return -1 if this < s
    // return 0 if this == 0
    // return +1 if this > s
}

public class SortFunctions{
    public static void quickSort(Comparable[] a){
        // code of quick sort 
        // to compare a[i] and a[j] we use a[i].cmp(a[j])
    }
}
```

### Multiple inheritance 
an interface is an abstract class with no concrete components 
```java
public interface Comparable{
    public abstract int cmp(Comparable s);
}
```
a class that extends an interface is said to implement it: 
```java
public class Circle extends Shape implements Comparable{
    public double perimeter(){}; 
    public int cmp(Comparable s){};
}
```

### interface 
java interfaces extended to allow functions to be added 
* static functions can't access instance variables, invoke directly or using interface name 

* if problem of multiple inheritance occures then subclass must provide a fresh implementation
* conflict can be between a class and interface. in that case it will inherit from the class 