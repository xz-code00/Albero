public class Albero{

    private Nodo radice;

    public Albero(){
        radice = null;
    }


    private Nodo aggiungiChiave(Nodo nodo, int valore){
        if (nodo == null){
            return new Nodo (valore);
        }

        if (valore < nodo.valore)
            nodo.sinistro = aggiungiChiave(nodo.sinistro, valore);
        else
            if(valore > nodo.valore)
                nodo.destro = aggiungiChiave(nodo.sinistro, valore);

        else  return nodo;   //Valore già esistente

        return nodo;

    }

    public void aggiungiChiave(int valore){
        radice = aggiungiChiave(radice, valore);
    }

    public String toString() {
        return toString(radice);
    }

    private String toString (Nodo p) {
        if(p == null)
            return "";
        return toString(p.getSinistro()) + p.getValore() + " | "  + toString(p.getDestro());
    }
}