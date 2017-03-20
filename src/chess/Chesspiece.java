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
        return (x > 1 && x <= 8) && ((y > 1 && y <= 8)) && ((this.xPosition != x && this.yPosition != y));
    }

    public String positionToField(int x, int y) {
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

    public String possibleMoves() {
        ArrayList<String> moves = new ArrayList<>();
        {
            for (int y = 1; y <= 8; y++) {
                for (int x = 1; x <= 8; x++) {

                    moves.add(positionToField(x, y));

                }
            }
        }
        return moves.toString();
    }
}
