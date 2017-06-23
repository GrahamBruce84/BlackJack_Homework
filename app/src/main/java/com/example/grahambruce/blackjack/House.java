package com.example.grahambruce.blackjack;

import java.util.ArrayList;

/**
 * Created by grahambruce on 23/06/2017.
 */

public class House extends Player {

    private ArrayList<Card> houseHand;


    public House(String name, ArrayList<Card> houseHand) {
        super(name);
        this.houseHand = new ArrayList<Card>();
    }

    public ArrayList<Card> getHand() {
        return houseHand;
    }
}
