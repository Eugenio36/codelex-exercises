package io.codelex.oop.Parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

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

    public float getWeight() {
        return weight;
    }
    

    @Override
    public boolean validate() {
        if (getWeight() < 30) {
            isExpress = true;
        }
        return getxLength() + getyLength() + getzLength() < 300 && getxLength() > 30 && getyLength() > 30 && getzLength() > 30 && isExpress;
    }
}
