package io.codelex.enums.Exercise1;

public class CardinalPointsTest {
    public static void main(String[] args) {

        int count = 0;
        for (CardinalPoints cardinalPoints : CardinalPoints.values()) {
            System.out.println(cardinalPoints + ":" + cardinalPoints.getDirection() + ":" + count);
            count++;
        }
    }
}
