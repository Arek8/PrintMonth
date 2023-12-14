package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dostępne języki: \n-POL \n-ENG");
        System.out.println("Podaj język: ");
        String choiceLanguage = sc.nextLine();

        System.out.println("Podaj numer miesiąca:");
        int choiceMonth = sc.nextInt();

        Select select = new Select();
        select.selectMonth(choiceLanguage, choiceMonth);
        sc.close();
    }
}
