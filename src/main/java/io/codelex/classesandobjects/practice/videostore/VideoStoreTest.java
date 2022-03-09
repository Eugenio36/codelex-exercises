package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;
    private static VideoStore list = new VideoStore();

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to show movie list ");
            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.out.println("Goodbye!");
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard);
                    break;
                case 2:
                    rentVideo(keyboard);
                    break;
                case 3:
                    returnVideo(keyboard);
                    break;
                case 4:
                    System.out.println(list + "\n");
                    break;
                default:
                    break;
            }
        }
    }

    private static void fillVideoStore(Scanner scanner) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movie = scanner.next();
            movie = movie + scanner.nextLine();
            System.out.println("Enter rating");
            int rating = scanner.nextInt();
            list.addVideo(movie);
            list.userRating(movie, rating);
        }
    }

    private static void rentVideo(Scanner scanner) {
        System.out.println("What movie that you want to rent: ");
        String rentVideo = scanner.next();
        rentVideo = rentVideo + scanner.nextLine();
        list.checkOut(rentVideo);
    }

    private static void returnVideo(Scanner scanner) {
        System.out.println("What movie you want to return? ");
        String returnVideo = scanner.next();
        returnVideo = returnVideo + scanner.nextLine();
        list.returnVideo(returnVideo);
    }
}
