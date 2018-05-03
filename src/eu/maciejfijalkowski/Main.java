package eu.maciejfijalkowski;

public class Main {

    public static void main(String[] args) {
	    GuessGame game = GuessGame.getInstans();
//	    game.setGuessGame(3,10);

	    game.play();

        int score = game.getScore();
        GuessGame anotherGameReference = GuessGame.getInstans();

        if(game == anotherGameReference  ) {
            System.out.println("Singleton!");
            if(score == anotherGameReference.getScore()) {
                System.out.println("I punkty się zgadzają!");
            }
        }


    }
}
