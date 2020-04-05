package project;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String arg[])
    {
        Player player1 = new Player("Foo");
        Player player2 = new Player("Bar");
        System.out.println("Enter 1 for Head and 2 for Tail");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.close();
        switch(choice){
            case 0:
                player1.setGuess(Coin.heads);
                player2.setGuess(Coin.tails);
                break;
            case 1:
                player1.setGuess(Coin.tails);
                player2.setGuess(Coin.heads);
                break;
            default:
                System.out.println("INVALID Input");
                System.exit(-1);
        }
        Coin coin = new Coin();
        coin.flip();
        String winner;
        winner = (coin.getSide()==player1.getGuess())? "PLAYER1 WINS": "PLAYER2 WINS";
        System.out.println(winner);
    }
}
