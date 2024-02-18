//Nester Inner class within outer class

class Outer {

    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("Value of outer_x is :" + outer_x);
                }
            }

            Inner obj = new Inner();
            obj.display();
        }
    }
}

public class Nested_class {
    public static void main(String[] args) {
        Outer obj1 = new Outer();
        obj1.test();
    }
}
