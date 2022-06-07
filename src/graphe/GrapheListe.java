package graphe;

import java.util.List;

public class GrapheListe implements Graphe {
    private List<String> ensNom;


    @Override
    public List<String> listeNoeuds() {
        // TODO: 07/06/2022
    }

    @Override
    public List<Arc> suivants(String n) {
        // TODO: 07/06/2022
    }


    @Override
    public String toString() {
        String res = "";
        for(int i=0;i< ensNom.size();i++){
            res +=
        }

        return res;
    }
}
