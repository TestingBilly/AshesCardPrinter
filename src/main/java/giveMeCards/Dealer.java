package giveMeCards;

public class Dealer extends Person {
    @Override
    public String showHand (){
//        System.out.println("The dealers hand is:");
        for (card c:getHand()) {
            new CardImageGenerator(c.getSuit(),c.getCardValue());
        }
        return null;
    }
}
