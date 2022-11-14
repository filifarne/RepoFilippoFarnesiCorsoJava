
import java.util.Scanner;

public class CicliEIteratori {
    public static void main(String[] args) {

        // Variabile dichiarata per la prima prova scritta del while
        int A=2;
   
        while (!(A!=2)&&A==2){
            // Primo esempio scritto di while
            // In questo caso è una doppia verifica per la stessa condizione, una per doppia negazione e una diretta
        }   // Chiusura while di prova

        int iProva=0;   // Possiamo creare uno scanner, far si che venga scelto da un if
        while (iProva<3){
            System.out.println(iProva);
            iProva++;
        }   // Chiusura while di prova

        // ESERCIZIO

        // Dichiaro e valorizzo le tre variabili dell'esercizio come da consegna
        int X=11;
        int Y=22;
        double Z=12.5;

        // Dichiaro e valorizzo variabili di controllo e lo scanner
        boolean controllofinale=true;
        boolean controllosingolo;
        boolean yn=true;
        String ordine;
        double varselezionata;
        double valoreoperazione;
        Scanner comando=new Scanner(System.in);
                                                        //System.out.println();
                                                        //=comando.next();
                                                        //
        // Apertura Menù
        do {
            // Scelta operazione
            System.out.println("Inserici comando con iniziale maiuscola");
            ordine=comando.next();
            
            // If di "Aggiungi"
            if (ordine.equals("Aggiungi")){

                // Inizio ciclo somma
                do {

                    // Scelta della variabile
                    System.out.println("Scegli e digita uno tra i seguenti valori: "+X+" / "+Y+" / "+Z);
                    varselezionata=comando.next();

                    // If in caso di scelta della variabile "X"
                    if (varselezionata==X){
                        System.out.println("Di quanto vuoi incrementare "+X+"?");
                        valoreoperazione=comando.next();    // Valorizzo "valoreoperazione" con l'imput dell'utente
                        X=X+valoreoperazione;
                        System.out.println("Se vuoi continuare ad aggiungere digita 'Yes'. Altrimenti digita 'No'.");
                        ordine=comando.next();
                        if (ordine.equals("No")){
                        controllosingolo=false;
                        }
                    }

                    // Else if in caso di scelta della variabile "Y"
                    else if (varselezionata==Y){
                        System.out.println("Di quanto vuoi incrementare "+Y+"?");
                        valoreoperazione=comando.next();    // Valorizzo "valoreoperazione" con l'imput dell'utente
                        Y=Y+valoreoperazione;
                        System.out.println("Se vuoi continuare ad aggiungere digita 'Yes'. Altrimenti digita 'No'.");
                        ordine=comando.next();
                        if (ordine.equals("No")){
                            controllosingolo=false;
                        }
                        else if (ordine.equals("Yes")){
                            controllosingolo=true;
                        }
                    }

                    // Else if in caso di scelta della variabile "Z"
                    else if (varselezionata==Z){
                        System.out.println("Di quanto vuoi incrementare "+Z+"?");
                        valoreoperazione=comando.next();    // Valorizzo "valoreoperazione" con l'imput dell'utente
                        Z=Z+valoreoperazione;
                        System.out.println("Se vuoi continuare ad aggiungere digita 'Yes'. Altrimenti digita 'No'.");
                        ordine=comando.next();
                        if (ordine.equals("No")){
                        controllosingolo=false;
                        }
                    }

                    // Else in caso di errori di battitura durante la scelta della variabile
                    else {
                        System.out.println("Il valore digitato non è presente tra quelli proposti.");
                    }
                }
                while (controllosingolo==false);
            }
            
            else if (ordine.equals("Sottrai")){

            }

            else if (ordine.equals("Stampa")){

            }

            else if(ordine.equals("Esci")){
                controllofinale=false;
            }

            else {
                System.out.println("Comando non valido.");
            }

        }   // Chiusura do
        while (controllofinale==false);
        System.out.println("Grazie e arrivederci");
    }   // Chiusura Main
}   // Chiusura CicliEIteratori