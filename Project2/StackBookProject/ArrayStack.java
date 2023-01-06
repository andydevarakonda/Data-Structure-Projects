import java.util.ArrayList;
import java.util.Stack;

public class ArrayStack <T> implements StackADT<T>{

    private T[] stack;
    private int top;

    private static int DEFAULT_CAPACITY = 2;

    // Creates an empty stack using the default capacity
    public ArrayStack() {
        this(DEFAULT_CAPACITY); //default list
    }

    // Creates an empty stack using the specified capacity
    public ArrayStack(int initialCapacity) {
        top=0;
        stack = (T[]) (new Object[initialCapacity]);
        
        
    }

    // Adds the given element to the top of the stack (expands capacity if necessary)
    @Override
    public void push(T element) {
        stack[top] = element;
        top++;
    }
    // Removes the top item from the stack and returns it
    @Override
    public T pop() {
        if(isEmpty())
        {
            System.out.println("Empty Stack");
            return null;
        }
        top--;
        T result = stack[top]; 
        stack[top] = null;
        return result;
    }

    // Returns the top item
    @Override
    public T peek() {
        if(isEmpty())
        {
            System.out.println("Empty Stack");
            return null;
        }
        return stack[top-1]; 
    }
    // Returns true if the stack is empty and false otherwise
    @Override
    public boolean isEmpty() {
        return(top == 0); 
    }

    // Returns the number of elements in the stack
    @Override
    public int size() {
        return top; 
    }

    // Returns a string representation of this stack
    @Override
    public String toString() {
        String str = "";
        for(int i = 0; i < top; i++) {
            str += stack[i].toString() + "\n";
        }
        return str;
    }
}