import Algorithme.BellmanFord;
import Algorithme.Dijkstra;
import graphe.GrapheListe;

import java.io.IOException;

public class MainDjikstra {

    public static void main(String[] args) throws IOException {
        GrapheListe g2 = new GrapheListe("Graphes/Graphe1.txt");
        Dijkstra dijkstra = new Dijkstra();
        System.out.println(dijkstra.resoudre(g2,"1"));
        System.out.println(dijkstra.resoudre(g2,"2").calculerChemin("10"));
    }
}
