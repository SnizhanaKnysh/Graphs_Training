package app;

public class Graph {

    int vertex;
    int[][] matrix;

    public Graph(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int from, int to) {
         matrix[from][to] = 1;
         matrix[to][from] = 1;
    }

    public void removeEdge(int from, int to) {
        matrix[from][to] = 0;
        matrix[to][from] = 0;
    }

    public void hasEdge(int from, int to) {
        boolean result = matrix[from][to] == 1;
        System.out.println("Checking edge between vertices " + from + " and " + to + ": " + result);

    }

    public void addVertex(int vertex) {
        if(vertex < this.vertex) {
            System.out.println("Vertex already exists");
            return;
        }

        int newSize = vertex+1;
        int[][] newMatrix = new int[newSize][newSize];

        for (int i = 0; i < this.vertex; i++) {
            for (int j = 0; j < this.vertex; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        this.matrix = newMatrix;
        this.vertex = vertex;

    }

    public void removeVertex(int vertex) {
        if(vertex > this.vertex) {
            System.out.println("Vertex does not exist");
            return;
        }
        int newSize = this.vertex-1;
        int[][] newMatrix = new int[newSize][newSize];

        int row = 0;
        for (int i = 0; i < this.vertex; i++) {
            if(i==vertex){
                continue;
            }
            int col = 0;
            for (int j = 0; j < this.vertex; j++) {
                if(j==vertex){
                    continue;
                }
                newMatrix[row][col] = matrix[i][j];
                col++;
            }
            row++;
        }
        this.matrix = newMatrix;
        this.vertex--;
    }

    public void hasVertex(int vertex) {
        boolean result = vertex  < this.vertex;
        System.out.println("Checking if the vertex " + vertex + " exists: " + result);
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j] + " ");
                }
            System.out.println();

            }

        }
}
