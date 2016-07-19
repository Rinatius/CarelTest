package kg.kloop.rinat.careltest;

import android.os.Bundle;


public class MainActivity extends CarelActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //int[][] map = new int[5][1];
        //map[3][0] = 9;
        //map [3][3] = 1;
        //map [3] [2] = 1;
        //setGrid(map);

        /****Code here!****/

        reachBeepers();
        moveBeepers();


































        /*
        move();

        while(isBeeperPresent()) {
            pickBeeper();
            move();
            putBeeper();
            goBack();
        }
        */

        /*putBeeperEachCell();
        turnAround();
        pickBeeperUntilOne();*/



        /****Stop here!****/
    }

    /****New functions here!****/



    private void reachBeepers() {
        while(true){
            if (isBeeperPresent() || !isFrontClear())break;
            move();
        }
    }

    private void moveBeepers() {
        while (isBeeperPresent()) {
            pickBeeper();
            move();
            putBeeper();
            goVzad();
        }
    }

    private void goVzad(){
        turnRound();
        move();
        turnRound();
    }

    private void turnRound(){
        turnLeft();
        turnLeft();
    }




















   /* public void putBeeperEachCell(){
        while (true){
            putBeeper();
            if(isFrontClear()){
                move();

            } else break;
        }
    }

    public void pickBeeperUntilOne(){
        pickBeeper();
        while(true){
            if (isBeeperPresent()){
                move();
            } else break;
        }
        turnAround();
    }

    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void goBack(){
        turnAround();
        move();
        turnAround();

    }

    public void turnAround(){
        turnLeft();
        turnLeft();
    }*/
    /****Stop here!****/
}