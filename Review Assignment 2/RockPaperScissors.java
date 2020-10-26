import java.util.Scanner;

public class RockPaperScissors {
    
    static Scanner sc = new Scanner(System.in);
    static final int ROCK = 1, PAPER = 2, SCISSORS = 3;
    static final int wins = 0, losses = 0, ties = 0;
    static int humanChoice, computerChoice;
    
    public static void main(String[] args) {
        printIntro();
        do {
            getHumanChoice();
            getComputerChoice();
            printChoices();
            calculateWinner();
        } while (wantToPlayAgain());
        printStats();
    }
    
    public static void printIntro() {
        int x; 
        System.out.println("RPS 1.0");
        System.out.println("********************************");
        System.out.println("Good luck, human...");
    }
    public static void getHumanChoice() {
        System.out.print("\nWhat do you throw? [1] Rock, [2] Paper, [3] Scissors ");
        humanChoice = sc.nextInt();
    }
    public static void getComputerChoice() {
        computerChoice = (int) (Math.random() * 3 + 1);
    }
    public static void printChoices() {
        if (humanChoice == ROCK)
        System.out.print("You threw Rock!");
        else if (humanChoice == PAPER)
        System.out.print("You threw Paper!");
        else if (humanChoice == SCISSORS)
        System.out.print("You threw Scissors!");
    }
    
    public static void calculateWinner() {
        if (humanChoice == computerChoice) {
            System.out.println("Wow, a tie!?");
              ties++;
        } else if (humanChoice == ROCK && computerChoice == SCISSORS || humanChoice == PAPER && computerChoice == ROCK || humanChoice == SCISSORS && computerChoice == PAPER) {
            System.out.println("Noooooooooo! I lost? But how??");
              wins++;
        } else {
            System.out.println("Haha, I win!");
              losses++;
        }
    }
        public static boolean wantToPlayAgain() {
        System.out.print("Do you want to play again? [y,n]: ");
        String answer = sc.next();
        return answer.equals("Y") || answer.equals("y");
    }
        public static void printStats() {
        System.out.println("\nGood game!");
        System.out.println("****************************************");
        System.out.println("Wins:   " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Ties:   " + ties);
    }
}