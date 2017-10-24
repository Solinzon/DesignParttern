package proxy;

public class Plane implements IFly{

    @Override
    public void fly() {
        System.out.println("I am a plane.I can fly.");
    }
}
