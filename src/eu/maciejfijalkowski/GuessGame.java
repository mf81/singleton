package eu.maciejfijalkowski;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    Random numberToGuess = new Random();
    Scanner keyboard = new Scanner(System.in);
    private int score = 0;
    private int rounds = 3;
    private int range = 10;
    private int randomNumber;

    private static GuessGame guessGame = new GuessGame();

    private GuessGame (){

    }

    public static GuessGame getInstans(){
        return guessGame;
    }

    public void setGuessGame(int rounds, int range) {
        this.rounds = rounds;
        this.range = range;
    }

    public int randomNumber(){
        return numberToGuess.nextInt(range);
    }

    public void play(){
        for (int i = 0; i<=rounds; i++){
            randomNumber=randomNumber();

            System.out.println(randomNumber);
            System.out.println("Liczba wylosowana z zakresu od 0 do " + range);
            System.out.println("Podaj Twój los:");
            if(keyboard.nextInt()==randomNumber){
                System.out.println("BRAWO !!!");
                setScore();
            }else{
                System.out.println("PUDŁO !!! :(");
            }

        }
        System.out.println("Twój wynik to: " + getScore());

    }
    public int getScore(){
        return score;
    }
    private void setScore(){
        score++;
    }
}
