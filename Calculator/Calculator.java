import java.util.Scanner;

public class Calculator {
    private static final Scanner sc = new Scanner(System.in);

    static void Add(int c, int d) {
        System.out.println("Addition of the two numbers is " + (c + d));
    }

    static void Sub(int c, int d) {
        System.out.println("Difference of the two numbers is " + (c - d));
    }

    static void Div(int c, int d) {
        if (d == 0) {
            System.out.println("Zero Division error!");
        } else {
            System.out.println("Division of the two numbers is: " + (c / d));
        }
    }

    static void Mul(int c, int d) {
        System.out.println("Multiplication of the two numbers is " + (c * d));
    }

    static void choice(int a, char op, int b) {
        switch (op) {
            case '+':
                Add(a, b);
                break;
            case '-':
                Sub(a, b);
                break;
            case '/':
                Div(a, b);
                break;
            case '*':
                Mul(a, b);
                break;
            default:
                System.out.println("Invalid operator!");
        }
    }

    static void start() {
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the operator (+ - * /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        choice(a, op, b);
        end();
    }

    static void end() {
        System.out.print("Type 'C' to continue and 'Q' to quit: ");
        char quit = sc.next().charAt(0);
        if (quit == 'C' || quit == 'c') {
            start();
        } else if (quit == 'Q' || quit == 'q') {
            System.out.println("Quitting...");
        } else {
            System.out.println("Unrecognized option. Try again.");
            end();
        }
    }

    public static void main(String[] args) {
        try {
            start();
        } finally {
            sc.close();
        }
    }
}
