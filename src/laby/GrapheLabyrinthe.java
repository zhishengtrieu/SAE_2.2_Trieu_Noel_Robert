package laby;

import graphe.Arc;
import graphe.Graphe;

import java.util.ArrayList;
import java.util.List;

public class GrapheLabyrinthe implements Graphe {
    private Labyrinthe laby;

    public GrapheLabyrinthe(Labyrinthe laby) {
        this.laby = laby;
    }

    @Override
    public List<String> listeNoeuds() {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < laby.getLength(); i++) {
            for (int j = 0; j < laby.getLengthY(); j++) {
                if (!this.laby.murs[i][j]) {
                    res.add("("+i + "," + j+")");
                }
            }

        }
        return res;
    }

    @Override
    public List<Arc> suivants(String n) {
        List<Arc> res = new ArrayList<Arc>();
        n = n.substring(1, n.length() - 1);
        String[] pos = n.split(",");
        int x = Integer.parseInt(pos[0]);
        int y = Integer.parseInt(pos[1]);
        for (int[] voisin : this.laby.voisinsValides(x, y)) {
            res.add(new Arc("("+voisin[0] + "," + voisin[1]+")", 1));
        }

        return res;
    }
}
