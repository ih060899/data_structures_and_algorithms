package graph;

public class WeightedGraphMain {
    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addEdge("A", "B", 1);
//        graph.addEdge("B", "C", 2);
//        graph.addEdge("C", "A",8);
//        graph.addEdge("A", "C", 10);
//        graph.print();
//        Path path = graph.getShortestPath("A", "D");
//        System.out.println(path);
//        System.out.println(graph.hasCycle());

//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B", 3);
//        graph.addEdge("B", "D", 4);
//        graph.addEdge("C", "D", 5);
//        graph.addEdge("A", "C", 1);
//        graph.addEdge("B", "C", 2);
        graph.print();

        WeightedGraph tree = graph.getMinimumSpanningTree();
        System.out.println("Tree :");
        tree.print();
    }
}
