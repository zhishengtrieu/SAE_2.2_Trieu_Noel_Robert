package Algorithme;


import graphe.Arc;
import graphe.Graphe;

import java.util.ArrayList;

public class BellmanFord implements Algorithme{

    public Valeur resoudre(Graphe g, String depart){
        /* Initialisation */
        Valeur res = Algorithme.initialiser(g, depart);
        ArrayList<String> Q = new ArrayList<String>(g.listeNoeuds());

        /* Algorithm */
        /* Chaques étape va être de la taille de tous les noeuds */


        }

        return res;
    }
}
