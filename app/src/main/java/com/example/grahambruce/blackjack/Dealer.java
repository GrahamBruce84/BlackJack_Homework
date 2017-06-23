package com.example.grahambruce.blackjack;

import java.util.ArrayList;
import java.util.Collections;

import deck.CardNumber;
import deck.CardSuit;

/**
 * Created by grahambruce on 23/06/2017.
 */

public class Dealer {

    private ArrayList<Card> deck;
    House house;

    public Dealer(ArrayList<Card> deck, ArrayList<Card> player1Hand, ArrayList<Card> player2Hand, ArrayList<Card> houseHand){
        this.deck = deck;
        this.player1 = player1Hand;
        this.player2 = player2Hand;

        populate();
    }

    public void populate() {
        for (CardSuit type : CardSuit.values()){
            for (CardNumber number : CardNumber.values()){
                deck.add(new Card(number, type));
                Collections.shuffle(deck);
            }
        }
    }

    public void dealCard(){
        card1 = deck.remove(0);
        player1Hand.add(card1);
    }
}
