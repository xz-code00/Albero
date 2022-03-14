public class Albero{

    private Nodo radice;

    public Albero(){
        radice = null;
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
        radice = aggiungiChiave(radice, valore);
    }

    //Stampa le chiavi
    private String toString (Nodo p) {
        if(p == null)
            return "";
        return toString(p.getSinistro()) + p.getValore() + " | "  + toString(p.getDestro());
    }

    public String toString() {
        return toString(radice);
    }
}