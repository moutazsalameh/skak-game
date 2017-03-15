/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author MouNj
 */
public class Chesspiece {

    private String name;
    private String color;//sort eller hvid
    private int xPosition;
    private int yPosition;

    public Chesspiece(String name, String color, int xPosition, int yPosition) {
        this.name = name;
        this.color = color;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public boolean canMoveTo(int x, int y) {
        if ((x > 1 && x <= 8) && ((y > 1 && y <= 8)) && ((this.xPosition != x && this.yPosition != y))) {
            return true;

        }
        return false;
    }

    public String positionToField(int x, int y) {
        String sympol;

        switch (x) {
            case 1:
                sympol = "A";
                break;
            case 2:
                sympol = "B";
                break;
            case 3:
                sympol = "C";
                break;
            case 4:
                sympol = "D";
                break;

            case 5:
                sympol = "E";
                break;

            case 6:
                sympol = "G";
                break;
            case 7:
                sympol = "H";
                break;
            case 8:
                sympol = "I";
                break;
            default:
                sympol = "Invalid ";
                break;
        }
        return ("(" + sympol + y + ")");

    }
// Lav en metode possibleMoves(), som returnerer navnene på alle de felter brikken kan rykke til.

    public String possibleMoves() {

        return name;
    }
}
