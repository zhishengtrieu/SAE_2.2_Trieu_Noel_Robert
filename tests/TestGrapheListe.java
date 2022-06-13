import graphe.GrapheListe;
import org.junit.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestGrapheListe {

    @Test
    public void test_ajouterArc() {
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("A", "D", 87);
        g.ajouterArc("B", "E", 11);
        assertEquals(4, g.listeNoeuds().size());
        assertEquals(2, g.suivants("A").size());
        assertEquals(1, g.suivants("B").size());

    }


    @Test
    public void test_toString() {
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        assertEquals("A -> B(12.0) \n", g.toString());
    }

    @Test
    public void test_constructeur_fichier() throws IOException {
        GrapheListe g = new GrapheListe("Graphes/Graphe1.txt");
        assertEquals(10, g.listeNoeuds().size());
        assertEquals(2, g.suivants("1").size());
        assertEquals(4, g.suivants("2").size());
    }

    @Test
    public void test_constructeur_fichier_inexistant()  {
        assertThrows(IOException.class, () -> {
            GrapheListe g = new GrapheListe("");
        });
    }

    @Test
    public void test_toGraphViz(){
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("A", "D", 87);
        assertEquals("digraph {\n" +
                "A -> B[label = 12.0]\n" +
                "A -> D[label = 87.0]\n" +
                "}", g.toGraphViz());
    }


}
