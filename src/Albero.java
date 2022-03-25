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

        if (valore <= nodo.getValore())
            nodo.setSinistro(aggiungiChiave(nodo.getSinistro(), valore));
        else
        if(valore >= nodo.getValore())
            nodo.setDestro(aggiungiChiave(nodo.getDestro(), valore));


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
        if(p.getValore() == valore)
            return true;

        if (valore < p.getValore())
            return cercaChiave(p.getSinistro(), valore);
        else
            return cercaChiave(p.getDestro(), valore);

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

    //Calcolare l'altezza
    private int calcolaAltezza(Nodo p) {
        if (p == null)
            return -1;
        else if (calcolaAltezza(p.getSinistro()) > calcolaAltezza(p.getDestro()))
            return 1 + calcolaAltezza(p.getSinistro());
        else
            return 1 + calcolaAltezza(p.getDestro());
    }

    public int calcolaAltezza(){
        return calcolaAltezza(root);
    }

    /*Cancellazione di un nodo  NON FUNZIONANTE
    private void cancellaNodo(Nodo p, int n){
        if (p.getValore() == n)
            p = null;
        else {
            cancellaNodo(p.getDestro(), n);
            cancellaNodo(p.getSinistro(), n);
        }
    }

    public void cancellaNodo(int n){
        cancellaNodo(root, n);
    }
    */

    //Stampa indentata
    public String stampaIndentata(){
        return stampaIndentata(root,"\n");
    }
    private String stampaIndentata(Nodo p, String spazio){
        if (p == null)
            return spazio + "*";
        else 
            return spazio + p.getValore() + stampaIndentata(p.getSinistro(), spazio + "\t")
                + stampaIndentata(p.getDestro(), spazio +"\t");
    }
}
