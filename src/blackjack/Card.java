package blackjack;

public class Card {
    private String cardName;
    private String cardColor;

    public Card() {

    }

    public Card(String cardName, String cardColor) {
        this.cardName = cardName;
        this.cardColor = cardColor;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(final String cardName) {
        this.cardName = cardName;
    }

    public String getCardColor() {
        return cardColor;
    }

    public void setCardColor(final String cardColor) {
        this.cardColor = cardColor;
    }
}