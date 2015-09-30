/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analiza.sortare.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.exit;

/**
 *
 * @author A.R
 */
public class AnalizaSortare1 {

    /**
     * @param args the command line arguments
     */
    int cautat;
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduceti numarul cautat");
        String string = reader.readLine();
        int cautat = Integer.parseInt(string);
        // TODO code application logic here
        //Vector cazul neordonat
        int[] ListNeordonat = new int[10];
        ListNeordonat[0]= 2;
        ListNeordonat[1]= 1;
        ListNeordonat[2]= 3;
        ListNeordonat[3]= 4;
        ListNeordonat[4]= 6;
        ListNeordonat[5]= 5;
        ListNeordonat[6]= 8;
        ListNeordonat[7]= 7;
        ListNeordonat[8]= 10;
        ListNeordonat[9]= 9;
        
         //Vector cazul favorabil
        int[] ListFavorabil = new int[10];
        ListFavorabil[0]= 1;
        ListFavorabil[1]= 2;
        ListFavorabil[2]= 3;
        ListFavorabil[3]= 4;
        ListFavorabil[4]= 5;
        ListFavorabil[5]= 6;
        ListFavorabil[6]= 7;
        ListFavorabil[7]= 8;
        ListFavorabil[8]= 9;
        ListFavorabil[9]= 10;
        
         //Vector cazul Nefavorabil
        int[] ListNefavorabil = new int[10];
        ListNefavorabil[0]= 10;
        ListNefavorabil[1]= 9;
        ListNefavorabil[2]= 8;
        ListNefavorabil[3]= 7;
        ListNefavorabil[4]= 6;
        ListNefavorabil[5]= 5;
        ListNefavorabil[6]= 4;
        ListNefavorabil[7]= 3;
        ListNefavorabil[8]= 2;
        ListNefavorabil[9]= 1;
        boolean contor = false;
        int contor2 = 0;
       
        // Cazul Favorabil
        
        System.out.println("\n\t Organizarea elementelor vectorului pentru cazul Favorabil\n");
        for (int i = 0; i < ListFavorabil.length; i++) {
            int j = ListFavorabil[i];
            if(j == cautat){
                contor = true;
                break;
            }
            else{
            contor2++;
            }
        }
        
            if(contor == true)
                System.out.println("Numarul: " + cautat + " este in masiv" + 
                         "\n Au fost efectuate " + contor2 + " cautari");
            else
                System.out.println("Numarul dat nu este in masiv" + contor2);
            contor2 = 0;
            contor = false;
         // Verificare cazul Nefavorabil
        System.out.println("\n\t Organizarea elementelor vectorului pentru cazul Nefavorabil\n");
        for (int i = 0; i < ListNefavorabil.length; i++) {
            int j = ListNefavorabil[i];
            if(j == cautat){
                contor = true;
                break;
            }
            else{
            contor2++;
            }
        }
            if(contor == true)
                System.out.println("Numarul: " + cautat + " este in masiv" + 
                         "\n Au fost efectuate " + contor2 + " cautari");
            else
                System.out.println("Numarul dat nu este in masiv" + contor2);
            
            contor2 = 0;
            contor = false;
         //Cazul mediu
        System.out.println("\n\t Organizarea elementelor vectorului pentru cazul Mediu\n");
        for (int i = 0; i < ListNeordonat.length; i++) {
            int j = ListNeordonat[i];
            if(j == cautat){
                contor = true;
                break;
            }
            else{
            contor2++;
            }
        }
            if(contor == true)
                System.out.println("Numarul: " + cautat + " este in masiv" + 
                         "\n Au fost efectuate " + contor2 + " cautari");
            else
                System.out.println("Numarul dat nu este in masiv" + contor2);
    }
  
    
}
