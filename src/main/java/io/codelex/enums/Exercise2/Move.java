package io.codelex.enums.Exercise2;

public enum Move {

    ROCK("r"),
    PAPER("p"),
    SCISSORS("s");

    private String move;

    Move(String move) {
        this.move = move;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    public static Move getMove(String move) {
        for (Move m : Move.values()) {
            if (m.move.equals(move)) return m;
        }
        return null;
    }
}
