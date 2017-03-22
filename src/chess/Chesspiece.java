/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;

/**
 *
 * @author MouNj
 */
/**
 *
 * @author MouNj chesspice klass include name = "navn der gives til brikken " ,
 * color ="farve til hvert felter ,brikken står på " and x,y=
 */
public class Chesspiece {

    private String name;
    private String color;//sort eller hvid
    private int xPosition;
    private int yPosition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }
//give each new objekt "as "

    public Chesspiece(String name, String color, int xPosition, int yPosition) {
        this.name = name;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public Chesspiece(String color, int xPosition, int yPosition) {

        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public boolean canMoveTo(int x, int y) {
        return (x >= 1 && x <= 8) && ((y >= 1 && y <= 8)) && ((this.xPosition != x && this.yPosition != y));
    }

    public String positionToField(int x, int y) {//this method represent how coordinates of (x,y) on the chess board . 
        String sympol;

        switch (x) {
            case 1:
                sympol = "a";
                break;
            case 2:
                sympol = "b";
                break;
            case 3:
                sympol = "c";
                break;
            case 4:
                sympol = "d";
                break;

            case 5:
                sympol = "e";
                break;

            case 6:
                sympol = "f";
                break;
            case 7:
                sympol = "g";
                break;
            case 8:
                sympol = "h";
                break;
            default:
                sympol = "Invalid ";
                break;
        }
        return ("(" + sympol + y + ")");

    }
// Lav en metode possibleMoves(), som returnerer navnene på alle de felter brikken kan rykke til.

    public String possibleMoves() {//this method instalizer the board ->
        ArrayList<String> availableMovement = new ArrayList<>();
        {
            for (int y = 1; y <= 8; y++) {
                for (int x = 1; x <= 8; x++) {

                    availableMovement.add(positionToField(x, y));

                }
            }
        }
        return availableMovement.toString();
    }
//Lav en metode show(), der udskriver color, name og navnet på det felt brikken står på i første
//og i næste linie udskriver ”Kan rykke til: ” efterfulgt af alle de felter brikken kan rykke til

    public void show() {
        System.out.println("color :" + color + " name :" + name + positionToField(xPosition, yPosition));
        System.out.println("Kan rykke til: " + possibleMoves());
    }

    //Lav en metode move(int x, int y), der flytter brikken til (x,y) hvis det er et lovligt træk. (Altså hvis
    //canMoveTo(int x, int y) = true). Udskriv color, name, felt, ”->”, nytFelt. Udskriv ”Ugyldigt træk!”
    //efter trækket, hvis det ikke er lovligt. (F.eks.: Sort Løber c7 -> a5​)
    public void move(int x, int y) {
        if (canMoveTo(x, y) == true) {

            System.out.println("color :" + color + " name :" + name + positionToField(xPosition, yPosition) + "-->" + positionToField(x, y));
        } else {
            System.out.println("Ugyldigt træk !");
        }
    }

}
