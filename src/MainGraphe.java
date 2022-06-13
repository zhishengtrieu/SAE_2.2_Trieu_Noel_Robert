import Algorithme.BellmanFord;
import Algorithme.Dijkstra;
import Algorithme.Valeur;
import graphe.GrapheListe;

import java.io.IOException;
import java.time.temporal.Temporal;
import java.util.Timer;

/**
 * Main qui crée le graphe représenté dans la figure 1
 */
public class MainGraphe {

    public static void main(String[] args) throws IOException {

        GrapheListe g2 = new GrapheListe("Graphes/Graphe902.txt");
        BellmanFord bf = new BellmanFord();
        Dijkstra dijkstra = new Dijkstra();



       /* long tt =0;
        for (int i = 0; i < 1000; i++) {
            long date_debut = System . nanoTime () ;
            Valeur val = bf.resoudre(g2, "1");
            long date_fin = System . nanoTime () ;
            long duree = date_fin - date_debut;







            long date_debut2 = System.nanoTime () ;
            Valeur val2 = dijkstra.resoudre(g2, "1");
            long date_fin2 = System.nanoTime () ;
            long duree2 = date_fin2 - date_debut2;

            tt = tt+(duree-duree2);

        }

        tt = tt/1000;

        System.out.println(tt);*/

        long date_debut2 = System.nanoTime () ;
        Valeur val2 = dijkstra.resoudre(g2, "1");
        long date_fin2 = System.nanoTime () ;
        long duree2 = date_fin2 - date_debut2;

        long date_debut = System . nanoTime () ;
        Valeur val = bf.resoudre(g2, "1");
        long date_fin = System . nanoTime () ;
        long duree = date_fin - date_debut;

        System.out.println(val.calculerChemin("502")+"\n");
        System.out.println("Temps d'execution avec BellmanFord: " + duree + " ns");
        System.out.println("Temps d'execution avec Dijkstra: " + duree2 + " ns");
        System.out.println("-------------------------------------------------------");
        if(duree-duree2>0){
            System.out.println("Dijkstra est plus rapide de : " + (duree-duree2)+" ns");
        }else {
            System.out.println("BellmanFord est plus rapide de : " + Math.abs(duree-duree2)+" ns");
        }

}}
