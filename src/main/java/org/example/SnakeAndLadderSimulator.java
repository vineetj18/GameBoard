package org.example;

public class SnakeAndLadderSimulator implements PlayerSimulator{
    @Override
    public void movePlayer(Player player) {
        Cell cell = finalPosition();
        player.setPosition(cell);
        if(player.getPosition()==new Cell(10,10))
            player.setHasWon(true);
    }

    private Cell finalPosition() {
        return new Cell(10,10);
    }
}
