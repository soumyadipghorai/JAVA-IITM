##### algo + ds = program 
combine algo in library and use them to code 

##### OO Design
data --> algo to operate on data 

An Order processing system 
Objects (nouns)
* items 
* orders 
* shipping address 
* payment 
* account 

methods (verbs)
what happend?
* items are added to orders 
* orders are shipped, cancelled 
* payments are accepted, reject 

Design objects 
* behaviour --> what methods do we need to operate on objects 
* state --> how does the object react when methods are invoked 
    * state is the info in the instance variable 
    * encapsulation --> should not change unless a method operates on it 
* identity --> distinguish between different objects of the same class 

relationship between classes 
* dependences 
    * --> order needs account to check credit status 
    * --> items does not depend on account 
    * --> robust design minimizes dependencies or coupling between classes 
* aggregation --> object contains item object 
* inheritance 
    * one object is specialized versions of another 
    * expressOrder inherits from order 

```java
Employee e = new Manager(); 
```
e is declared to be an employee. if we check for e.bonus() 
* static : use Employee.bonus()
* dynamic : use Manager.bonus()

##### Dynamic dispatch : (default in java, optional in C++)
in runtime it will call Manager.bonus()

##### Polymorphism : 
Every employee knows how to calculate its bonus correctly. Also referred to as runtime polymorphism or inheritance polymorphism.

**structural polymorphism** --> use the same sorting function for array of any datatype that supports a comparison operation. 

```java
Employee[] emparray = new Employee[2]; 
Employee e = new Employee("name", 20); 
Manager m = new Manager(null, 0, null); 

emparray[0] = e; 
emparray[1] = m; 

// every employee of the emparray will have their respective bonus function 
// although one is employee and the other is manager
for (var i = 0; i < emparray.length; i++){
    System.out.print(emparray[i].bonus(5.0));
}
```

##### overloading : 
multiple methods, different signatures, choice is static 

##### overriding : 
multiple methods same signature, choice is static 

##### type casting : 
```java 
// convert e to manager 
((Manager), e).setSecretary(s);

// reflect --> if e is not a manager cast fails 
if (e instanceof Manager){
    ((Manager) e).setSecretary(s);
} 
``` 

##### hierarchy
```
c1 ------>|
          |----> c3
c2 ------>|
```

java doesn't allow multiple inheritance 

```java
public boolean equals(Object o) // defaults to pointer equality
public String toString() // converts the values of the instance variable to string 
```
x == y ==> x.equals(y)
System.out.println(o+"); ==> o.toString()

if we define .equals() in a class and the call == on the object of the class then the default equals() will be overridden by the new equals()

```java
public boolean equals(Date d){
    return ((this.day == d.day) && (this.month == d.month) && (this.year == d.year));
}
/*
boolean equals(Date d) doesn't override'
boolean equals(Object o)
*/

public boolean equals(Object d){
    if (d instanceof Date){
        Date myd = (Date) d;
        return ((this.day == d.day) && (this.month == d.month) && (this.year == d.year));
    }
    return false;
}
```
overriding looks for 'closest' match 

### Subtype : 
* capabilities of the subtype are a superset of the main type 
* if B is a subtype of A, wherever we require an object of type A, we can use an object of type B 

### Inheritance :  
* subtype can reuse code of the main type 
* B inherits from A if some functions for B are written in terms of functions of A 

* deque is a subtype of both stack and queue 
* both stack and queue can inherit from deque 

## modifiers in Java 
* public and private 
    * typically instance variables are private 
    * methods to query(accessor) and update (mutator) the state are public 
* static 
    * use static for components that exist without creating objects. library functions like `main()`, constants like `Math.PI`
    * static components are also public

* final 
    * things that can't be updated, Math.PI.Integer.MAX_VALUEm
    * if a method is final in parent class then the child class can't override or modify the function 