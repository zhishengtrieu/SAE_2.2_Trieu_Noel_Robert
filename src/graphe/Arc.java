package graphe;

public class Arc {
    private String dest;
    private double cout;

    public Arc(Noeud n, double cout) {
        this.dest = n.getNom();
        //si le cout est négatif, on le met à 0
        //si il est positif, on l'affecte au cout
        this.cout = cout>0?cout:0;
    }



}
