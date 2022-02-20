package blackjackgroup10;

import java.util.Random;
import blackjackgroup10.Card.Value;
import blackjackgroup10.Card.Suit;

/**
 *
 * @author joshs
 */
public class CardHandGenerator{
      
        public static Card[] generatorHand(int numCard){
            
            Card[] hand = new Card[numCard];
            Random random = new Random();
            
            for(int i = 0;i<hand.length;i++){
                
                int numValues = Card.Value.values().length;
                Card.Value value = Card.Value.values()[random.nextInt(numValues)];

                int numSuits = Card.Suit.values().length;
                Card.Suit suit = Card.Suit.values()[random.nextInt(numSuits)];

                Card card = new Card(value, suit);
                hand[i] = card;
            }
            return hand;
        }
    
}
