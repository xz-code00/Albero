public class Nodo {
    private int valore;
    private Nodo sinistro, destro;

    public Nodo(int valore){
        this.valore = valore;
        sinistro = null;
        destro = null;
    }

    public void setValore (int valore){
        this.valore = valore;
    }

    public void setSinistro (Nodo sinistro) {
        this.sinistro = sinistro;
    }

    public void setDestro (Nodo destro) {
        this.destro = destro;
    }

    public int getValore () {
        return valore;
    }

    public Nodo getSinistro () {
        return sinistro;
    }

    public Nodo getDestro () {
        return destro;
    }
}