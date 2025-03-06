 class stack {
    
    int arr[];
    int top;


    public stack(int size){
        arr = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top==arr.length-1){
            System.out.println("stack is overflown cant put more elements");
            return;
        }
        arr[++top]=value;
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack undeflow"); //if 3 then less than 0 means underflow
            return -1;
        }
        return arr[top--];
    }

    public int top(){
        if(top == -1){
           return -1;
        }
        return arr[top];
    }

    public void printStack() {  
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        stack s = new stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.print("before pop : ");
        s.printStack();
        System.out.println(s.pop());
        System.out.print("after pop : ");
        s.printStack();
        System.out.println(s.top());
        

    }
}
