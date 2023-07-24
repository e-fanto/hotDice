package org.ef;

import java.util.Scanner;

public class Menu {
    private AsciiImages images = new AsciiImages();
    private RandomDiceRoll roller = new RandomDiceRoll();
    Scanner scanner = new Scanner(System.in);
    protected int min = 1;
    protected int max = 5;

    public Menu(){}
    public void run(){
        images.printTwoDice();
        images.lilPause();
        boolean keepPlaying = true;

        while(keepPlaying == true) {
            String enterPrompt = "              *** Hit ENTER to continue ***";
            String howMany = " How many dice would you like to roll? (1-5) : ";

            System.out.println("\n    WELCOME TO HOT DICE!! YOUR FAVORITE DICE ROLLING MACHINE");
            images.customPause(2000);
            promptForString(enterPrompt);//pauses until user is ready
            System.out.println();
            images.customPause(1000);
            images.printBlanks();
            images.customPause(1000);

            int howManyDice = promptForInt(howMany);
            int[] dice = roller.handle6SideDice(howManyDice);
            images.printBlanks();
            images.printUpsideDownFlames();
            images.customPause(800);
            printDice(dice);
        }


    }

    private void printDice(int[] dice){
        for (int i = 0; i < dice.length; i++){
            images.printDieSix(dice[i]);
        }
    }

    public String promptForString(String prompt) {
        System.out.print(prompt);
        return this.scanner.nextLine();
    }

    public int promptForInt(String prompt) {
        while(true) {
            String s = this.promptForString(prompt);

            try {
                int playersChoice = Integer.parseInt(s);
                if (playersChoice <= max && playersChoice >= min){
                    return playersChoice;
                }
                System.out.println("Please enter a valid integer");
            } catch (NumberFormatException var4) {
                System.out.println("Please enter a valid integer");
            }
        }
    }

}
