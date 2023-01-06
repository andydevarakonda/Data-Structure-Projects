import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CardSort {

    public static final String[] RANKS = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    public static final String[] SUITS = {"Spades","Hearts","Clubs","Diamonds"};

    public static void main(String[] args) {

        /* DO NOT EDIT THE MAIN METHOD */

        //make a deck of cards, should have 52 cards
        Stack<String> deck = makeDeck();
        System.out.println("New deck: "+deck.size()+" cards");
        System.out.println(deck);
        System.out.println();

        //automatically shuffles the deck, don't need to code this
        Collections.shuffle(deck);
        System.out.println("Shuffled deck: "+deck.size()+" cards");
        System.out.println(deck);
        System.out.println();

        //create an ArrayList of Stacks, each representing all the cards of one suit 
        ArrayList<Stack<String>> bySuit = sortSuits(deck);
        for(int i = 0; i < bySuit.size(); i++) {
            //each new stack should have 13 cards, all the same suit
            System.out.println(SUITS[i]+": "+bySuit.get(i).size()+" cards");
            System.out.println(bySuit.get(i));
            System.out.println();
        }

        //the deck should now be empty
        System.out.println("Deck is empty? "+deck.isEmpty()+" ("+deck.size()+" cards)");        
    }

    public static Stack<String> makeDeck() {
        Stack<String> deck = new Stack<String>();
        for(String r: RANKS) {
            for(String s: SUITS) {
                deck.push(r + " of " + s);
            }
        }
        return deck;
    }

    public static ArrayList<Stack<String>> sortSuits(Stack<String> deck) {
        ArrayList<Stack<String>> sortedSuits = new ArrayList<Stack<String>>(); 
        for (int i = 0; i < SUITS.length; i++) {
            sortedSuits.add(new Stack<String>());
        }
        while (!deck.isEmpty()) {
            String c = deck.pop();
            for (int i = 0; i < SUITS.length; i++) {
                if (c.contains(SUITS[i])) {
                    sortedSuits.get(i).push(c);
                    break;
                }
            }
        }
        return sortedSuits;
    }
}
