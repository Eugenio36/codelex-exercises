package io.codelex.enums.Exercise1;

public enum CardinalPoints {

    NORTH("North", "up"),
    SOUTH("South", "down"),
    EAST("East", "right"),
    WEST("West", "left");

    private final String name;
    private final String direction;

    CardinalPoints(String name, String direction) {
        this.name = name;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

}
