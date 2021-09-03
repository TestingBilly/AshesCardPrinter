package giveMeCards;
import java.util.Stack;

public class Person {

    static Stack<card> hand = new Stack<>();

    private static int startingMoney = 500;

    public static int getStartingMoney() {
        return startingMoney;
    }

    public Stack<card> getHand() {
        return hand;
    }

    public void setHand(Stack<card> hand) {
        Person.hand = hand;
    }

    public String showHand(){
//        System.out.println("Your current hand is:");
        for (card c:getHand()) {
            new CardImageGenerator(c.getSuit(),c.getCardValue());
        }

        return null;
    }
}
