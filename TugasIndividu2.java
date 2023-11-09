import java.util.Scanner;

public class TugasIndividu2 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}