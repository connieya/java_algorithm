package com.company.algorithm;

public class Card implements Comparable<Card> {
    private final int rank;
    private final int suit;

    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }
}
