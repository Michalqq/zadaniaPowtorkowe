package com.company.wojna;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Deck with 5 cards, seed 10:");
        Deck deck1 = createDeck();
        Deck deck2 = createDeck();
        System.out.println(deck1);
        System.out.println(deck2);
        rarityBatte(deck1, deck2);
        colorBattle(deck1, deck2);
        battleResult(normalBattle(deck1, deck2));
    }

    private static Card createRandomCard() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int randomColorNumber = random.nextInt(4);
        CardColor cardColor = CardColor.values()[randomColorNumber];

        boolean isRare = random.nextBoolean();

        Card card = new Card(cardColor, randomNumber, isRare);

        return card;
    }

    private static Deck createDeck() {
        Deck deck = new Deck();
        for (int i = 0; i < 10; i++) {
            deck.addCard(createRandomCard());
        }
        return deck;
    }

    private static void battleResult(long result) {
        if (result < 0) {
            System.out.println("Wygrywa talia 2");
        } else if (result > 0) {
            System.out.println("Wygrywa talia 1");
        } else {
            System.out.println("Remis");
        }
    }

    private static void rarityBatte(Deck deck1, Deck deck2) {
        battleResult(countRare(deck1) - countRare(deck2));
    }

    private static long countRare(Deck deck) {
        return deck.getCards().stream()
                .filter(g -> g.isRare())
                .count();
    }

    private static void colorBattle(Deck deck1, Deck deck2) {
        battleResult(countColorSumValue(deck1) - countColorSumValue(deck2));
    }

    private static long countColorSumValue(Deck deck) {
        long value = 0;
        value = deck.getCards().stream()
                .map(x -> x.getColor().getValue())
                .reduce(0, Integer::sum);
//        for(Card card: deck.getCards()){
//            value += card.getColor().getValue();
//        }
        System.out.println(value);
        return value;
    }

    private static int normalBattle(Deck deck1, Deck deck2) {
        int sizeDeck1 = deck1.getCards().size();
        int sizeDeck2 = deck2.getCards().size();
        while (sizeDeck1 > 0 & sizeDeck2 > 0) {
            if (deck1.getCards().get(0).getValue() > deck2.getCards().get(0).getValue()) {
                deck2.getCards().remove(0);
            } else if (deck1.getCards().get(0).getValue() < deck2.getCards().get(0).getValue()) {
                deck1.getCards().remove(0);
            } else {
                deck1.getCards().remove(0);
                deck2.getCards().remove(0);
            }
            sizeDeck1 = deck1.getCards().size();
            sizeDeck2 = deck2.getCards().size();
        }
        if (deck1.getCards().size() == 0) {
            return -1;
        } else if (deck2.getCards().size() == 0) {
            return 1;
        }
        return 0;
    }
}
