abstract class Shopping{
    abstract void offers();
}

class Amazon extends Shopping{
    void offers(){
        System.out.println("Great indian festival");
    }
}

class Flipkart extends Shopping{
    void offers(){
        System.out.println("big billion day");
    }
}

class User{
    public void getOffers(Shopping obj){
        obj.offers();
    }
}

public class ShoppingMain{
    public static void main(String[] args){
        User u = new User(); 
        u.getOffers(new Amazon()); 
        u.getOffers(new Flipkart());
    }
}