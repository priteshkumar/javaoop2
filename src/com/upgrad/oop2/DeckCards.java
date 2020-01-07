package com.upgrad.oop2;

class Card {
    private final int rank;
    private final int suite;

    // Kinds of suits
    public final static int DIAMONDS = 1;
    public final static int CLUBS    = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    // Kinds of ranks
    public final static int ACE   = 1;
    public final static int DEUCE = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    public Card(int rank,int suite){
        this.rank = rank;
        this.suite = suite;

    }

    public int getRank(){
        return this.rank;
    }

    public int getSuite(){
        return this.suite;
    }

    public static boolean isValidrank(int rank){
        return (ACE <= rank && rank <= KING);
    }


    public static boolean isValidsuite(int suite){
        return (DIAMONDS <= suite && suite <= SPADES);
    }

    public static String suitetoString(int suite){
        switch(suite){
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "clubs";
            case HEARTS:
                return "hearts";
            case SPADES :
                return "spades";
            default:
                return null;
        }
    }
}


public class DeckCards{

    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numSuits * numRanks;

    private Card[][] cards;

    public DeckCards() {
        cards = new Card[numSuits][numRanks];
        for (int suit = Card.DIAMONDS; suit <= Card.SPADES; suit++) {
            for (int rank = Card.ACE; rank <= Card.KING; rank++) {
                cards[suit-1][rank-1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }

    public static void main(String[] args){
        DeckCards cardgame = new DeckCards();
        Card cd = cardgame.getCard(1,10);
        System.out.println("Card rank : " + cd.getRank());
        System.out.println("Card suite : " + Card.suitetoString(cd.getSuite()));
    }
}
