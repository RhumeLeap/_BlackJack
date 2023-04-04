package io.turntabl.game;

public class NoCardException extends Exception {

    private String message;

    public NoCardException(String s) {
        this.message = getMessage() + s;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "NoCardException{" + getMessage() + '}';
    }
}
