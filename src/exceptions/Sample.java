package exceptions;

import java.util.Scanner;

public class Sample {
    private static void square(String s) {
        int n = Integer.parseInt(s);
        System.out.println(n * n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        square(sc.nextLine());
    }
}
