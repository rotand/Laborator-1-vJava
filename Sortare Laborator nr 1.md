package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        System.out.println("\nIntroduceti operatiea dorita :\t");

        String keyS = reader.readLine();
        int key = Integer.parseInt(keyS);


        // ArrayList<Integer> NeFavorabil = createNeFavorabil();
        // ArrayList<Integer> Mediu = createFavorabil();



        switch (key)
        {
            case 1:
                System.out.println("\n Introduceti Inceputul apoi Sfirsitul Vectorului: \t");
                ArrayList<Integer> Favorabil = createFavorabil();
                System.out.println("\nIntroduceti numarul catat:\t");
                String cautatS = reader.readLine();
                int cautat = Integer.parseInt(cautatS);
                for (int i = 0; i < Favorabil.size() ; i++) {
                    contor++;
                    if(Favorabil.get(i) == cautat)
                        System.out.println("Sau parcurs: " + contor + " cautari");
                }
                break;
            case 2:
                System.out.println("\n Introduceti Inceputul apoi Sfirsitul Vectorului: \t");
                ArrayList<Integer> NeFavorabil = createNeFavorabil();
                System.out.println("\nIntroduceti numarul catat:\t");
                 cautatS = reader.readLine();
                 cautat = Integer.parseInt(cautatS);
                for (int i = 0; i < NeFavorabil.size() ; i++) {
                    contor++;
                    if(NeFavorabil.get(i) == cautat)
                        System.out.println("Sau parcurs: " + contor + " cautari");
                }
                break;
            case 3:
                System.out.println("\n Introduceti Inceputul apoi Sfirsitul Vectorului: \t");
                ArrayList<Integer> Mediu = createFavorabil();
                // Comanda care randomeaza lista "Collections.shuffle(list);"
                Collections.shuffle(Mediu);
                System.out.println(Mediu);
                System.out.println("\nIntroduceti numarul catat:\t");
                 cautatS = reader.readLine();
                 cautat = Integer.parseInt(cautatS);
                for (int i = 0; i < Mediu.size() ; i++) {
                    contor++;
                    if(Mediu.get(i) == cautat)
                        System.out.println("Sau parcurs: " + contor + " cautari");
                }
                break;
            default:
                break;
        }

    }
    //Creem Veector pentru Cazul Favorabil si Mediu
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
        for (int i = inceput; i < sfirsit; i++) {

            result.add(i);

        }
        return result;
    }

    //Cream vector pentru cazul nefavorabil
    public static ArrayList<Integer> createNeFavorabil() throws IOException {
        ArrayList<Integer> result = new ArrayList<Integer>();

        // Introducerea inceputului vectorului
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inceputS = reader.readLine();
        int inceput = Integer.parseInt(inceputS);

        // Introducerea Sfirsitului vectorului
        String sfirsitS = reader.readLine();
        int sfirsit = Integer.parseInt(sfirsitS);

        //Inscrierea in vector a nr
        for (int i = sfirsit; i > inceput; i--) {

            result.add(i);

        }
        return result;
    }


}
