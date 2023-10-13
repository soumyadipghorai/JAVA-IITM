public class controlFlow {
    public static int sign(int v){ 
        if (v < 0){
            return -1;
        }
        else if (v > 0){
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int sumupto(int n){
        int sum = 0;
        while (n > 0){
            sum += n; 
            n--;
        }
        return sum;
    }

    /*
    read input atleast once here 
    do {
        read input;
    } while (intput-condition)
    */
    public static int sumuptoD(int n){
        int sum = 0; 
        int i = 0; 

        do {
            sum += i; 
            i++;
        }
        while (i <= n); 
        return sum;
    }

    public static int sumarray(int[] a){
        int sum = 0, n = a.length;

        for (int i = 0; i < n; i++){
            sum += a[i];
        }
        /*
        * you have to put int v inside the loop else you'll get error
         for (int v : a){
             sum += v;
         }
         */
        return sum;
    }

    public static void printsign(int v){
        switch (v){
            /* 
            * return void as return nothing 
            * by default it will check the next case 
            * so you have to put a break 
            * only constant option like 0, 1 --> can't use expression
            */
            // v == -1
            case -1: {
                System.out.println("Negative");
                break; 
            }
            // v == 1
            case 1: {
                System.out.println("Positive");
                break;
            }
            // v == 0
            case 0: {
                System.out.println("Zero");
                break;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(sign(10));
        System.out.println(sumupto(10));
        System.out.println(sumuptoD(10));
        int[] arr = {1, 2, 3, 4};
        System.out.println(sumarray(arr));
        printsign(0);
    }
}