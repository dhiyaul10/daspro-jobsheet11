import java.util.Scanner;

public class NestedLoop_2341720021Modif2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        double temps[][] = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input08.nextDouble();
            }
            System.out.println();
        }

        int kotaIndex = 1;
        for (double[] kotaTemps : temps) {
            System.out.print("Kota ke-" + kotaIndex++ + ": ");
            double totalSuhu = 0;

            for (double suhu : kotaTemps) {
                System.out.print(suhu + " ");
                totalSuhu += suhu;
            }

            double rataRata = totalSuhu / kotaTemps.length;
            System.out.println(" | Rata-rata: " + rataRata);
        }

        input08.close();
    }
}
