import java.util.ArrayList;

public class blocks {
    public int solution(int[] A){
        int numberOfBrushStrokes = 0;

        int totalHeight = 0;



        final ArrayList<Integer> activeBrushStrokes = new ArrayList<Integer>(); // depending on this being insertion-order.



        for (int i = 0; i < A.length; i++)

        {

            int height = A[i];



            if (totalHeight > height)

            {

                // remove block(s) - add another if necessary.



                for (int j = activeBrushStrokes.size() - 1; j >= 0; j--) // first trouble - how do we scan and remove lesser blocks in O(N) time... is it still O(N)?

                {

                    int latestBlock = activeBrushStrokes.get(j);

                    activeBrushStrokes.remove(j);

                    totalHeight -= latestBlock;




                    if ((totalHeight) <= height) // removed the latest block and now we're not too high.

                    {

                        // we're done.

                        break;

                    }

                }



                // adding the other if necessary.

                if (totalHeight < height)

                {

                    int newBlock = height - totalHeight;

                    totalHeight += newBlock;

                    activeBrushStrokes.add(newBlock);

                    numberOfBrushStrokes++;

                }



            }

            else if (totalHeight == height)

            {

                continue;

            }

            else

            {

                int newBlock = height - totalHeight;

                activeBrushStrokes.add(newBlock);

                totalHeight += newBlock;




                // add a block. increase total height.

                numberOfBrushStrokes++;

            }

        }
        return numberOfBrushStrokes;




    }
}
