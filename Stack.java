//Stack

/*class techStack {

    private int stack[] = new int[10];
    private int top = -1;

    void push(int m) {
        if (top == 9) {
            System.out.println("Stack is full");

        } else {
            stack[++top] = m;
        }
    }

    int pop() {
        if (top == -1) {
            return -1;
        } else {
            return stack[top--];
        }
    }

}

public class Stack {
    public static void main(String[] args) {

        techStack obj = new techStack();
        for (int i = 0; i < 10; i++) {
            System.out.println("Push :" + i);
            obj.push(i);
        }

        System.out.println("\n");
        for (int i = 0; i < 11; i++) {
            int a = obj.pop();
            if (a == -1) {
                System.out.println("Stack empty");
            } else {
                System.out.println("Pop :" + a);
            }
        }

        // these statements are not legal
        // obj.top = -2;
        // obj.stack[3] = 100;

    }
}*/

//Static variables and methods

/*class Stack {

    static int a = 3;
    static int b;

    static void meth(int x) {
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);

    }

    static{
        System.out.println("Static block initialised");
        b=a*4;
    }
    public static void main(String[] args) {

        meth(10);
    }
}
*/


