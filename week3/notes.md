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