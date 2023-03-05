import javax.swing.*;

public class numGameGuessing {
    public static void main(String[] args) {
        int computerNumber = (int) (Math.random()*100 + 1);
        int userGuess = 0;
        int numOfGuesses = 1;
        while (userGuess != computerNumber)
        {
            
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Guess The Number", 3);
            userGuess = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineGuess(userGuess,computerNumber, numOfGuesses));
            numOfGuesses++;

        }
    }

    public static String determineGuess(int userGuess, int computerNumber, int numOfGuesses){
        if (userGuess > 100 || userGuess <= 0) {
            return "Invalid guess, try again";
        }
        else if (computerNumber == userGuess ){
            return "Correct!\nTotal Guesses: " + numOfGuesses;
        }
        else if (userGuess > computerNumber) {
            return "Your guess is too high, try again. ";
        }
        else if (userGuess < computerNumber) {
            return "Your guess is too low, try again.";
        }
        else {
            return "Incorrect guess.";

        }


    }

}
