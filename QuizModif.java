import java.util.Scanner;
import java.util.Random;

public class QuizModif {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        Random random = new Random();

        int angkaAcak = random.nextInt(10);
        int tebakan;

        System.out.println("Tebak angka antara 1 - 10");
        
        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input08.nextInt();

            if (tebakan == angkaAcak) {
                System.out.println("Selamat, tebakan Anda benar!");
                break;
            } else if (tebakan < angkaAcak) {
                System.out.println("Tebakan Anda terlalu kecil!");
            } else {
                System.out.println("Tebakan Anda terlalu besar!");
            }
        } while (true);

        input08.close();
    }
}