package io.codelex.enums.Exercise1;

public class CardinalPointsTest {
    public static void main(String[] args) {

        System.out.printf("%-10s %-5s\n", "Direction", "Text");
        System.out.printf("%-10s %-5s\n", CardinalPoints.NORTH.getName(), CardinalPoints.NORTH.getDirection());
        System.out.printf("%-10s %-5s\n", CardinalPoints.SOUTH.getName(), CardinalPoints.SOUTH.getDirection());
        System.out.printf("%-10s %-5s\n", CardinalPoints.EAST.getName(), CardinalPoints.EAST.getDirection());
        System.out.printf("%-10s %-5s\n", CardinalPoints.WEST.getName(), CardinalPoints.WEST.getDirection());

        System.out.println("-------------------");

        for (CardinalPoints cardinalPoints : CardinalPoints.values()) {
            System.out.println(cardinalPoints.getName() + ":" + cardinalPoints.getDirection() + ":" + cardinalPoints.ordinal());

        }
    }
}
