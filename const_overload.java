//Overloading contructors

/*class Boxarea{
    int width;
    int height;

    Boxarea(){
        width=10;
        height=10;

    }

    Boxarea(int w, int h){
        width=w;
        height=h;
    }
    Boxarea(int l)
    {
        width=height=l;
    }

    int area()
    {
        return width*height;
    }
}

public class const_overload {
    
    public static void main(String[] args) {
        
        Boxarea obj = new Boxarea();
        Boxarea obj1 = new Boxarea(20,30);
        Boxarea obj2 = new Boxarea(5);

        int result1 =obj.area();
        int result2 =obj1.area();
        int result3 =obj2.area();

        System.out.println("Result 1: "+result1);
        System.out.println("Result 2: "+result2);
        System.out.println("Result 3: "+result3);


    }
}
*/
//Passing object as a paramter to the function
// To cgeck whether width and height of 2 objects are equal

/*class Boxarea {
    int width;
    int height;

    Boxarea(int w, int h) {
        width = w;
        height = h;
    }

    boolean equals(Boxarea obj) {
        if (obj.width == width && obj.height == height) {
            return true;
        } else {
            return false;
        }
    }

}

public class const_overload {

    public static void main(String[] args) {

        Boxarea obj1 = new Boxarea(100, 22);
        Boxarea obj2 = new Boxarea(100, 22);
        Boxarea obj3 = new Boxarea(1, 33);

        boolean result1 = obj1.equals(obj2);
        boolean result2 = obj1.equals(obj3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

    }
}*/

// Parameterized constructor where object of class is passed as a paramter.

/*class Boxarea {
    int width;
    int height;

    Boxarea(Boxarea obj) { // Object of class is passed as a parameter
        width = obj.width;
        height = obj.height;

    }

    Boxarea() {
        width = 10;
        height = 10;

    }

    Boxarea(int w, int h) {
        width = w;
        height = h;
    }

    Boxarea(int l) {
        width = height = l;
    }

    int area() {
        return width * height;
    }
}

public class const_overload {

    public static void main(String[] args) {

        Boxarea obj = new Boxarea();
        Boxarea obj1 = new Boxarea(20, 30);
        Boxarea obj2 = new Boxarea(5);
        Boxarea obj3 = new Boxarea(30, 40);
        Boxarea objparam = new Boxarea(obj1);

        int result1 = obj.area();
        int result2 = obj3.area();
        int result3 = obj2.area();
        int result4 = objparam.area();

        System.out.println("Result of default constructor: " + result1);
        System.out.println("Result of parameterized contructor: " + result2);
        System.out.println("Result of single paramter: " + result3);
        System.out.println("Result of params: " + result4);

    }
}*/

//Call by value in the parameters

/*class Params {

    void set(int a, int b) {
        a *= 2;
        b += 10;
    }
}

public class const_overload {

    public static void main(String[] args) {

        int a, b;
        a = 10;
        b = 20;
        Params obj = new Params();
        System.out.println("Before calling the function :" + a + " " + b);

        obj.set(a,b);
        System.out.println("After calling the function :" + a + " " + b);

    }
}
*/

// Call by reference in the parameters

/*class Params {

    int a,b;
    Params(int x, int y)
    {
        a=x;
        b=y;
    }
    void set(Params obj) {
        obj.a *= 2;
        obj.b += 10;
    }
}

public class const_overload {

    public static void main(String[] args) {

        Params obj = new Params(10,20);
        System.out.println("Before calling the function :" + obj.a + " " + obj.b);

        obj.set(obj);
        System.out.println("After calling the function :" + obj.a + " " + obj.b);

    }
}
*/

//Returning objects
class test {

    int a;

    test(int i) {
        a = i;
    }

    test incrByTen() {
        test temp = new test(a + 10);
        return temp;
    }
}

public class const_overload {

    public static void main(String[] args) {

        test obj1 = new test(2);
        test obj2;
        obj2 = obj1.incrByTen();
        System.out.println("Value of a in obj1 :" + obj1.a);
        System.out.println("Value of a in obj2 1:" + obj2.a);
        obj2 = obj2.incrByTen();
        System.out.println("Value of a in obj2 2 :" + obj2.a);

    }
}