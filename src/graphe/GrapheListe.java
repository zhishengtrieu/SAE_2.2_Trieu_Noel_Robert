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
        for(int i=0;i< ensNoeuds.size();i++){
            res += ensNoeuds.get(i).getNom() + "->" ;
            for(int a=0; a< ensNoeuds.get(i).getAdj().size();a++){
                res += ensNoeuds.get(i).getAdj().get(a).toString() +"\n";
            }
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

        //on verifie si les noeuds de depart et de destination existent deja
        boolean existeDepart = false;
        boolean existeDestination = false;
        for (Noeud n : ensNoeuds){
            if (nDepart.equals(n)){
                nDepart = n;
                existeDepart = true;
            }else if (nDestination.equals(n)){
                nDestination = n;
            }
        }
        //si les noeuds n'existent pas, on les ajoute
        if (!existeDepart){
            ensNoeuds.add(nDepart);
            ensNom.add(depart);
        }
        if (!existeDestination){
            ensNoeuds.add(nDestination);
            ensNom.add(destination);
        }

        //a la fin on ajoute l'arc
        nDepart.ajouterArc(destination, cout);

    }

    public String toGraphViz() {
        String res = "";

    }

}
