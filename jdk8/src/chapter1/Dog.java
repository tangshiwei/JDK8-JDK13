package chapter1;

public class Dog implements Anima {
    @Override
    public void run() {
        System.out.println("dog running");
    }

    @Override
    public void eat() {
        System.out.println("dog eating");
    }
}
