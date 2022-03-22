package io.codelex.enums.Exercise1;

public enum CardinalPoints {

    NORTH("North", "up", "0"),
    SOUTH("South", "down", "1"),
    EAST("East", "right", "2"),
    WEST("West", "left", "3");

    private final String name;
    private final String direction;
    private final String value;

    CardinalPoints(String name, String direction, String value) {
        this.name = name;
        this.direction = direction;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public String getValue() {
        return value;
    }
}
