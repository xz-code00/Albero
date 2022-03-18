/*
-Stampare ordinatamente le chiavi di un albero binario;
-Cercare una chiave in un albero binario;
-Cercare una chiave in un albero binario di ricerca;
-Contare i nodi di un albero binario;
-Calcolare la somma delle chiavi di un albero;
-Verificare se tutte le chiavi di un albero binario sono pari;
-Contare le foglie di un albero binario;
-Inserire una chiave in un albero binario di ricerca;
-Dato K e N, contare i nodi di livello K;
-Calcolare l'altezza di un albero binario;
-Cancellazione di un nodo;
-Realizzare la stampa indentata.
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
    }
}
