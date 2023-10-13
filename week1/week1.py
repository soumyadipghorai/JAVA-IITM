import math

# imperative
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

# declarative 
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

# classes and objects 
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