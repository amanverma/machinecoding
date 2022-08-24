public class Factorial {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    private static int factorial(int i) {
        if(i==0 || i==1){return 1;}
        return i*factorial(i-1);
        //5* fact(4) -> 5*4*fact(3)-> 5*4*3*fact(2) -> 5*4*3*2*1
    }

    //Merge Sort -> divide the array into 2
    //smallest is single element
    //[3,2,1,6,8,5,4] ---> [3][2][1]......
    //merge --> Extra memory --> 1,2,3,4,.....
}
