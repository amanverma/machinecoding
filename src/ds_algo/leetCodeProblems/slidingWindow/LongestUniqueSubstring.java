package ds_algo.leetCodeProblems.slidingWindow;

import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        //System.out.println(getUniqueCharacterSubstring("CODINGISAWESOME"));
        System.out.println(getLengthofUniqueSubstring("CODINGISAWESOME"));
//        System.out.println(getLongestSubstring("sassslkkljkljkjssnmnmxnvhiohfh"));
    }

    private static void getLongestSubstring(String input) { //n2 approach
        List<String> allSubstrings = new ArrayList<>();
        for(int i = 0 ; i < input.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j = i ; j < input.length(); j++){
                if(set.contains(input.charAt(j))){
                    allSubstrings.add(input.substring(i, j));
                    break;
                }
                set.add(input.charAt(j));
            }
        }
        allSubstrings.stream().forEach(x->{
            System.out.println(x +'\n');
        });
    }

    public static String getUniqueCharacterSubstring(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    //Approach with even shorter run time - O(m) -> m = character set
    /*int[26] for Letters 'a' - 'z' or 'A' - 'Z'
int[128] for ASCII
int[256] for Extended ASCII*/
    public static int getLengthofUniqueSubstring(String s){
        Integer[] chars = new Integer[128];
        int left=0, right = 0;
        int res = 0 ;

        while(right<s.length()){
            char c = s.charAt(right);
            Integer index = chars[c];
            if(index!=null && index>=left && index<right){
                left = index+1;
            }
            if(res<right-left+1){
                res = right-left+1;
            }
            chars[c] = right;
            right++;
        }
        return res;
    }
}
