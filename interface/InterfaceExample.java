
interface vehicle {
    void start();

    void stop();
}

class Car implements vehicle {

    public void start() {
        System.out.println("start method called");
    }

    public void stop() {
        System.out.println("stop method called");
    }

}

public class InterfaceExample {
    public static void main(String[] args) {

        vehicle obj;
        obj = new Car();
        obj.start();
        obj.stop();

    }

}
