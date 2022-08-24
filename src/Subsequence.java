import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.lang.Math.max;
/*
* Approaches-> Greedy Approach and Dynamic programming (Memoization and Tabulation)
* DP -> Memoization = Recursive, Tabulation = Iterative
* */

public class Subsequence {
    public static boolean isSubsequence(String s, String t) {
        int j=0;
        for(int i = 0 ;  i < t.length(); i++){
            if(j < s.length() && (s.charAt(j)==t.charAt(i)))
                j++;
        }
        if(j==s.length())
            return true;
        return false;
    }
    public static void main(String[] args){
        //System.out.println(isSubsequence("ahbgdck","abk"));
        //System.out.println(isSubsequence("abk","ahbgdck"));
        String target = "adkjdkfbcskajkjkdlklkaea";
        List<String> stringList = new ArrayList<>();
        stringList.add("ab");
        stringList.add("abc");
        stringList.add("abcd");
        stringList.add("abcde");
        stringList.add("abz");
        stringList.add("wqkjh");
        List<String> subSeqStrings = getMultipleStringSubsequence(stringList,target);
        subSeqStrings.stream().forEach(s-> System.out.println(s));


        System.out.println("===LONGEST COMMON SUBSEQUENCE===");
        String s1 = "abcwqerqreq";
        String s2 = "abcdefghijkl";
        System.out.println(longestCommonSubsequence(s1,
                s2, s1.length(), s2.length()));
        System.out.println(longestCommonSubsequence2(s1,
                s2, s1.length(), s2.length()));
    }

    public static List<String> getMultipleStringSubsequence(List<String> strings, String t){
        List<String> output = new ArrayList<>();
        HashMap<Character, ArrayList<Integer>> targetHashMap = new HashMap<>();
        //create hash map with target char and index of each char
        for(int i=0; i<t.length(); i++){
            if(!targetHashMap.containsKey(t.charAt(i))){
                targetHashMap.put(t.charAt(i),new ArrayList<>());
            }
            targetHashMap.get(t.charAt(i)).add(i);
        }
        strings.stream().forEach(s->{
            int current =-1; //keeps track of target string and will always be in monotonically increasing order
            boolean isMatch = false;
            for(int j=0; j< s.length(); j++){
                char c = s.charAt(j);
                if(!targetHashMap.containsKey(c)){
                    isMatch = false;
                    break;
                }else{
                    List<Integer> indicesArray = targetHashMap.get(s.charAt(j));
                    //greedy match with linear search//
                    for(Integer index : indicesArray){
                        if(current < index){
                            current = index;
                            isMatch = true;
                            break;
                        }
                    }
                }
            }
            if(isMatch){
                output.add(s);
            }
        });
        return output;
    }

    /*
    One of the most toughesst problem in Dynamic Programming
    Solution
    String1 = [dlakjdlkajdlkajsdkjakdlsjklajdlaskjdzvzvvewqdsaddkjkjanfjd]
    String2 = [dljsvnfslngslfnldsnvmljdzsnvlsdahlfhalncnncvmzvcladnljfcnalnclj]
    Recursive Approach
    Base case -> if s1 or s2 length is 0 return 0;
    Two Scenarios
    Scenario1 => First String process next element after i; process only remaining string in String 2 +1
    Scenario2 => First String process next element after i; process only left half of string2.
    * */
    //Excellent Question
    public static int longestCommonSubsequence(String s1, String s2, int l1, int l2){
        if(l1==0 || l2==0){
            return 0;
        }
        if(s1.charAt(l1-1)==s2.charAt(l2-1)){
            return 1+ longestCommonSubsequence(s1, s2, l1-1, l2-1);
        }else{
            return max(longestCommonSubsequence(s1, s2, l1, l2-1),
                    longestCommonSubsequence(s1, s2, l1-1, l2));
        }
        //Time complexity of the above naive recursive approach is O(2^n) in worst case
        // and worst case happens when all characters of X and Y mismatch i.e., length of LCS is 0.
        //Some sub problems are solved twice.
        //Memoize or Tabulate the above solution for Optimisation
    }

    public static int longestCommonSubsequence2(String s1, String s2, int l1, int l2){
        int L[][] = new int[l1+1][l2+1];
        /* Following steps build L[m+1][n+1] in bottom up fashion. Note
        that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */

        for (int i=0; i<=l1; i++)
        {
            for (int j=0; j<=l2; j++)
            {
                if (i == 0 || j == 0)
                    L[i][j] = 0;
                else if (s1.charAt(i-1) == s2.charAt(j-1))
                    L[i][j] = L[i-1][j-1] + 1;
                else
                    L[i][j] = max(L[i-1][j], L[i][j-1]);
            }
        }
        return L[l1][l2];

    }

}
