package Onay;

import java.util.Scanner;

/**Делал мини программу для оплаты проезда проект "ONAY"*/

public class OnayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Onay onay = new Onay();
        int balance = 79;
        int proezd80 = 80;
        int proezd40 = 40;
        do {
            System.out.print("Vvedite cartu: ");
            int res = scan.nextInt();
            if (res == 1000) {
                if (balance >= 80) {
                    int answer1 = onay.edinayaCarta(balance, proezd80);
                    System.out.println(answer1);
                } else {
                    System.out.println("Popolni cartu ty na nule nishebrod!");
                }
            } else if (res == 2000) {
                if (balance >= 40) {
                    int answer2 = onay.lgotnayaCarta(balance, proezd40);
                    System.out.println(answer2);
                } else {
                    System.out.println("Popolnite cartu!");
                }
            }
        } while (balance != 0);
    }
}
