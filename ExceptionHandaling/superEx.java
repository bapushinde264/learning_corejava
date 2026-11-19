package ExceptionHandaling;

class Parent {
    int balance = 5000;

    void display() {
        System.out.println(balance + "Parent");
    }
}

class Child extends Parent {

    void display() {
        System.out.println(super.balance + "Parent");
        super.display();
    }
}

public class superEx {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }

}
