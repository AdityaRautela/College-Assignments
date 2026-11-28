import java.util.Stack;
import java.util.LinkedList;
public class Stackassignment {
    // Challenge 1: Reverse a String
    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder reversed = new StringBuilder();
        while (!s.isEmpty()) {
            reversed.append(s.pop());
        }
        return reversed.toString();
    }
    // Challenge 2: Check Palindrome
    public static boolean isPalindrome(String str) {
        Stack<Character> s = new Stack<>();
        str = str.replaceAll("\\s+", "").toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != s.pop()) {
                return false;
            }
        }
        return true;
    }
    // Challenge 3: Reverse Stack using Another Stack
    public static Stack<Integer> reverseStack(Stack<Integer> original) {
        Stack<Integer> another = new Stack<>();
        while (!original.isEmpty()) {
            another.push(original.pop());
        }
        return another;
    }
    // Challenge 4: Stack using Linked List
    static class LinkedListStack {  
        LinkedList<Integer> list = new LinkedList<>();
        // Push
        void push(int data) {
            list.addLast(data);
        }
        // Pop
        int pop() {
            if (list.isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return list.removeLast();
        }
        // Peek
        int peek() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.getLast();
        }
        // Size
        int size() {
            return list.size();
        }
        // Is Empty
        boolean isEmpty() {
            return list.isEmpty();
        }
        // Display
        void display() {
            System.out.println(list);
        }
        // Find Middle Element
        int findMiddle() {
            if (list.isEmpty()) {
                return -1;
            }
            return list.get(list.size() / 2);
        }
    }
    // Main Method
    public static void main(String[] args) {
        // Basic Stack Operations
        System.out.println(" BASIC OPERATIONS ");
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println("Stack: " + s);
        System.out.println("Peek: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Stack after pop: " + s);
        System.out.println("Size: " + s.size());
        System.out.println("Is Empty: " + s.isEmpty());
        // Challenge 1
        System.out.println("\n REVERSE STRING ");
        System.out.println("Original String: HELLO");
        System.out.println("Reversed String: " + reverseString("HELLO"));
        // Challenge 2
        System.out.println("\n PALINDROME ");
        System.out.println("MADAM is Palindrome: " + isPalindrome("MADAM"));
        // Challenge 3
        System.out.println("\n REVERSE STACK ");
        Stack<Integer> s2 = new Stack<>();
        s2.push(10);
        s2.push(20);
        s2.push(30);
        System.out.println("Original Stack: " + s2);
        Stack<Integer> reversed = reverseStack(s2);
        System.out.println("Reversed Stack: " + reversed);
        // Challenge 4
        System.out.println("\n MIDDLE ELEMENT USING LINKED LIST ");
        LinkedListStack s3 = new LinkedListStack();
        s3.push(10);
        s3.push(20);
        s3.push(30);
        s3.push(40);
        s3.push(50);
        System.out.print("Stack: ");
        s3.display();
        System.out.println("Middle Element: " + s3.findMiddle());
        System.out.println("Top Element: " + s3.peek());
        System.out.println("Stack Size: " + s3.size());
    }
}