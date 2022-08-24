//x^y . ->>??   -2^31 <= y <= +2^31  -> multiply x by y times.
//When y<0 , x= 1/x , y+.
public class PowerCalc {
    public static double pow(double x, double y){
        //Brute force
        if(y<0){
            x=1/x;
            y=-1*y;
        }
//        double result = 1;
//        for(long i=0; i< y; i++){
//            result=result*x;
//        }
//        return result;

        return fastPow(x,y);
    }

    //Fast Power Algorithm -> Recursive Approach + DP
    //x^y -> y = even -> x^(2*n)  ; y=odd => x^(2n+1)
    //x^2n => x^n=> sq(x^n/2) =>................ O(N) -> O(LOG(N))
    public static double fastPow(double x, double y){
        if(y==0) return 1.0;
        double half = fastPow(x,y/2); //time complexity O(log N)
        if(y%2==0){
            return half*half;
        }else{
            return half*half*x;
        }
    }

    public static double iterativeFastPow(double x, int y){
        if(y<0){
            x=1/x;
            y=-1*y;
        }
        double result = 1;
        double product = x;

        for(long i = y; i>0; i/=2){
            if(i%2==1){
                result = result*product;
            }
            product = product*product;

        }
        return result;

    }

    public static void main(String[] args){
        //System.out.println(pow(2.0, -10.0));
        System.out.println(iterativeFastPow(2.0, 10));
    }
}

