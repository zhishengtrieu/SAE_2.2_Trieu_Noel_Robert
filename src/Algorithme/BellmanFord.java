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
        boolean changement = true;
        // on vérifie si la ligne a changé ou non (pour savoir si on a atteint le point fixe)
        while (changement) {
            changement = false;
            // On parcours chaque noeud du graphe
            for (int i = 0; i < Q.size(); i++) {
                // On parcours chaque arc (noeuds suivants) d'un noeud
                for (Arc a : g.suivants(Q.get(i))) {
                    // Si on a trouvé une valeur plus petite qu'avant, on modifie la valeur du chemin
                    double nouvelleVal = res.getValeur(Q.get(i)) + a.getCout();
                    if (nouvelleVal < res.getValeur(a.getDest())) {
                        changement = true;
                        res.setValeur(a.getDest(), nouvelleVal);
                        res.setParent(a.getDest(), Q.get(i));
                    }
                }
            }
        }
        return res;
    }

}
