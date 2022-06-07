package graphe;

import java.util.List;

public class GrapheListe implements Graphe {
    private List<String> ensNom;
    private List<Noeud> ensNoeuds;

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

    /**
     *
     * @param depart le nom du noeud de départ
     * @param destination le nom du noeud d'arrivée
     * @param cout le cout de l'arc
     */
    public void ajouterArc(String depart, String destination, double cout){
        //on cree un nouveau noeuds de depart et de destination
        Noeud nDepart = new Noeud(depart);
        Noeud nDestination = new Noeud(destination);

        //on verifie si le noeud de depart existe deja
        boolean existeDepart = false;
        int i = 0;
        while ((!existeDepart) && (i < ensNoeuds.size())){
            Noeud n= ensNoeuds.get(i);
            if (nDepart.equals(n)){
                nDepart = n;
                existeDepart = true;
            }
            i++;
        }
        nDepart.ajouterArc(destination, cout);

    }

}
