/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.concurrent.ForkJoinTask;

/**
 *
 * @author MouNj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chesspiece sk = new Chesspiece("castel", "white", 10, 4);
        Knight k = new Knight("white", 4, 4);

//        System.out.println("possibleMoves : \n" + sk.possibleMoves());
//     sk.show();
//        sk.move(7, 4);
//        System.out.println(k.getxPosition() +" , "+k.getyPosition());
//        System.out.println("possiple moves :" + k.possibleMoves());
//        System.out.println(k.possibleMoves(k.getxPosition(),k.getyPosition()));
        System.out.println(k.possibleMovesTwo(k.getxPosition(), k.getyPosition()));
       k.move(6, 3);
       
    }
}
