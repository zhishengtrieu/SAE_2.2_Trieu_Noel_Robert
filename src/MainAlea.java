import Algorithme.BellmanFord;
import Algorithme.Dijkstra;
import Algorithme.Valeur;
import graphe.GrapheListe;

public class MainAlea {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            GrapheListe g = GenerationLabyDur.genererAlea(i);
            Dijkstra dj = new Dijkstra();
            BellmanFord bf = new BellmanFord();
            long avant = System.nanoTime();
            Valeur v1 = bf.resoudre(g,"1");
            long apres = System.nanoTime();

            long avant2 = System.nanoTime();
            Valeur v2 = dj.resoudre(g,"1");
            long apres2 = System.nanoTime();



            System.out.println((apres - avant)-(apres2 - avant2));
       /* GrapheListe g = GenerationLabyDur.genererAlea(20000);
        System.out.println(g.toGraphViz());*/
        }

    }


}
