import java.util.*;
public class Stack {
    int maxsize;
    int top;
    int[] stack;


    Stack(int size) {
        maxsize = size;
        top=-1;
        stack = new int[maxsize];
    }

    public boolean Empty() {
        return top == -1;
    }

    public boolean full() {
        return top == maxsize - 1;
    }

    public void push(int data) {
        if (full()) {
            System.out.println("this time memory is full");
        }
        stack[++top] = data;

    }

    public int pop() {
        if (Empty()) {
            System.out.println("no value in the memmory");
        }
        int poppedelement = stack[top--];
        System.out.println("pooped :" + poppedelement);
        return poppedelement;
    }

    public int peek() {
        if (Empty()) {
            System.out.println("Stack is empty! No top element");
            return -1;
        }
        System.out.println("Top element: " + stack[top]);
        return stack[top];
    }

    public void print() {
        if (Empty()) {
            System.out.println("Memmory is empty");
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i]+"->");
        }
        System.out.println();

    }
    Stack high;
    int size = 0;

        int data;
        Stack next;
        Stack prev;
        Stack (int data,int value){
           this.data = data;
           this.next = null;
           this.prev = null;
        }


public static void main(String[] args){
        Stack st = new Stack(20);
        st.push(2);
        st.push(32);
        st.push(445);
        st.push(40);
        st.push(36);
        st.print();
        st.pop();
        st.print();
}
}