package blackjack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Player {
    private ArrayList<Card> cards;
    private Map<String, Double> bet = new HashMap<>();
    private double betMoney;
    private int cardsValue;

    public Player(ArrayList<Card> cards, Map<String, Double> bet, double betMoney, int cardsValue) {
        this.cards = cards;
        this.bet = bet;
        bet.put("Yello", 0.5);
        bet.put("Green", 5.0);
        bet.put("White", 10.0);
        bet.put("Black", 100.0);
        bet.put("Purple", 500.0);
        this.betMoney = betMoney;
        this.cardsValue = cardsValue;
    }

    public Player() {
            bet.put("Yello", 0.5);
            bet.put("Green", 5.0);
            bet.put("White", 10.0);
            bet.put("Black", 100.0);
            bet.put("Purple", 500.0);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Map<String, Double> getBet() {
        return bet;
    }

    public void setBet(Map<String, Double> bet) {
        this.bet = bet;
    }

    public double getBetMoney() {
        return betMoney;
    }

    public void setBetMoney(double betMoney) {
        this.betMoney = betMoney;
    }

    public int getCardsValue() {
        return cardsValue;
    }

    public void setCardsValue(int cardsValue) {
        this.cardsValue = cardsValue;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        if (cards != null) {
            StringBuilder total = new StringBuilder("");
            for(Card c : cards) {
                String tempColor = c.getCardColor();
                String tempName = c.getCardName();
                total.append(tempColor + ":" + tempName);
                total.append(" || ");
            }
            return total.toString();
        } else {
            return "Wrong arguments";
        }
    }
}
