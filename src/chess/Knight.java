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

    public Knight(String color, int xPosition, int yPosition) {
        super(color, xPosition, yPosition);
    }

    @Override
    public boolean canMoveTo(int x, int y) {
        return super.canMoveTo(x, y); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String possibleMoves() {
        ArrayList<String> availableMovement = new ArrayList<>();
        {
            for (int y = 1; y <= 8; y++) {
                for (int x = 1; x <= 8; x++) {
                    if (canMoveTo(x, y)== true) {
                        
                        availableMovement.add(positionToField(x, y));
                    }

                }
            }
        }
        return availableMovement.toString();
    }
}
