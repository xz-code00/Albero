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

    //Conta nodi
    private int contaChiavi(Nodo p){
        if (p == null)
            return 0;
        return 1 + contaChiavi(p.getSinistro()) + contaChiavi(p.getDestro());
    }

    public int contaChiavi(){
        return contaChiavi(root);
    }

    //Calcolare somma delle chiavi
    private int sommaChiavi(Nodo p){
        if (p == null)
            return 0;
        return p.getValore() + sommaChiavi(p.getDestro()) + sommaChiavi(p.getSinistro());
    }

    public int sommaChiavi(){
        return sommaChiavi(root);
    }


    //Verifica se tutte pari
    private boolean verificaSeTuttePari(Nodo p){
        if (p == null)
            return true;
        return p.getValore() % 2 == 0 && verificaSeTuttePari(p.getSinistro()) && verificaSeTuttePari(p.getDestro());
    }

    public boolean verificaSeTuttePari(){
        if (root == null)
            return false;

        return verificaSeTuttePari(root);
    }

    //Contare le foglie
    private int contaFoglie(Nodo p){

        if (p == null)
            return 0;

        else
            if (p.getDestro() == null && p.getSinistro() == null)
                return 1;

        return contaFoglie(p.getSinistro()) + contaFoglie(p.getDestro());
    }

    public int contaFoglie(){
        return contaFoglie(root);
    }

    //Contare i nodi al livello K
    private int contaK(int k, Nodo p) {
        if (p == null)
            return 0;
        else if (k == 0)
            return 1;
        else
            return contaK(k - 1, p.getSinistro()) + contaK(k - 1, p.getDestro());
    }

    public int contak(int k){
        return contaK(k, root);
    }


}