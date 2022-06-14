import graphe.GrapheListe;

import static java.lang.String.valueOf;

public class GenerationLabyDur {

    public static GrapheListe genererAlea(int taille) {
        GrapheListe g = new GrapheListe();

        for (int i = 0; i < taille; i=i+10) {
            g.ajouterArc(valueOf(i), valueOf(i + 1), Math.round(Math.random() * 100));
        }

            for (int a = 0; a < 3*taille; a++) {
                g.ajouterArc(valueOf(Math.round(Math.random() * taille)), valueOf((Math.round(Math.random() * taille))), Math.round(Math.random() * 100));
            }

        return g;
    }
}
