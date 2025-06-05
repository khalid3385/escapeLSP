package org.example.hints;

import java.util.Scanner;

public class HelpHint implements HintProvider {
    Scanner scanner = new Scanner(System.in);
    @Override
    public boolean hintKeuze() {
        System.out.println("Wil je een hint? (J/N)");
        String antwoord = scanner.nextLine().toLowerCase();

        while (!antwoord.equals("j") && !antwoord.equals("n")) {
            System.out.println("Ongeldig antwoord. Typ 'J' of 'N'.");
            antwoord = scanner.nextLine().toLowerCase();
        }

        return antwoord.equals("j");
    }
    @Override
    public String geefHint(){
        return "kijk op chatgpt";
    }
}
