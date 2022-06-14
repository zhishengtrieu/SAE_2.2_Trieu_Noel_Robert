package laby;


import Algorithme.BellmanFord;
import Algorithme.Valeur;
import graphe.GrapheListe;

import java.io.IOException;

public class MainLaby {

    public static void main(String[] args) throws IOException {
        Labyrinthe laby = new Labyrinthe("labySimple/laby1.txt");
        GrapheListe g = laby.genererGraphe();

        BellmanFord bellmanFord = new BellmanFord();
        Valeur valeur = bellmanFord.resoudre(g, "(1,1)");

        System.out.println(valeur);
    }
}
