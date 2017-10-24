package proxy;

public class Car implements IMoveable {
    @Override
    public void move() {
        System.out.println("I am a car . I can move.");
    }
}
