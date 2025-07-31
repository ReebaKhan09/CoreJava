package Recursion;

public class printNo {
    static void printNumbers(int n) {
        if (n > 5) return;  // Base Case

        System.out.println(n);
        printNumbers(n + 1);  // Recursive call
    }

    public static void main(String[] args) {
        printNumbers(1);  // Start from 1
    }
}
