
import java.util.*;

class Node {
    char ch;
    int freq;
    Node left, right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }
}

public class HuffmanEncoding {

    static void printCode(Node root, String code) {
        if (root == null)
            return;

        if (root.left == null && root.right == null) {
            System.out.println(root.ch + " : " + code);
            return;
        }

        printCode(root.left, code + "0");
        printCode(root.right, code + "1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> a.freq - b.freq
        );

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter character: ");
            char ch = sc.next().charAt(0);

            System.out.print("Enter frequency: ");
            int freq = sc.nextInt();

            pq.add(new Node(ch, freq));
        }

        while (pq.size() > 1) {
            Node x = pq.poll();
            Node y = pq.poll();

            Node parent = new Node('-', x.freq + y.freq);
            parent.left = x;
            parent.right = y;

            pq.add(parent);
        }

        System.out.println("Huffman Codes:");

        Node root = pq.poll();

        if (root != null) {
            if (root.left == null && root.right == null)
                System.out.println(root.ch + " : 0");
            else
                printCode(root, "");
        }

        sc.close();
    }
}

//output
// Enter number of characters: 4

// Enter character: A
// Enter frequency: 5

// Enter character: B
// Enter frequency: 9

// Enter character: C
// Enter frequency: 12

// Enter character: D
// Enter frequency: 13
