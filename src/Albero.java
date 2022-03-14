public class Albero{

    private Nodo root;

    public Albero(){
        root = null;
    }


    //Aggiungi Chiave
    private Nodo aggiungiChiave(Nodo nodo, int valore){
        if (nodo == null){
            return new Nodo (valore);
        }

        if (valore <= nodo.valore)
            nodo.sinistro = aggiungiChiave(nodo.sinistro, valore);
        else
            if(valore >= nodo.valore)
                nodo.destro = aggiungiChiave(nodo.destro, valore);


        return nodo;

    }

    public void aggiungiChiave(int valore){
        root = aggiungiChiave(root, valore);
    }

    //Stampa le chiavi
    private String toString (Nodo p) {
        if(p == null)
            return "";
        return toString(p.getSinistro()) + p.getValore() + " | "  + toString(p.getDestro());
    }

    public String toString() {
        return toString(root);
    }


    //Cerca una chiave
    private boolean cercaChiave(Nodo p, int valore){
        if(p == null)
            return false;
        if(p.valore == valore)
            return true;

        if (valore < p.valore)
            return cercaChiave(p.sinistro, valore);
        else
            return cercaChiave(p.destro, valore);

    }

    public boolean cercaChiave(int valore){
        return cercaChiave(root, valore);
    }
}