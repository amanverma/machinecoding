package ds_algo.problems;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,0,5}));
    }
    public static int solution(int[] A) {
        // write your code in Java SE 8
        PriorityQueue<Integer> pq = new PriorityQueue<>(A.length, Comparator.reverseOrder());
        IntStream.of(A).forEach(x->{
            pq.add(x);
        });

        int total_pollution = IntStream.of(A).sum();
        int target_pollution = total_pollution/2;
        int filter = 0;
        //Arrays.sort(A);
        while(total_pollution>target_pollution){
            int max_pollution = pq.poll();
            total_pollution = total_pollution - max_pollution/2;
            pq.add(max_pollution/2);
            filter+=1;
        }
        return filter;
        //return minimum number of filters required to cut pollution by half
    }
}

