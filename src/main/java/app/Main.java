package app;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph(4);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
        System.out.println();

        System.out.println("REMOVING EDGE");
        graph.removeEdge(2,3);
        graph.printGraph();
        System.out.println();

        graph.hasEdge(0,0);
        System.out.println();

        System.out.println("ADDING VERTEX");
        graph.addVertex(8);
        graph.printGraph();
        System.out.println();

        System.out.println("REMOVING VERTEX");
        graph.removeVertex(4);
        graph.printGraph();
        System.out.println();

        graph.hasVertex(5);


    }

}
