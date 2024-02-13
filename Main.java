import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] deckOfCards = new String[4][13]; // 2D array to represent deck of cards
        Random random = new Random(); // Random object for shuffling
        String[] suits = {"hearts", "diamonds", "spades", "clubs"}; // Array of card suits
        String[] numbers = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}; // Array of card numbers

        // Fill the deck of cards with all possible combinations of suits and numbers
        for (int suit = 0; suit < 4; suit++) {
            for (int number = 0; number < 13; number++) {
                deckOfCards[suit][number] = numbers[number] + " of " + suits[suit];
            }
        }

        String HandA = "Hand A has: "; // String to represent Hand A
        // Deal cards for Hand A
        for (int handA = 0; handA < 5; handA++) {
            int dim1Pos = random.nextInt(deckOfCards.length); // Randomly select a suit
            int dim2Pos = random.nextInt(deckOfCards[dim1Pos].length); // Randomly select a number
            String randomString1 = deckOfCards[dim1Pos][dim2Pos]; // Get the card at the selected position
            HandA += randomString1 + "\n"; // Add the card to Hand A
        }
        String HandB = "Hand B has: "; // for hands b - d it is nearly the exact same as hand A
        for (int handB = 0; handB < 5; handB++) {
            int dim3Pos = random.nextInt(deckOfCards.length);
            int dim4Pos = random.nextInt(deckOfCards[dim3Pos].length);
            String randomString2 = deckOfCards[dim3Pos][dim4Pos];
            HandB += randomString2 + "\n";
        }
        String HandC = "Hand C has: ";
        for (int handC = 0; handC < 5; handC++) {
            int dim5Pos = random.nextInt(deckOfCards.length);
            int dim6Pos = random.nextInt(deckOfCards[dim5Pos].length);
            String randomString3 = deckOfCards[dim5Pos][dim6Pos];
            HandC += randomString3 + "\n";
        }
        String HandD = "Hand D has: ";
        for (int handD = 0; handD < 5; handD++) {
            int dim7Pos = random.nextInt(deckOfCards.length);
            int dim8Pos = random.nextInt(deckOfCards[dim7Pos].length);
            String randomString4 = deckOfCards[dim7Pos][dim8Pos];
            HandD += randomString4 + "\n";
        }
        System.out.println(HandA + HandB + HandC + HandD);//print out results

    }
}