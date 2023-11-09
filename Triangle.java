import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input08.nextInt();
        int i = 0;
        while(i<=N) {
            int j = 0;
            while (j<i) {
                System.out.print("*");
                j++;
            }
            i++;
        }
    }
}