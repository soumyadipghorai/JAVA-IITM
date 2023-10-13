### Language
--> load a value from memory location into register <br>
-->  the cotents of register R1 and R2 and store the result back in R <br>
--> write the value in R1 to memory location M

impertive --> how to compute <br>
declarative --> what the computation should produce 

#### imperative
```py 
def sumlist(l) : 
    mysum = 0
    for x in l : 
        mysum += x 
    return mysum

def sumsq(n) : 
    msum = 0 
    for x in range(n+1) :
        if x%2 == 0 : 
            msum += x*x

    return msum
```

#### declarative
```py
def sumlist(l) : 
    if l == [] :
        return 0 
    return l[0] + sumlist(l[1:])

def even(x) : 
    return x%2 == 0 

def sq(x) :
    return x*x 

def sumsq(n) :
    return sum(map(sq, filter(even, range(n+1))))
```

### Types 
dynamic typing --> python ==> type depends on the value stored. uninitialized items has no time<br>
static typing --> java ==> decalre type 

```py
#wrong
def factors(n) : 
    foctorlist = []
    for i in range(1, n+1) : 
        if n%i == 0 : 
            factorlst = factorlist + [i] # miss type 
    return factorlist
```
static analysis --> identify errors as early as possible -> save cost and effort 

python support automatic type inference 
```
if x = 7 --> y = x + 10 ==> y = int 
```

### memory 
scope of a variable --> when the variable is available for use <br>
lifetime of a variable --> how long the storage remains allocated 

call by value --> python ==> if i update the value in a function the outside value remains unchanged <br>
call by reference --> value gets changed

seperate storage for persistent data --> dynamically allocated vs statically declared (usually called heap)

* manual memory management --> programmer explicitly requests and returns heap storage.
* automatic garbage collection --> java, python <br>
periodically check that storage is not being used and return it to the free space. mark-and-sweep

### Abstraction :
* program refinement --> focus on code not much change in data structure 
* data refinement --> data representation changes, cascading impact on other functions that operate on accounts 

* control abstraction --> encapsulate a block of code, reuse in different contexts 
* data abstraction --> abstract data type 

### Obect oriented programming 
objects are similar to abstract datatypes
* public interface 
* private implementation 
* change the implementation should not affect interactions with the object 

subtype --> A is a subtype of B wherever an object of type B is needed an object of type A can be used 

* overloading --> operation + is addition for int and float, internal implementation is different, but choice is determinded by static type  
* dynamic look up --> v of type B can refer to an object of subtype A. static type of v is B, but method implementation depends on run-time type A.

### inheritance 
* reuse of implementation 
* deque is a subtype of Stack and Queue 
* Stack and Queue inherit from deque 

classes and objects
```py
import math
class Point : 
    def __init__(self, a = 0, b = 0) : 
        self.x = a 
        self.y = b 

    def translate(self, dx, dy) : 
        self.x += dx 
        self.y += dy 

    def odistance(self) :  
        d = math.sqrt(self.x*self.x + self.y*self.y)
        return d

class Point : 
    def __init__(self, a = 0, b = 0) : 
        self.r = math.sqrt(a*a + b*b)
        if a == 0 : 
            self.theta = math.pi/2
        else : 
            self.theta = math.atan(b/a)

    def translate(self, dx, dy) : 
        x = self.r * math.cos(self.theta)
        y = self.r * math.sin(self.theta)
        x += dx 
        y += dy 
        self.r = math.sqrt(x*x + y*y)
        if x == 0 : 
            self.theta = math.pi/2
        else : 
            self.theta = math.atan(y/x)

    def odistance(self) : 
        return self.r 
```
python allows this 
```py
p = Point(5, 7)
p.x = 4
```
this works in the 1st definition but not in the 2nd definition. 

```py
class Rectangle : 
    def __init__(self, w = 0, h = 0): 
        self.width = w
        self.height = h 

    def area(self) : 
        return self.width * self.height 

    def perimeter(self) : 
        return 2 * (self.width + self.height)

# inheritance 
class Square(Rectangle) : 
    def __init__(self, s = 0) : 
        self.side = 0

sq = Square()
# sq.width will throw an error
```