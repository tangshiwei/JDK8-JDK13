package chapter1;

public interface Anima {
    void run();
    void eat();
    default void breath(){
        System.out.println("这个是呼吸方法");
    }
    static void test(){
        System.out.println("这个是静态方法");
    }
}

