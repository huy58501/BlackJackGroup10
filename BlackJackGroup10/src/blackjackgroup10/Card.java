/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackjackgroup10;

/**
 *
 * @author chuong5850
 * author Joshua R
 */
public class Card {
    public enum Suit{
        HEARTS,CLUBS,SPADES,DIAMONS
    }
    public enum Value{
        ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING
    }
    private Value value;
    private Suit suit;

    //create an array of possible suits
    //public static final String[] SUITS={"Hearts","Diamonds","Spades","Clubs"};

    public Card(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}
