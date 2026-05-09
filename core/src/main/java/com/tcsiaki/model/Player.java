package com.tcsiaki.model;

public class Player {
    private Position position;
    private Direction direction;

    public Player(Position startPosition) {
        this.position = startPosition;
        this.direction = Direction.DOWN;
    }

    public Position getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}
