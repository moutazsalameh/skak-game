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
/*
Lav en ny metode canMoveTo(int x, int y) i Rook, Bishop og Knight, som returnerer true for alle de
felter den pågældende brik kan rykke til. I skal ikke tage højde for om der står andre brikker på
brættet som kan spærre vejen til nogle felter. Det gælder stadig at feltet skal være et gyldigt felt
indenfor skakbrættet og at man ikke kan rykke til det felt man allerede står på.
(Hint: benyt superklassens canMoveTo(x,y) til at sikre at feltet er indenfor brættet og at man ikke
rykker til det felt man allerede står på. Og tilføj funktionalitet der håndterer hvordan den specifikke
brik kan rykke.)
 */
public class Knight extends Chesspiece {

    private int xx, yy;

    public Knight(String color, int xPosition, int yPosition) {
        super(color, xPosition, yPosition);
        xx = xPosition;
        yy = yPosition;
    }

    @Override
    public int getxPosition() {

        return super.getxPosition(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getyPosition() {
        return super.getyPosition(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        return super.canMoveTo(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean knightPossibleMoves(int CurrentxPos, int curretyPos,int desiredxPos, int desiredyPos) {
        boolean canMove = false;

        if ((Math.abs(CurrentxPos - desiredxPos)==2) && (Math.abs(curretyPos - desiredyPos) == 1) || (Math.abs(CurrentxPos - desiredxPos) == 1) && (Math.abs(curretyPos - desiredyPos) == 2)) {
            canMove = true;

        }

        return canMove;
    }

    public String possibleMovesTwo(int x, int y) {
        int[][] board = new int[8][8];
        ArrayList<String> availableMovement = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (knightPossibleMoves(x, y,i,j) == false) {

                } else {
                    availableMovement.add(positionToField(i , j ));
                }
            }
        }
        return availableMovement.toString();
    }

    @Override
    public void move(int x, int y) {
       if (knightPossibleMoves(getxPosition(), getyPosition(), x, y)==true){
           setxPosition(x);
           setyPosition(y);
           
           System.out.println("moved to: "+positionToField(getxPosition(), getyPosition()));
       }else{
        System.out.println("not allowed movement");}
       
    
    }
    
}
