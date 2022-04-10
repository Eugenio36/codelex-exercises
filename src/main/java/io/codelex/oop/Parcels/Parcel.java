package io.codelex.oop.Parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private static final int MAX_WEIGHT = 30;
    private static final int MAX_ALL_DIMENSIONS = 300;
    private static final int MAX_SIZE = 30;

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public int getSumOfAllDimensions() {
        return getxLength() + getyLength() + getzLength();
    }

    public float getWeight() {
        return weight;
    }


    @Override
    public boolean validate() {
        if (getWeight() < MAX_WEIGHT) {
            isExpress = true;
        }
        return getSumOfAllDimensions() < MAX_ALL_DIMENSIONS
                && getxLength() > MAX_SIZE
                && getyLength() > MAX_SIZE
                && getzLength() > MAX_SIZE
                && isExpress;
    }
}
