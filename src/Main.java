import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    //De verificat daca nr introdus este prim
    // De verificat daca nr inversat este la fel prim
    // Descrierea de lucru
    // 1.Creez functia Prim care verifica daca nr este prim daca da - se afiseaza nr este prim nu invers;
    // 2.Cream functia InversNumber care Inverseaza numarul
    // 3. Cream functiea main in care cream un switch si putem alege operatiile dorite


  public static int Prim(int number) throws IOException {

        //Creem ciclul care afla daca numarul se imparte la 2 pina la numarul/2
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
      return number;
    }
    //2. Functia InverNumber ce inverseaza numarul
    public static int InversNumber(int value){
        //Variabila result care va salva numarul inversat
        int result = 0;
        //Ciclul while care indepleneste cit timp numarul e mai mare zero
        while(value > 0) {
            // ex 0 = 0*10 + 123 % 10 => 3
            result = result * 10 + value % 10;
            //ex next 123 = 123 / 10 => 12
            value /= 10;
        }
        return result;
    }
    public static void main(String[] args)  throws IOException {
        // trebue sa introducem numarul pe care vrem sal supunem testarii
        System.out.println("Introduceti de la tastatura un numar: \n\t");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int number = Integer.parseInt(string);
        //Printam pe ecran testarile posibile
        System.out.println("Introduceti Numarul operatiei dorite conform exemplului: \n\t" +
                            "1:Verifica daca numarul introdus este Prim.\n\t"+
                            "2:Verifica daca numarul Inversat este Prim\n\t");

        //Posibilitatea de a introduce de la tastatura numarul operatiei
        String choose = reader.readLine();
        int alege = Integer.parseInt(choose);
        //Echivalenta pentru switch va fi numita variabila Alege
        //Cream Switch care ne va permite sa alegem operatia dorita
        switch (alege){
            case 1 :
                Prim(number);
                break;
            case 2:
                Prim(InversNumber(number));
                break;
            default:
                System.out.println("Numarul operatiei INEXISTENT mai incercati");
        }
    }
}
