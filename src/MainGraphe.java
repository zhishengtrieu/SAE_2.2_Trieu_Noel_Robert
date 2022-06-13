import Algorithme.BellmanFord;
import Algorithme.Valeur;
import graphe.GrapheListe;

import java.io.IOException;
import java.util.Timer;

/**
 * Main qui crée le graphe représenté dans la figure 1
 */
public class MainGraphe {

    public static void main(String[] args) throws IOException {

        GrapheListe g2 = new GrapheListe("Graphes/Graphe901.txt");
        System.out.println(g2);

        BellmanFord bf = new BellmanFord();
        Timer t = new Timer();
        t.schedule();
        Valeur val = bf.resoudre(g2, "A");
        System.out.println(val.calculerChemin("B"));

    }
}
