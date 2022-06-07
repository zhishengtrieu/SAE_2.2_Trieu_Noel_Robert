import graphe.GrapheListe;

/**
 * Main qui crée le graphe représenté dans la figure 1
 */
public class MainGraphe {

    public static void main(String[] args) {
        GrapheListe g = new GrapheListe();
        g.ajouterArc("A", "B", 12);
        g.ajouterArc("A", "D", 87);
        g.ajouterArc("B", "E", 11);
        g.ajouterArc("C", "A", 19);
        g.ajouterArc("D", "B", 23);
        g.ajouterArc("D", "C", 10);
        g.ajouterArc("E", "D", 43);
        System.out.println(g);
    }
}
