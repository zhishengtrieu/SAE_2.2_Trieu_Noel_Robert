import graphe.GrapheListe;

public class MainAlea {
    public static void main(String[] args) {/*
        for (int i = 0; i < 5000; i++) {
            long avant = System.nanoTime();
            GrapheListe g = GenerationLabyDur.genereralea(i);
            long apres = System.nanoTime();
            System.out.println(apres-avant);*/

        GrapheListe g = GenerationLabyDur.genereralea(15);
        System.out.println(g.toGraphViz());
    }

}



