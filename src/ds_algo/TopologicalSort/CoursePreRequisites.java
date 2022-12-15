package ds_algo.TopologicalSort;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CoursePreRequisites {
    class GraphNode{
        public Integer inDegrees=0;
        public List<Integer> outNodes = new LinkedList<>();
    }
    public boolean canFinish(int numberOfCourses, int[][] preRequisites){
        if(preRequisites.length==0){
            return true; // no cycle can be formed in empty graph
        }
        //course ---> list of next courses
        HashMap<Integer, GraphNode> graph = new HashMap<>();

        //build the graph first
        for(int[] relation: preRequisites){
            GraphNode prevCourse = createGraphNode(graph, relation[1]);
            GraphNode nextCourse = createGraphNode(graph, relation[0]);
            prevCourse.outNodes.add(relation[0]);
            nextCourse.inDegrees+=1;
        }

        //Start from courses that have no pre-requisites
        int totalDeps = preRequisites.length;

        /*Note that we could use different types of containers, such as Queue, Stack or Set,
        to keep track of the nodes that have no incoming dependency, i.e. indegree = 0.
        Depending on the type of container, the resulting topological order would be different,
        though they are all valid.*/
        LinkedList<Integer> nodepCourses = new LinkedList<>();
        for(Map.Entry<Integer, GraphNode> entry: graph.entrySet()){
            GraphNode graphNode = entry.getValue();
            nodepCourses.add(entry.getKey());
        }
        int removedEdges = 0;
        while(nodepCourses.size()>0){
            Integer course = nodepCourses.pop();

            for(Integer nextCourse: graph.get(course).outNodes){
                GraphNode childNode = graph.get(nextCourse);
                childNode.inDegrees -=1;
                removedEdges +=1;
                if(childNode.inDegrees==0){
                    nodepCourses.add(nextCourse);
                }
            }
        }

        if(removedEdges!=totalDeps){
            //if there are still some edges left, there still exist some cycles
            //Due to the deadlock (dependencies), we cannot remove the cyclic edges
            return false;
        }else
            return true;

    }

    //retrieve existing <k,v> from graph else create a new one
    private GraphNode createGraphNode(HashMap<Integer, GraphNode> graph, int course) {
        GraphNode graphNode = null;
        if(graph.containsKey(course)){
            graphNode = graph.get(course);
        }else{
            graphNode = new GraphNode();
            graph.put(course, graphNode);
        }
        return graphNode;
    }
}

/*Complexity discussion
*Time Complexity: O(|E| + |V|)
* where |V| is the number of courses, and |E| is the number of dependencies.
*  |E| time complexity to build graph in first step
*  Similar with the above postorder DFS traversal, we would visit each vertex and
* each edge once and only once in the worst case |E| + |V|
* As a result, the overall time complexity of the algorithm would be O(2*|E| + |V|) = O(|E|+|V|)
*
*
* Space Complexity: O(|E| + |V|), with the same denotation as in the above time complexity.

We built a graph data structure in the algorithm, which would consume |E| + |V| space.
In addition, we use a container to keep track of the courses that have no prerequisite,
* and the size of the container would be bounded by |V|.
As a result, the overall space complexity of the algorithm would be O(|E|+2*|V|) => O(|E|+|V|)
*
*
* */
