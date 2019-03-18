package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {
    private static int sumaCifara(int n) {
        int broj = n;
        int suma = 0;
        while(broj != 0) {
            int cifre = broj % 10;
            suma = suma + cifre;
            broj = broj / 10;
        }
        return suma;
    }

    public static void main(String[] args) {
        System.out.println("Unesite n: ");
        int n = 0;
        Scanner unos = new Scanner(System.in);
        n = unos.nextInt();
        sumaCifara(n);
        for(int i = 0; i<n; i++) {
            if(i%sumaCifara(n)==0)
                System.out.println(i);
        }
    }
}
