import graphe.GrapheListe;

import static java.lang.String.valueOf;

public class GenerationLabyDur {

    public static GrapheListe genereralea(int taille) {
        GrapheListe g = new GrapheListe();
        for (int i = 0; i < taille; i++) {
            g.ajouterArc(valueOf(i), valueOf(i + 1), Math.round(Math.random() * 100));
        }
        for (int a = 0; a < taille * 3; a++) {
            g.ajouterArc(valueOf(Math.round(Math.random() * taille)), valueOf((Math.round(Math.random() * taille))), Math.round(Math.random() * 100));
        }

        return g;
    }
}
