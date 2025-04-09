public class Main {

    public static void greet() {
        System.out.println("Hello world. I am in a method/function");
    }


    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greet();
        greet();
        greet();

        int sum = add(6, 7);
        System.out.println(sum);
        System.out.println(add(6, 7));
    }
}

