package io.codelex.oop.Parcels;

public class ParcelTest {
    public static void main(String[] args) {

        Parcel parcel = new Parcel(50, 50, 50, 10);
        System.out.println("Parcel is valid?: " + parcel.validate());

    }
}

