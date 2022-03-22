package io.codelex.enums.Exercise1;

public enum CardinalPoints {

    NORTH("up"),
    SOUTH("down"),
    EAST("right"),
    WEST("left");

    private final String direction;

    CardinalPoints(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
