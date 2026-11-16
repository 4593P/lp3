//Non-recursive
import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
//sample output
// Enter number of terms: 7
// Fibonacci Series:
// 0 1 1 2 3 5 8

//Recursive

import java.util.Scanner;

public class FibonacciRecursive {

    static int fibonacci(int n) {
        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}

//sample output
// Enter number of terms: 7
// Fibonacci Series:
// 0 1 1 2 3 5 8

//(Iterative)
// n = int(input("Enter number of terms: "))

// a = 0
// b = 1

// print("Fibonacci Series:")

// for i in range(n):
//     print(a, end=" ")

//     c = a + b
//     a = b
//     b = c
//Recursive
  
// def fibonacci(n):
//     if n == 0:
//         return 0

//     if n == 1:
//         return 1

//     return fibonacci(n - 1) + fibonacci(n - 2)


// n = int(input("Enter number of terms: "))

// print("Fibonacci Series:")

// for i in range(n):
//     print(fibonacci(i), end=" ")

//c++
// 1.iterative
  
// #include <iostream>
// using namespace std;

// int main() {
//     int n;

//     cout << "Enter number of terms: ";
//     cin >> n;

//     int a = 0, b = 1;

//     cout << "Fibonacci Series:" << endl;

//     for (int i = 0; i < n; i++) {
//         cout << a << " ";

//         int c = a + b;
//         a = b;
//         b = c;
//     }

//     return 0;
// }

// 2.Recursive
  
// #include <iostream>
// using namespace std;

// int fibonacci(int n) {
//     if (n == 0)
//         return 0;

//     if (n == 1)
//         return 1;

//     return fibonacci(n - 1) + fibonacci(n - 2);
// }

// int main() {
//     int n;

//     cout << "Enter number of terms: ";
//     cin >> n;

//     cout << "Fibonacci Series:" << endl;

//     for (int i = 0; i < n; i++) {
//         cout << fibonacci(i) << " ";
//     }

//     return 0;
// }


