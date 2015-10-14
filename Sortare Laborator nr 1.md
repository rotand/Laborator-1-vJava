/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package analiza.sortare.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
1 Realizat o functie care creaza un vector cu introducerea de inceput de vector si sfirshit de vector
2 Cu case eu aleg ce caz supun verificarii
3 eu introduc cheea cautata si se afisheaza contorul (cite ori a fost parcurs acest vector)
4
 */

public class Main {

    public static void main(String[] args) throws IOException {

        int inceput, sfirshit, contor = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("0: Iesre" + "\n1:Sortarea dupa metoda Bulelor" + "\n2:Sortarea dupa metoda Selectiei " + 
                "\n3:Sortarea dupa metoda Quick Sort" + "\n4: Cautare Secventiala Clasica" + "\n5:Secvential intrun Vector Ordonat " + "\n6: Cautare Binara inrun vector ordonat");
        System.out.println("\nIntroduceti operatiea dorita :\t");
        String keyS = reader.readLine();
        int key = Integer.parseInt(keyS);


        switch (key) {

            case 1:
                ArrayList<Integer> buble = createRandom();
                System.out.println(buble);
                bubbleSort(buble);
                System.out.println(buble);
                break;
            case 2:
                ArrayList<Integer> secvential = createRandom();
                System.out.println(secvential);
                selectionSort(secvential);
                System.out.println(secvential);

                break;
            case 3:
              
                break;
            case 4:
                    System.out.println("Cautare secventiala clasica");
                    ArrayList<Integer> SecventialaClasica = createRandom();
                    System.out.println("Vectorul Secvential Clasic");
                    System.out.println(SecventialaClasica);
                    System.out.println("Introduceti nr cautat");
                     String keeS = reader.readLine();
                    int kee = Integer.parseInt(keeS);
                    KeySearch (SecventialaClasica, kee);
                break;
                
            case 5:
                System.out.println("Secventiala intrun vector ordonat");
                ArrayList<Integer> SecventialOrdonat =createFavorabil();
                System.out.println(SecventialOrdonat);
                break;
                
            default:
                break;
        }

    }

    //Creem Veector pentru Cazul Favorabil si Mediu si Nefavorabil
    public static ArrayList<Integer> createFavorabil() throws IOException {
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Introducerea inceputului vectorului
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduceti marimea vectorului");
        // Introducerea Sfirsitului vectorului
        String sfirsitS = reader.readLine();
        int sfirsit = Integer.parseInt(sfirsitS);

        //Inscrierea in vector a nr
        for (int i = 0; i <= sfirsit; i++) {
               
            result.add(i);

        }
        return result;
    }

    // cream un vector random
    public static ArrayList<Integer> createRandom() throws IOException {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Random random = new Random();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduceti cite numere trebue sa fiba in vector\n");
        String sfirsitS = reader.readLine();
        int sfirsit = Integer.parseInt(sfirsitS);

        //Inscrierea in vector a nr
        for (int i = 0; i <= sfirsit; i++) {
            result.add(random.nextInt(400));
        }
        return result;
    }

    // Bubble Sort
    static int bubbleSort(ArrayList<Integer> list) {
        int contor = 0;
        Date currentTime = new Date();
        int count = 0;
        for (int outer = 0; outer < list.size() - 1; outer++) {
            for (int inner = 0; inner < list.size() - outer - 1; inner++) {
                if (list.get(inner) > list.get(inner + 1)) {
                    swapEm(list, inner);
                    count = count + 1;
                    contor++;
                }
            }
        }
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Timpul parcurs a sortarii Bulelor este: " + msDelay + " ms" + "\nAu fost parcurse: " + contor + " operatii");
        return count;
    }

    static void swapEm(ArrayList<Integer> list, int inner) {
        int temp = list.get(inner);
        list.set(inner, list.get(inner + 1));
        list.set(inner + 1, temp);
    }

    //Sortarea Secventiala
    public static void selectionSort(ArrayList<Integer> data) {
        Date currentTime = new Date();
        int contor = 0;
        // just return if the array list is null
        if (data == null)

            return;

        // just return if the array list is empty or only has a single element
        if (data.size() == 0 || data.size() == 1)
            return;

        // declare an int variable to hold value of index at which the element
        // has the smallest value
        int smallestIndex;

        // declare an int variable to hold the smallest value for each iteration
        // of the outer loop
        int smallest;

        // for each index in the array list
        for (int curIndex = 0; curIndex < data.size(); curIndex++) {

			/* find the index at which the element has smallest value */
            // initialize variables
            smallest = data.get(curIndex);
            smallestIndex = curIndex;

            for (int i = curIndex + 1; i < data.size(); i++) {
                if (smallest > data.get(i)) {
                    contor++;
                    // update smallest
                    smallest = data.get(i);
                    smallestIndex = i;
                }
            }

			/* swap the value */
            // do nothing if the curIndex has the smallest value
            if (smallestIndex == curIndex)
                ;
                // swap values otherwise
            else {

                int temp = data.get(curIndex);
                data.set(curIndex, data.get(smallestIndex));
                data.set(smallestIndex, temp);
            }

        }
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Timpul parcurs a sortarii Secventiale este: " + msDelay + " ms" + "\nAu fost parcurse: " + contor + " operatii");
    }

   public static int KeySearch (ArrayList<Integer> data, int key){
       int contor = 1;
       for (int i = 0; i < data.size(); i++) {
           if(key==data.get(i))
                    System.out.println(contor);
                else
                    contor++;
           
       }
       return 0;
   }
}
