import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //De verificat daca nr introdus este prim
    // De verificat daca nr inversat este la fel prim
    // Descrierea de lucru
    /* 1.Creez functia Prim care verifica daca nr este prim daca da - se afiseaza nr este prim nu invers;
     */

    public static void main(String[] args) throws IOException {
        //Aviz de a introduce
        System.out.println("Introduceti de la tastatura un numar: \n\t");
        // Creem valori pentru numarul introdus si comanda de a introduce string care se converteaza in int
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int number = Integer.parseInt(string);

        // Creem ciclul care afla daca numarul se imparte la 2 pina la numarul/2
        //Creem variabila contor boolean care va lua valurea din primul if pentru a crea a 2 if
        boolean contor = false;
        for (int i = 2; i <= number/2 ; i++) {
            contor = false;
            // creem un if care verifica daca restul numarului imartit la index este 0 atunci contorul e fals invers e true
            if (number % i == 0)
                contor = false;
            else
               contor = true;
        }
        //al 2 if care afisehaza este prim daca contorul e true si invers
        if(contor)
            System.out.println("Numarul introdus: " + number + " este prim");
        else
            System.out.println("Numarul introdus: " + number + " nu este prim");
    }
}
