package lection4;

public class MyException extends Exception{
    private static final long serialVersionUID = 1L;

    public MyException() {
        System.err.println("The group is full.");
    }
}
