import java.util.Scanner;

class downrighttriangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = a; i >= 1; i--) {

            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}