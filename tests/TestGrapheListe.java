import graphe.GrapheListe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        g.ajouterArc("A", "D", 87);
        assertEquals("A->B(12) D(87)\n", g.toString());
    }


}
