

import java.util.Scanner;                                   // Importo la funzionalità scanner dalla libreria di java util

class Scanner {
    public static void main(String[] args) {

        Scanner fiocco=new Scanner (System.in);             // Creo un nuovo scanner di nome fiocco
        System.out.println("Metti il tuo nick");
        
        String NomeTUO=fiocco.nextLine();                   // Legge l'imput
        System.out.println("Il tuo nick è: "+NomeTUO);      // Output del nick
    }
}