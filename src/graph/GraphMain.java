package graph;

public class GraphMain {
    public static void main(String[] args) {
        Graph graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("B", "D");
//        graph.addEdge("D", "C");
//        graph.addEdge("A", "C");
//        graph.removeEdge("A", "E");
//        graph.removeNode("A");
//        graph.print();
//        graph.traverseDepthFirstRec("D");
//        graph.traverseDepthFirst("E");
//        graph.traverseBreadthFirst("B");
//        graph.addNode("P");
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("X");
//        graph.addEdge("X", "A");
//        graph.addEdge("X", "B");
//        graph.addEdge("A", "P");
//        graph.addEdge("B", "P");
//        System.out.println(graph.topologicalSort());
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
//        graph.addEdge("C", "B");
        System.out.println(graph.hasCycle());
    }
}
