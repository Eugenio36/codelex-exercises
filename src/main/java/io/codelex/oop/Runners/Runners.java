package io.codelex.oop.Runners;

public enum Runners {
    BEGINNER(250, 300),
    INTERMEDIATE(200, 249),
    ADVANCED(150, 199);

    private final int minTime;
    private final int maxTime;

    Runners(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public static Runners getFitnessLevel(int time) {

        for (Runners runner : Runners.values()) {
            if (time <= runner.getMaxTime() && time >= runner.getMinTime()) {
                return runner;
            }
        }
        return null;
    }
}


