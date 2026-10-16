package oops.classAndobjects;

class Dog {
    // String name = "Rocky";
    String name;

    void bark() {
        System.out.println(name + " Bark!!!");
    }
}

public class classobjectExmp {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.bark();

        Dog obj2 = new Dog();
        obj2.name = "Bapu";
        obj2.bark();

    }

}
