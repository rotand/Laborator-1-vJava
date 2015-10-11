package com.company;

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

        System.out.println("0: Iesre" + "\n1:Sortarea dupa metoda Bulelor" + "\n2:Sortarea dupa metoda Selectiei " + "\n3:Sortarea dupa metoda Quick Sort" + "\n4: Vector Random");
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
                System.out.println("\n Introduceti Inceputul apoi Sfirsitul Vectorului: \t");
                ArrayList<Integer> Mediu = createFavorabil();
                // Comanda care randomeaza lista "Collections.shuffle(list);"
                Collections.shuffle(Mediu);
                System.out.println(Mediu);
                System.out.println("\nIntroduceti numarul catat:\t");
                String cautatS = reader.readLine();
                Integer cautat = Integer.parseInt(cautatS);
                for (int i = 0; i < Mediu.size(); i++) {
                    contor++;
                    if (Mediu.get(i) == cautat)
                        System.out.println("Sau parcurs: " + contor + " cautari");
                }
                break;
            case 4:
                Mediu = createRandom();
                System.out.println(Mediu);
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
        String inceputS = reader.readLine();
        int inceput = Integer.parseInt(inceputS);

        // Introducerea Sfirsitului vectorului
        String sfirsitS = reader.readLine();
        int sfirsit = Integer.parseInt(sfirsitS);

        //Inscrierea in vector a nr
        for (int i = inceput; i <= sfirsit; i++) {

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
}
