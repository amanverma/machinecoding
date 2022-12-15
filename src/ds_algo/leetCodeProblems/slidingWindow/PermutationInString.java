package ds_algo.leetCodeProblems.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.*/
//TC - (O(NCn))
//SC - O(N!)
public class PermutationInString {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        permute(new int[]{1,2,3});
        permuteString("abc");

    }

    private static void permuteString(String string) {
        List<String> result = new ArrayList<>();
        backtrackString(result, string.chars()
                .mapToObj(e-> (char)e).collect(Collectors.toList()), string.length(), 0 );
        result.stream().forEach(x->{
            System.out.println(x + '\n');
        });
    }

    private static void backtrackString(List<String> result,List<Character> chars,  int length, int first) {
        if(first==length) result.add((new ArrayList<>(chars)).toString());
        for(int i = first ; i < length; i ++){
            Collections.swap(chars, first, i );
            backtrackString(result, chars, length, first+1);
            Collections.swap(chars, first, i);
        }
    }

    public static void permute(int[] list){
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(Arrays.stream(list).boxed().toList());
        backtrack(output, list1, list.length,0);
        output.stream().forEach(x->{
            System.out.println(x);
            System.out.println('\n');
        });
    }

    private static void backtrack(List<List<Integer>> output, List<Integer> list, int size, int first) {
        //all integers used up
        if(first==size) output.add(new ArrayList<>(list));
        for(int i = first; i < size; i++){
            //swap i-th integer
            Collections.swap(list, first, i);
            //permute for next integer
            backtrack(output, list, size, first+1);
            //backtrack
            Collections.swap(list, first, i);
        }
    }

}



//TO compute all permutations of string, we can use Backtracking



