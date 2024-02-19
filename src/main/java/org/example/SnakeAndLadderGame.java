package org.example;

public class SnakeAndLadderGame extends Game{

    public SnakeAndLadderGame(int sizeOfBoard) {
        super(sizeOfBoard,new SnakeAndLadderSimulator());
    }

    @Override
    public boolean checkIsGameCompleted(){
        return isCompleted = true;
    }
}
