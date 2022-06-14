package laby;


import Algorithme.BellmanFord;
import Algorithme.Dijkstra;
import Algorithme.Valeur;
import graphe.GrapheListe;

import java.io.IOException;

public class MainLaby {

    public static void main(String[] args) throws IOException {

        Dijkstra dijkstra = new Dijkstra();

        System.out.println("Partie generation de graphe");

        Labyrinthe laby = new Labyrinthe("labySimple/laby1.txt");
        GrapheListe g = laby.genererGraphe();
        Valeur valeur = dijkstra.resoudre(g, "(1,1)");
        System.out.println(valeur+"\n\n");


        System.out.println("Partie implementation de graphe");

        Labyrinthe laby2 = new Labyrinthe("labySimple/laby1.txt");
        GrapheLabyrinthe g2 = new GrapheLabyrinthe(laby2);
        Valeur valeur2 = dijkstra.resoudre(g2, "(1,1)");
        System.out.println(valeur2);

    }
}
