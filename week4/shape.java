abstract class Shape{
    public abstract double perimeter();
}

public interface Comparable{
    // default 
    public default int cmp(Comparable s){
        return 0;
    }
    public static String cmpdoc(){
        String s; 
        s = "Return -1 if this < s, ";
        s = s + "0 if this == s, ";
        s = s + "+1 if this > s. ";
        return s;
    }
}

public class shape {
    public static void main(String[] args){
        Shape shapearr[] = new Shape[3]; 
        int sizearr[] = new int[3]; 

        shapearr[0] = new Circle(); 
        shapearr[1] = new Square(); 
        shapearr[2] = new Rectangle(); 

        for (int i =0; i < 2; i++){
            // each shapearr[i] calls the appropriate method 
            sizearr[i] = shapearr[i].perimeter();
        }
    }
}
