package org.example;

public class Player{
    private User user;
    private Cell position;
    private boolean hasWon;

    public Player(User user) {
        this.user = user;
        this.position = new Cell(0,0);
        hasWon = false;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cell getPosition() {
        return position;
    }

    public void setPosition(Cell position) {
        this.position = position;
    }

    public boolean isHasWon() {
        return hasWon;
    }

    public void setHasWon(boolean hasWon) {
        this.hasWon = hasWon;
    }
}
