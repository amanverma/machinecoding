import java.util.ArrayList;
import java.util.List;

public class hi {
    static List<String> result = new ArrayList<>();
    public static void main(String[] args) {
        String s = "abc";
        permute(s, 0 , s.length()-1);
        result.stream().forEach(str->
                System.out.println(str));

    }
    //A -> BC/CB , B -> AC CA , C-> AB BA
    // A -> BC CB -
    //FIrst step -> A-A

    ///

    private static void permute(String s, int start, int end) {
        if(start==end){
            result.add(s);
        }
        for(int i = start; i <=end; i ++){
            s = swap(s, start, i);
            permute(s, start+1, end); //recurse
            s = swap(s, start, i);//back track
        }

    }

    private static String swap(String s, int start, int end) {
        char[] chars = s.toCharArray();
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        return chars.toString();
    }
}
