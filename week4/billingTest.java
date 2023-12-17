interface Generatable{
    double billGenerate(int units);
}

class PowerBill{
    private double totalBill; 
    private class Domestic implements Generatable {
        public double billGenerate(int units){
            if (units > 0 && units <= 100){
                totalBill = units*1.6; 
            }
            else {
                totalBill = units * 5.6;
            }
            return totalBill; 
        }
    }

    public class Commercial implements Generatable {
        public double billGenerate(int units){
            if (units > 0 && units <= 100){
                totalBill = units * 5.6;
            }
            return totalBill;
        }
    }

    public Generatable getDomesticBill(){
        return new Domestic();
    }
    public Generatable getCommericalBill(){
        return new Commercial();
    }
}

public class billingTest {
    public static String getBill(int units, String type){
        PowerBill powerBill = new PowerBill(); 

        if (units < 0){
            return "invalid input";
        }else if (type.equalsIgnoreCase("home")){
            double bill = powerBill.getDomesticBill().billGenerate(units); 
            return "final bill " + bill;
        }else {
            return "invalid bill type";
        }
    }   
    
    public static void main(String[] args){
        int units = 150; 
        String type = "home"; 

        String result = getBill(units, type); 
        System.out.println(result);
    }
}
