import java.util.Scanner;

public class TugasIndividu4 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        String[] cabangOlahraga = {"badminton", "tenis meja", "basket", "bola voly"};
        String[][] dataAtlet = new String[4][5];

        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabang " + cabangOlahraga[i]);
            for (int j = 0; j < dataAtlet[i].length; j++) {
                System.out.print("Atlet " + (j + 1) + ": ");
                dataAtlet[i][j] = input08.nextLine();
            }
            System.out.println();
        }

        System.out.println("Data Atlet sebelum diurutkan:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.print("Cabang " + cabangOlahraga[i] + ": ");
            for (int j = 0; j < dataAtlet[i].length; j++) {
                System.out.print(dataAtlet[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < cabangOlahraga.length; i++) {
            for (int j = 0; j < dataAtlet[i].length - 1; j++) {
                for (int k = 0; k < dataAtlet[i].length - 1 - j; k++) {
                    if (dataAtlet[i][k].compareTo(dataAtlet[i][k + 1]) > 0) {

                        String temp = dataAtlet[i][k];
                        dataAtlet[i][k] = dataAtlet[i][k + 1];
                        dataAtlet[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("\nData Atlet setelah diurutkan secara ascending:");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.print("Cabang " + cabangOlahraga[i] + ": ");
            for (int j = 0; j < dataAtlet[i].length; j++) {
                System.out.print(dataAtlet[i][j] + " ");
            }
            System.out.println();
        }

        input08.close();
    }
}