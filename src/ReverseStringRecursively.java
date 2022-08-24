public class ReverseStringRecursively {
    public static char[] reverseString(char[] s){
        return reverseS(0, s.length-1, s);
    }

    private static char[] reverseS(int start, int end, char[] s) {
        if(start>=end){
            return s;
        }
        char c = s[start];
        s[start] = s[end];
        s[end] = c;
        return reverseS(start+1, end-1, s);
    }

    public static  void main(String[] args){
        String str = "hello";
        System.out.println(reverseString(str.toCharArray()));
    }
}
