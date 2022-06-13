import Algorithme.BellmanFord;
import Algorithme.Dijkstra;
import Algorithme.Valeur;
import graphe.GrapheListe;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestAlgorithme {

    /*
    Tests de la méthode de Djikstra
     */
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

    /*
    Tests de la méthode du point fixe
     */

    /**
     * Test de la méthode du point fixe avec un graphe "simple"
     */
    @Test
    public void testCheminMinimum_PointFixe(){
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("A", "C", 12);
        g.ajouterArc("B", "C", 11);
        g.ajouterArc("C", "A", 19);

        BellmanFord bellmanFord = new BellmanFord();
        Valeur valeur = bellmanFord.resoudre(g, "A");
        List<String> list = valeur.calculerChemin("C");
        List<String> listAttendu = new ArrayList<>();
        listAttendu.add("A");
        listAttendu.add("C");

        assertEquals(listAttendu, list, "Mauvais chemin");
    }

    /**
     * Test de la méthode du point fixe avec un graphe plus complexe
     */
    @Test
    public void testCheminMinimum_PointFixe_2(){
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("A", "D", 87);
        g.ajouterArc("B", "E", 11);
        g.ajouterArc("C", "A", 19);
        g.ajouterArc("D", "B", 23);
        g.ajouterArc("D", "C", 10);
        g.ajouterArc("E", "D", 43);

        BellmanFord bellmanFord = new BellmanFord();
        Valeur valeur = bellmanFord.resoudre(g, "A");
        List<String> list = valeur.calculerChemin("C");
        List<String> listAttendu = new ArrayList<>();
        listAttendu.add("A");
        listAttendu.add("B");
        listAttendu.add("E");
        listAttendu.add("D");
        listAttendu.add("C");

        assertEquals(listAttendu, list, "Mauvais chemin");
    }

    /**
     * Test de la méthode du point fixe avec un graphe plus "compliqué"
     */
    @Test
    public void testCheminMinimum_PointFixe_complexe() throws IOException {
        GrapheListe g = new GrapheListe("Graphes/Graphe1.txt");

        BellmanFord bellmanFord = new BellmanFord();
        Valeur valeur = bellmanFord.resoudre(g, "1");
        List<String> list = valeur.calculerChemin("10");
        List<String> listAttendu = new ArrayList<>();
        listAttendu.add("1");
        listAttendu.add("2");
        listAttendu.add("5");
        listAttendu.add("10");

        assertEquals(listAttendu, list, "Mauvais chemin");
    }


}
