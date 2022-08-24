import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {
    public static void main(String[] args){
        int arr[] = {1,3,123,212,45,87,5,2,4,7,9,11,12,16,67,74,14,99,94};
        List<Integer> arrayList = new ArrayList<>();
        Arrays.stream(arr).forEach(x->
                arrayList.add(x));
        List<Integer> result = streamsortComparator(arrayList);
        int[] result2 = streamsort(arr);
        result.stream().forEach(x->
                System.out.println(x));
        System.out.println(streamsort(arr));
    }

    private static List<Integer> streamsortComparator(List<Integer> arrayList) {
        return arrayList.stream().sorted((a,b)->{
            return a.compareTo(b);
        }).collect(Collectors.toList());
    }

    private static int[] streamsort(int[] arr) {
        return Arrays.stream(arr).sorted().toArray();

    }
}

