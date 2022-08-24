import java.util.ArrayList;
import java.util.List;


public class StringPermutation {
    static List<String> list = new ArrayList<>();


    public static void main(String[] args){
        String s = "abcdef";
        permute(s,0 , s.length()-1);
        list.stream().forEach(str->{
                System.out.println(str);
		});

    }

    public static void permute(String s, int start, int end){
        if(start==end){
            list.add(s);
        }
        for(int i = start; i <=end; i++){
            s = swap(s, start, i);
            permute(s, start+1, end);
            s = swap(s, start, i);
        }


    }

    public static String swap(String s, int i, int j){
        char[] chars = s.toCharArray();
        char t = chars[i];
        chars[i] = chars[j];
        chars[j] = t;
        return String.valueOf(chars);

    }
}

