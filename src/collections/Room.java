package com.collections;

import java.util.*;

public class Room {
    private List<Card> allCards = new ArrayList<>();
    public Room() {
        String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] colors = {"♠","♥","♣","♦"};
        int size = 0;
        for (String number : numbers) {
            size++;
            for (String color : colors) {
                Card card = new Card(number,color,size);
                allCards.add(card);
            }
        }
        Card card1 = new Card("","joker",++size);
        Card card2 = new Card("","JOKER",++size);
        Collections.addAll(allCards,card1,card2);
        System.out.println("new cards: " + allCards);
    }

    public void start() {
        // 1. shuffle
        Collections.shuffle(allCards);
        System.out.println("after shuffle: " + allCards);

        // 2. send cards (51 + 3)
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();
        // allCards = [♦5, ♠K, ♥9, ♠Q, ♥8, ♦9, ♠2, ♦8, ♠7, ♥3, ♣J, ♥6, ♠A, ...]
        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            if (i % 3 == 0) {
                player1.add(card);
            } else if (i % 3 == 1) {
                player2.add(card);
            } else if (i % 3 == 2){
                player3.add(card);
            }
        }
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        System.out.println("Player1: " + player1);
        System.out.println("Player2: " + player2);
        System.out.println("Player3: " + player3);
        List<Card> lastThreeCards = allCards.subList(allCards.size() - 3, allCards.size());
        System.out.println("Last Three Cards:" + lastThreeCards);
        Random random = new Random();
        int pick = random.nextInt(3);
        switch (pick) {
            case 0: {
                player1.addAll(lastThreeCards);
                sortCards(player1);
                System.out.println("Player1 has last 3: " + player1);
                break;
            }
            case 1: {
                player2.addAll(lastThreeCards);
                sortCards(player2);
                System.out.println("Player2 has last 3: " + player2);
                break;
            }
            case 2: {
                player3.addAll(lastThreeCards);
                sortCards(player3);
                System.out.println("Player3 has last 3: " + player3);
                break;
            }
        }
    }

    private void sortCards(List<Card> cards) {
        cards.sort(Comparator.comparingInt(Card::getSize));
    }
}
