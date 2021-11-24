package org.team2168.ChristmasDinner.FoodItems;

public class Food {
    /* member variables
      - tastiness (use the enum below)
      - level of fillingness (people are full on a scale from 0.0-1.0)
      - whether it's been eaten (a true or false) */

    /* constructors; (overload these!) */

    /* methods
      - setters and getters!
    */

    /* This is an enum for tastiness.
    You can use it like you would any other type, I just wrote it here so it would be easier to figure out.
    
    Tastiness taste = Tastiness.GREAT;
    */
    public enum Tastiness {
        INCREDIBLE,
        GREAT,
        OK,
        BAD,
        HORRENDOUS
    }
}
