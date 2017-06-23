package com.example.grahambruce.blackjack;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by grahambruce on 23/06/2017.
 */

public abstract class Player {

    private ArrayList<Card> hand;
    private String name;

    public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }
}

