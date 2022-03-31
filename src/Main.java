/*
-Stampare ordinatamente le chiavi di un albero binario;                 |
-Cercare una chiave in un albero binario;
-Cercare una chiave in un albero binario di ricerca;                    |
-Contare i nodi di un albero binario;                                   |
-Calcolare la somma delle chiavi di un albero;                          |
-Verificare se tutte le chiavi di un albero binario sono pari;          |
-Contare le foglie di un albero binario;                                |
-Inserire una chiave in un albero binario di ricerca;                   |
-Dato K e N, contare i nodi di livello K;                               |
-Calcolare l'altezza di un albero binario;                              |
-Cancellazione di un nodo;
-Realizzare la stampa indentata;
-Realizzare un metodo che verifichi se un albero binario è di ricerca;
-Scrivere un metodo che dato n€N, crei un albero binario perfettamente
bilanciato con n nodi. Nelle chiavi inserire numeri interi casuali >= 1
e <= 100. Un albero binario è perfettamente bilanciato se per ogni nodo i
numeri dei nodi dei due sottoalberi differiscono al più di 1.
 */



public class Main {

    public static void main (String args[]){

        Albero alb1 = new Albero();

        alb1.aggiungiChiave(5);
        alb1.aggiungiChiave(3);
        alb1.aggiungiChiave(7);
        alb1.aggiungiChiave(1);
        alb1.aggiungiChiave(4);
        alb1.aggiungiChiave(10);
        alb1.aggiungiChiave(6);

        System.out.println(alb1);

        System.out.println(alb1.cercaChiave(6));
        System.out.println(alb1.cercaChiave(11));

        System.out.println(alb1.contaChiavi());

        System.out.println(alb1.sommaChiavi());

        System.out.println(alb1.verificaSeTuttePari());

        System.out.println(alb1.contaFoglie());

        System.out.println(alb1.contak(3));

        System.out.println(alb1.calcolaAltezza());

        //alb1.cancellaNodo(7);
        //System.out.println(alb1);

        System.out.println(alb1.stampaIndentata());
    }
}
