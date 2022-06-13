package Algorithme;


import graphe.Arc;
import graphe.Graphe;

import java.util.ArrayList;

public class BellmanFord implements Algorithme {

    public Valeur resoudre(Graphe g, String depart) {
        /* Initialisation */
        Valeur res = Algorithme.initialiser(g, depart);
        // Liste des noeuds du graphe
        ArrayList<String> Q = new ArrayList<String>(g.listeNoeuds());

        /* Algorithme */
        /* Chaque étape va être de la taille de tous les noeuds */
        for (int i = 1; i < Q.size(); i++) {
            for (Arc a : g.suivants(Q.get(i))) {
                if (res.getValeur(Q.get(i)) + a.getCout() < res.getValeur(a.getDest())) {
                    res.setValeur(a.getDest(), res.getValeur(Q.get(i)) + a.getCout());
                    res.setParent(a.getDest(), Q.get(i));
                }
            }

        }

        return res;
    }
}
