package blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Room {
    public static final String[] CARDSNAME = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    public static final String[] CARDSCOLOR = { "S", "H", "C", "D" };

    private ArrayList<Player> players = new ArrayList<>();
    private Player house;

    public Room() {

    }

    public Room(ArrayList<Player> players, Player house) {
        this.players = players;
        this.house = house;
    }

    public Player getHouse() {
        return house;
    }

    public void setHouse(Player house) {
        this.house = house;
    }

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void gameStart() {
        while (true) {
            System.out.println("======== Black Jack ========");
            int nums = checkInputPlayerNum();
            if (nums == -1) {
                System.out.println("Invalid player numbers, Input a number between 1-7 please!");
                continue;
            } else {
                // use nums
                for (int i = 0; i < nums + 1; i++) {
                    players.add(new Player());
                }
                int order = randomPlayer(nums);
                System.out.println("Your order: " + "Player " + order);
                int decks = checkInputDeckNum();
                if (decks == -1) {
                    decks = 8;
                }
                // distribute cards
                distribute(nums, decks, order);
            }
        }
    }

    public int checkInputPlayerNum() {
        System.out.println("Input player numbers(less than 7): ");
        try {
            int number = scanner.nextInt();
            if (number < 1 || number > 7) {
                return -1;
            }
            return number;
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Invalid player numbers, Input a number please!");
            return -1;
        }
    }

    public int checkInputDeckNum() {
        System.out.println("Input deck numbers(default 8): ");
        try {
            int number = scanner.nextInt();
            return number;
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println("Invalid deck numbers, Input a number please!");
            return -1;
        }
    }

    public int randomPlayer(int playerNums) {
        return random.nextInt(0, playerNums);
    }

    public void distribute(int nums, int decks, int order) {
        // get cardDeck
        List<Card> deck = shuffle(decks);
        // add house (at the end order)
        for (int i = 0; i < players.size(); i++) {
            // initialization
            players.get(i).setCards(new ArrayList<Card>());
        }
        // first
        for (int i = 0; i < players.size(); i++) {
            Card temp = deck.get(i);
            players.get(i).getCards().add(temp);
            deck.remove(i);
        }
        // second
        for (int i = 0; i < players.size() - 1; i++) {
            Card temp = deck.get(i);
            players.get(i).getCards().add(temp);
            deck.remove(i);
        }
        System.out.println(players.size());
        // show your cards
        showCards(order);
        // decide house
        decideNext(deck, order);
    }

    public void showCards(int order) {
        System.out.println("Your cards: " + players.get(order).toString());
    }

    public void decideNext(List<Card> deck, int order) {
        int houseOrder = players.size() - 1;
        house = players.get(houseOrder);
        while (true) {
            System.out.print("House's card is: ");
            System.out.println(house.toString());
            play(deck, order);
        }
    }

    public void play(List<Card> deck, int order) {
        System.out.print("You will get your next card, ");
        int indicate = isContinue();
        switch (indicate) {
            case 1:
                // add third, before
                // checkBust(player order);
                checkBust(order);
                for (Player player : players) {
                    if (player.getCardsValue() != -1) {
                        player.getCards().add(deck.get(0));
                        deck.remove(0);
                    }
                }
                checkWin(order);
                showCards(order);
                break;
            // not add
            case -1:
                System.out.println("Skip yourself");
                checkBust(order);
                for (Player player : players) {
                    if (player.getCardsValue() != -1 && player != players.get(order)) {
                        player.getCards().add(deck.get(0));
                        deck.remove(0);
                    }
                }
                checkWin(order);
                showCards(order);
                break;
            case 0:
                // invalid input
                break;
            default:
                // invalid input
                break;
        }
    }

    public void checkWin(int order) {
        Player house = players.get(players.size() - 1);
        Player you = players.get(order);
        int houseValue = house.getCardsValue();
        int yourValue = you.getCardsValue();

        if (yourValue > 21) {
            System.out.println("You bust! You lose!");
        } else if (houseValue > 21) {
            System.out.println("House busts! You win!");
        } else if (yourValue == houseValue) {
            System.out.println("It's a draw!");
        } else if (yourValue > houseValue) {
            System.out.println("You beat the house! You win!");
        } else {
            System.out.println("House beats you! You lose!");
        }
    }

    public void checkBust(int order) {
        for (Player player : players) {
            int tempSum = 0;
            int aceCount = 0;
            for (int i = 0; i < player.getCards().size(); i++) {
                String card = player.getCards().get(i).getCardName();
                if (card.equals("J") || card.equals("Q") || card.equals("K")) {
                    tempSum += 10;
                } else if (!card.equals("A")) {
                    tempSum += Integer.parseInt(card);
                } else if (card.equals("A")) {
                    aceCount++;
                }
            }
            for (int i = 0; i < aceCount; i++) {
                if (tempSum + 11 <= 21) {
                    tempSum += 11;
                } else {
                    tempSum += 1;
                }
            }
            player.setCardsValue(tempSum);
            if (tempSum > 21) {
                System.out.println("player" + players.indexOf(player) + "cards' value: " + tempSum + ", Bust!!");
                player.setCardsValue(-1);
            }
        }
    }

    // public int aceValue() {
    // System.out.print("1 OR 11? (1 is default):");
    // try {
    // int input = scanner.nextInt();
    // if (input != 1 && input != 11) {
    // System.out.println("Please input number 1 or 11 to decide");
    // return 1;
    // } else {
    // return input;
    // }
    // } catch (NumberFormatException e) {
    // // TODO: handle exception
    // System.out.println("Please input number 1 or 11 to decide");
    // return 1;
    // }
    // }

    public int isContinue() {
        System.out.println("Do you want to continue? (Y/N)");
        String command = scanner.next();
        if (command.equalsIgnoreCase("Y") || command.equalsIgnoreCase("yes")) {
            return 1;
        } else if (command.equalsIgnoreCase("N") || command.equalsIgnoreCase("no")) {
            return -1;
        } else {
            System.out.println("Please input Yes or No!");
            return 0;
        }
    }

    public List<Card> shuffle(int setDecks) {
        List<Card> tempCards = new ArrayList<>();
        for (int i = 0; i < setDecks; i++) {
            for (int j = 0; j < CARDSCOLOR.length; j++) {
                String tempColor = CARDSCOLOR[j];
                for (int k = 0; k < CARDSNAME.length; k++) {
                    String tempName = CARDSNAME[k];
                    Card temp = new Card();
                    temp.setCardName(tempName);
                    temp.setCardColor(tempColor);
                    tempCards.add(temp);
                }
            }
        }
        Collections.shuffle(tempCards);
        return tempCards;
    }

    public boolean isEmpty(List<Card> inputDeck) {
        if (inputDeck.size() < this.players.size() + 1) {
            return true;
        } else {
            return false;
        }
    }
}
