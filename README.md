# Dama-a-console
Implementazione di una dama a console senza AI
 
 
 
 
 
 
 
 import java.util.Random;
import java.util.Scanner;
import java.lang.*;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci da che numero vuoi far generare numeri casuali");
        int b = sc.nextInt();
        System.out.println("Inserisci il numero dove vuoi far finire la generazione di numeri casuali");
        int c = sc.nextInt();
        int d = c - b;
        System.out.println("Inserisci la grandezza della matrice");
        int f = sc.nextInt();
        int g = sc.nextInt();

        Random random = new Random();
        int a[][] = new int[f][g];
        int i, j;
        int h = f - 1;
        int l = g - 1;

        for (i = 0; i <= h; i++) {
            for (j = 0; j <= l; j++) {
                a[i][j] = random.nextInt(d) + b;

                System.out.print(a[i][j] + " ");
            }
            System.out.println("");


        }
        int sommadiagonali = 0;
        for (i = 0, j = 0; i < f && j < h; i++, j++) {
            sommadiagonali = sommadiagonali + a[i][j];


        }
        System.out.println("Diagonale uno" + sommadiagonali);
    }
}






Principio matrice//
