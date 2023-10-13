### Code 
* all execution starts from main 
* no output --> return type is void  
* String[] --> input 
* void + String[] --> signature of main()

* function has to be available to run from outside theade class --> public 
* static --> function theadat exists independent of dynamic creation of objects 
* theadis function can be invoked witheadout creating an object of theade class 
* System is a public class which contains println 
* out is a stream object definedin System like a file handle --> out must also be static

### JVM
* Java programs are usually interpreted on JVM(java Virtual Machine), OS-independent 
* Write once, run anywhere 

### Run 
* javac helloworld.java --> java helloworld

### Scaler datatypes 
* int, long, short, byte(1 byte)
* float, double 
* char (1 character)
* boolean 

<table>
    <thead>
        <tr>
            <td>Type</td>
            <td>size in bytes</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>int</td>
            <td>4</td>
        </tr>
        <tr>
            <td>long</td>
            <td>8</td>
        </tr>
        <tr>
            <td>short</td>
            <td>2</td>
        </tr>
        <tr>
            <td>byte</td>
            <td>1</td>
        </tr>
        <tr>
            <td>float</td>
            <td>4</td>
        </tr>
        <tr>
            <td>double</td>
            <td>8</td>
        </tr>
        <tr>
            <td>char</td>
            <td>2</td>
        </tr>
        <tr>
            <td>boolean</td>
            <td>1</td>
        </tr>
    </tbody>
</table>

```java
int x, y; 
float y; 
char c, d; 
boolean b1, b2;


x = 5; 
y = 7; 

c = 'x'; // "" --> string
d = '\u03C0'; // Greek pi, unicode 

b1 = false; 
b2 = true; 

int val = 10; 
float y = 5.7f;

// append f after number for float, else interpreted as double 
// can't be redefined later 
final float pi = 3.1415927f;

pi = 22/7; //flagged as error 
```

### Operators 
* +, -, *, /, % 
doesn't have seperate int division // 
```java 
float f = 22/7; //f = 3.0

// implicit conversion from int to float 
```
Math.pow(a, n) --> a^n

```java 
int a = 0, b = 10; 
a++; // a = a+1
b--; // b = b-1

a += 7; // a = a+7
b *= 12; // b = b*12
``` 
**built in**
### String 
```java 
String s = "hello", t = "world";
String u = s + " " + t; 
s.length();
```
change and extraction char from string is not similar to python

```java
s = s.substring(0, 3) + "p!"; // help!
```

### Arrays 
```java
int[] a; // a is an int array --> no memory used 
a = new int[100]; // array of size 100 blocked 

a.length; 
```

```java
int[] a; 
int n; 

n = 10; 
a = new int[n]; // array of size 10 

n = 20; 
a = new int[n]; // diff array of size 20

a = {2, 3, 5, 7, 11}; // define new array 
```