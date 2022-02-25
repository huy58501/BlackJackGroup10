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
        ACE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6),SEVEN(7),EIGHT(8),NINE(9),TEN(10),JACK(10),QUEEN(10),KING(10);
        
        private final int value;
        private Value(int value){
            this.value=value;
        }
        public int getCardValue(){
            return value;
        }
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
