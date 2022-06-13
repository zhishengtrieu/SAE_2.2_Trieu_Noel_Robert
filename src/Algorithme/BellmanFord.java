package Algorithme;


import graphe.Arc;
import graphe.Graphe;

import java.util.ArrayList;

public class BellmanFord implements Algorithme {

    public Valeur resoudre(Graphe g, String depart) {
        /* Initialisation */
        Valeur res = Algorithme.initialiser(g, depart);
        ArrayList<String> Q = new ArrayList<String>(g.listeNoeuds());

        /* Algorithm */
        /* Chaques étape va être de la taille de tous les noeuds */

        boolean changement = true;
        while (changement) {
            changement = false;
            for (int i = 0; i < Q.size(); i++) {
                for (Arc a : g.suivants(Q.get(i))) {
                    if (res.getValeur(Q.get(i)) + a.getCout() < res.getValeur(a.getDest())) {
                        changement = true;
                        res.setValeur(a.getDest(), res.getValeur(Q.get(i)) + a.getCout());
                        res.setParent(a.getDest(), Q.get(i));
                    }
                }

            }
        }

        return res;
    }
}
