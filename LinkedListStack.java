class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top; 

    public Stack() {
        this.top = null;
    }

    // Push operation
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        System.out.println(data + " pushed onto stack.");
    }

    // Pop operation
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Nothing to pop.");
            return;
        }
        System.out.println("Popped: " + top.data);
        top = top.next;
    }

 // Return top element
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Print stack elements
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node temp = top;
        System.out.print("Stack elements: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedListStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();

        System.out.println("Top element: " + stack.top());

        stack.pop();
        stack.print();

        System.out.println("Stack empty? " + (stack.isEmpty() ? "Yes" : "No"));
    }
}
