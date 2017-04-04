package com.AE;

/**
 * Created by Angel on 1/1/17.
 */
public abstract class Player<T> {

    private String name;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
