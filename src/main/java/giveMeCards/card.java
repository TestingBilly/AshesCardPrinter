package giveMeCards;

import com.google.gson.Gson;

public class card extends Deck {
        private int cardValue;
        private String suit;
        private boolean isFaceCard;
        private String faceCardType;
        public card(int cardValue, String suitInput) {
            this.cardValue = cardValue;
            suit = suitInput;
        }

        public int getCardValue() {
            return cardValue;
        }
        public void setCardValue(int cardValue) {
            this.cardValue = cardValue;
        }
        public String getSuit() {
            return suit;
        }
        public void setSuit(String suitInput) {
            this.suit = suitInput;
        }
        public boolean isFaceCard() {
            return isFaceCard;
        }
        public void setFaceCard(boolean faceCard) {
            this.isFaceCard = faceCard;
        }
        public String getFaceCardType() {
            return faceCardType;
        }
        public void setFaceCardType(String faceCardTypeInput) {
            faceCardType = faceCardTypeInput;
        }

        public String toString(){
            return "{" + "\"cardValue\"= \"" +cardValue +"\", \"suit\"=\"" + suit +
                    "\"}";
        }


    }

