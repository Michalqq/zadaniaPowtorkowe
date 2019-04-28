package com.company.wojna;

public class Card {
    private CardColor color;
    private int value;
    private boolean rare;

    public Card(CardColor color, int value, boolean rare) {
        this.color = color;
        this.value = value;
        this.rare = rare;
    }

    public CardColor getColor() {
        return color;
    }

    public void setColor(CardColor color) {
        this.color = color;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }

    @Override
    public String toString() {
        return "(" + color +
                "," + value +
                "," + rare + ")\n";
    }
}
