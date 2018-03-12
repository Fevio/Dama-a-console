import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        scacchiera();
    }

    public static void scacchiera() {

        int a[][] = new int[8][8];
        int i,j;


        for ( i = 0; i <= 7; i = i + 1) {
            for ( j = 0; j <= 7; j = j + 1) {
                a[i][j] = 0;
            }
        }
        a[0][0] = 5;
        a[0][2] = 5;
        a[0][4] = 5;
        a[0][6] = 5;
        a[1][1] = 5;
        a[1][3] = 5;
        a[1][5] = 5;
        a[1][7] = 5;
        a[2][0] = 5;
        a[2][2] = 5;
        a[2][4] = 5;
        a[2][6] = 5;
        a[5][1] = 6;
        a[5][3] = 6;
        a[5][5] = 6;
        a[5][7] = 6;
        a[6][0] = 6;
        a[6][2] = 6;
        a[6][4] = 6;
        a[6][6] = 6;
        a[7][1] = 6;
        a[7][3] = 6;
        a[7][5] = 6;
        a[7][7] = 6;


        for ( i = 0; i <= 7; i = i + 1) {
            for (j = 0; j <= 7; j = j + 1) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");

        }
        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextInt()) {

                int c =
                        sc.nextInt();
                int d =
                        sc.nextInt();

                int e =
                        sc.nextInt();
                int f =
                        sc.nextInt();

                if (a[c][d] == 0 && a[e][f] == 0) {
                    a[e][f] = 0;
                } else if (a[c][d] == 6 && a[e][f] == 0) {
                    a[c][d] = 0;
                    a[e][f] = 6;
                } else if (a[c][d] == 6 && a[e][f] == 6) {
                    a[c][d] = 6;
                    a[e][f] = 6;
                }

                System.out.println("Ok");
                for ( i = 0; i <= 7; i = i + 1) {
                    for ( j = 0; j <= 7; j = j + 1) {
                        System.out.print(a[i][j] + " ");

                    }
                    System.out.println("");

                }



            }




        }

    }
}
