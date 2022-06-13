import Algorithme.Dijkstra;
import Algorithme.Valeur;
import graphe.GrapheListe;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestDijkstra {
    @Test
    public void testBonTri() throws IOException {
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("A", "C", 12);
        g.ajouterArc("B", "C", 11);
        g.ajouterArc("C", "A", 19);

        Dijkstra dijkstra = new Dijkstra();
        Valeur valeur = dijkstra.resoudre(g,"A");
        List<String> list = valeur.calculerChemin("C");
        List<String> listIdeal = new ArrayList<>();
        listIdeal.add("A");
        listIdeal.add("C");

        assertEquals(listIdeal,list,"Mauvais chemin");
    }

    @Test
    public void testDestinationFausse(){
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);


        Dijkstra dijkstra = new Dijkstra();
        Valeur valeur = dijkstra.resoudre(g,"A");
        List<String> list = valeur.calculerChemin("Z");
        assertEquals(null,list);
    }

}
