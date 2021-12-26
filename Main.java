package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Elba León
        String palabraSecreta = getpalabrasecreta();
        char[] palabraGuiones = getGuiones(palabraSecreta);
        boolean juegoTerminado = false;
        Scanner lector = new Scanner(System.in);
        int intento = 5;

        do {
            System.out.println("te quedan" + intento + "intentos");
            System.out.println(palabraGuiones);
            System.out.print("Introduzca una letra: ");
            char letra = lector.next().charAt(0);// tomo la primera letra
            boolean letraAcertada = false;
            // verificando que la letra esta en la palabra introducida
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraGuiones[i] = letra;
                    letraAcertada = true;
                }
            }
            //si alguna letra acertada es false, no has acertado ninguna letra
            if (!letraAcertada) {
                System.out.println("No has acertado la letra");
                --intento;
                impresion(intento);
                if (intento == 0) {
                    System.out.println("Has agotado los intentos");
                    juegoTerminado = true;
                }
            } else {
                boolean playGinner = !algunGuion(palabraGuiones);
                if (playGinner) {
                    System.out.println("Felicidades has ganadi");
                    juegoTerminado = true;
                }
            }

        } while (!juegoTerminado);
        lector.close();

    }

    static String getpalabrasecreta() {
        Scanner teclado = new Scanner(System.in);// creamos el objeto Scanner
        System.out.print("Introduzca una palabra: ");
        String palabra = teclado.nextLine();
        System.out.print("La palabra introducida es : " + palabra);
        return palabra;
    }

    static char[] getGuiones(String pala) {
        int n = pala.length();
        char[] palabraGuiones = new char[n];
        for (int i = 0; i < palabraGuiones.length; i++) {
            /**Guardo los _ en el array (su longitud)**/
            palabraGuiones[i] = '_';

        }

        return palabraGuiones;

    }

    //Si tiene algun guion bajo (Para confirmar si he acertado o no)
    static boolean algunGuion(char[] array) {
        for (char l : array) {
            if (l == '_') ;
            return true;

        }
        return false;
    }

    static void impresion(int vd) {


        if (vd == 5) {


            System.out.println("    -----   ");


            System.out.println("    |   |   ");


            System.out.println("    |   |   ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("------------");


        }


        if (vd == 4) {


            System.out.println("    -----   ");


            System.out.println("    |   |   ");


            System.out.println("    |   |   ");


            System.out.println("    |   0   ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("------------");


        }


        if (vd == 3) {


            System.out.println("    -----   ");


            System.out.println("    |   |   ");


            System.out.println("    |   |   ");


            System.out.println("    |   0   ");


            System.out.println("    |  /    ");


            System.out.println("    |       ");


            System.out.println("    |    \\ ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("------------");


        }


        if (vd == 2) {


            System.out.println("    -----   ");


            System.out.println("    |   |   ");


            System.out.println("    |   |   ");


            System.out.println("    |   0   ");


            System.out.println("    |  /|   ");


            System.out.println("    |   |   ");


            System.out.println("    |    \\ ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("------------");


        }


        if (vd == 1) {


            System.out.println("    -----   ");


            System.out.println("    |   |   ");


            System.out.println("    |   |   ");


            System.out.println("    |   0   ");


            System.out.println("    |   |\\ ");


            System.out.println("    |   |   ");


            System.out.println("    |  / \\   ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("------------");


        }


        if (vd == 0) {


            System.out.println("    -----   ");


            System.out.println("    |   |   ");


            System.out.println("    |   |   ");


            System.out.println("    |   0   ");


            System.out.println("    |  /|\\ ");


            System.out.println("    |   |   ");


            System.out.println("    |  / \\   ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("    |       ");


            System.out.println("------------");

        }


    }
}
/**Elba León**/





