import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i;
        String[] v = new String[5];
        String[] w = new String[5];
        int[] x = new int[10];
        int[] y = new int[10];

        v[0] = "Piero";
        v[1] = "Marco";
        v[2] = "Francesca";
        v[3] = "Anna";
        v[4] = "Luigi";

        Scanner scanner = new Scanner(System.in);

        i = 0;
        while (i < 5) {
            System.out.println("Inserire nome del " + (i + 1) + " cantante");
            w[i] = scanner.nextLine();
            i = i + 1;
        }

        i = 2;
        while (i <= 10) {
            System.out.println(i);
            x[i] = i;
            i = i + 2;
        }

        i = 0;
        while (i < 10) {
            x[i] = i;
        }

        System.out.println(v[0]);
        System.out.println(v[1]);
        System.out.println(v[2]);

        i = 0;
        while (i < 5) {
            System.out.println(v[i]);
            i = i + 1;
        }

        i = 0;
        while (i < 5) {
            System.out.println(w[i]);
            i = i + 1;
        }

        i = 0;
        while (i < 10) {
            System.out.println(x[i]);
            i = i + 1;
        }

        i = 0;
        while (i < 10) {
            System.out.println(y[i]);
            i = i + 1;
        }

        i = 1;
        while (i <= 10) {
            System.out.println(x[i]);
            i = i + 2;
        }

        i = 0;
        while (i <= 10) {
            System.out.println(x[i]);
            i = i + 2;
        }

        i = 1;
        while (i <= 10) {
            System.out.println(x[i]);
            i = i + 2;
        }

    }
}
