package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private int length;
    private int width;
    private int numberOfCopies;
    private int costPerCopy;

    public Poster(int fee, int length, int width, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.length = length;
        this.width = width;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    @Override
    public int cost() {
        return super.cost() + (numberOfCopies * costPerCopy);
    }

    @Override
    public String toString() {
        return super.toString() + " Poster: " +
                "length= " + length +
                ", width= " + width +
                ", numberOfCopies= " + numberOfCopies +
                ", costPerCopy =" + costPerCopy +
                '}';
    }
}
