import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = input08.nextInt();
        for(int i=1;i<=N;i++){
            System.out.print("*");
        }
    }
}