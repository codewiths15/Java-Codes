/*class Box {
    double width;
    double height;
    double area;

    void area() {
        area = width * height;
        System.out.println("Area of rectangle is: " + area);
    }
}

class class_practise {
    public static void main(String[] args) {

        Box mybox = new Box();
        mybox.width = 22;
        mybox.height = 40;
        mybox.area();

    }
}*/
///////////////////////////////////////////////////

//Default constructor
/* 
class Box {
   double width;
   double height;
   double area;

   Box() {
       width = 10;
       height = 10;
       area = 0;
   }

   double area() {
       area = width * height;
       return area;
   }

}

class class_practise {
   public static void main(String[] args) {

       Box mybox = new Box();
       double a = mybox.area();
       System.out.println("Area of rectangle is:" + a);

   }
}
*/
///////////////////////////////////////////////////

//Parameterized constructor
class Box {
    double width;
    double height;
    double area;

    Box(double w, double h) {
        width = w;
        height = h;

    }

    double area() {
        area = width * height;
        return area;
    }

}

class class_practise {
    public static void main(String[] args) {

        Box mybox = new Box(10, 30);
        double a = mybox.area();
        System.out.println("Area of rectangle is:" + a);

    }
}