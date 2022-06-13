import Algorithme.*;
import graphe.GrapheListe;

import java.io.IOException;

/**
 * Main qui crée le graphe représenté dans la figure 1
 */
public class MainPointFixe {

    public static void main(String[] args) throws IOException {

        GrapheListe g2 = new GrapheListe("Graphes/Graphe1.txt");
        BellmanFord bellmanFord = new BellmanFord();
        System.out.println(bellmanFord.resoudre(g2,"1"));
        System.out.println(bellmanFord.resoudre(g2,"1").calculerChemin("10"));

    }
}
