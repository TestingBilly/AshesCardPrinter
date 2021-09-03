package giveMeCards;
import java.util.Stack;

public final class GameRules {


    private GameRules() {
    }

    public static void blackJackGameRules(Stack<card> deck){
        for (card c:deck)
        {
            //sets face cards to have a value of 10
            if(c.isFaceCard()){
                c.setCardValue(10);
            }
        }
    }
    public static void blackJackDealNewHand(Stack<card> deck, Stack<card> hand, Stack<card> dealerhand){

        hand.add(deck.pop());
        dealerhand.add(deck.pop());
        hand.add(deck.pop());
        dealerhand.add(deck.pop());

    }
    public static void blackJackHitMe(Stack<card> deck, Stack<card> hand){
        hand.add(deck.pop());
    }

    public static int blackJackCheckValues(Stack<card> hand){
        int totalCards= 0;
        for (card c: hand){
            totalCards += c.getCardValue();
        }

        if (totalCards > 21){
            return -1;
        } else {
            return totalCards;
        }
    }

    public static void blackJackAceRules(Stack<card> hand){
        int totalCardValue = blackJackCheckValues(hand);
        for (card c: hand){
            if(c.getCardValue() == 1 && totalCardValue >= 10){
                c.setCardValue(11);
            }
        }
    }

}