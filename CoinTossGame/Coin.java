package project;

import javax.swing.*;
import java.util.Random;

public class Coin {
    private String side;

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }
    public static final String heads = "HEADS";
    public static final String tails = "TAILS";

    // This randomly chooses head or tail and assigns to side variable
    public void flip(){
        if(new Random().nextBoolean())
        setSide(heads);
        else
         setSide(tails);
       }
}
