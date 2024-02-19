package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    protected final Board board;
    protected Queue<Player> players;

    protected PlayerSimulator playerSimulator;

    protected boolean isCompleted;
    protected List<Player> winners;

    public Game(int sizeOfBoard, PlayerSimulator playerSimulator) {
        this.board = new Board(sizeOfBoard);
        players = new LinkedList<>();
        winners = new ArrayList<>();
        this.playerSimulator = playerSimulator;
        isCompleted = false;
    }

    public void addPlayer(User user){
        Player player = new Player(user);
        players.add(player);
    }

    public void playGame(){
        while(isCompleted){
            Player player = players.poll();
            playerSimulator.movePlayer(player);
            if(!player.isHasWon())
                players.add(player);
            else
                winners.add(player);
            checkIsGameCompleted();
        }
    }

    public boolean checkIsGameCompleted(){
        return false;
    }

    /**
     * 2 2d arrays,
     * 1. ladders - start end
     * 2. snakes- - start end
     */
}
