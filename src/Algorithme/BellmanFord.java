package Algorithme;


import graphe.Arc;
import graphe.Graphe;

import java.util.ArrayList;
import java.util.List;

public class BellmanFord implements Algorithme{

    public Valeur resoudre(Graphe g, String depart){
        Valeur res = new Valeur();

        /* Initialisation */

        for(int i =0; i<g.listeNoeuds().size(); i++){
            res.setValeur(g.listeNoeuds().get(i),Double.MAX_VALUE);
            res.setParent(g.listeNoeuds().get(i),null);
            if(g.listeNoeuds().get(i).equals(depart)){
                res.setValeur(g.listeNoeuds().get(i), 0);
            }
        }

        /* Algorithm */
        /* Chaques étape va être de la taille de tous les noeuds */
        for(int i =0; i<g.listeNoeuds().size(); i++) {
            

        }

        return res;
    }
}
