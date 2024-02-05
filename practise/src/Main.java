import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = 4;
        for (int x = 0; T>x; T--) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();
            X = (X * Y) * 2;
            for (int k = 1; k > 0; k++) {
                if (X * k <= Z) {
                } else {
                    k--;
                    System.out.println(k);
                    break;
                }

            }
        }

    }
}
