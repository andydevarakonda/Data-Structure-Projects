import java.util.*;

/**
 * Write a description of class LinkedListStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedListStack<T> implements StackADT<T>
{
    private Node<T> top;        // Reference to top element of stack
    private Node<T> bottom;        // Reference to bottom element of stack
    private int count;            // Reference to number of elements in stack

    // Initializes an empty stack
    public LinkedListStack() {
        top = null; 
        count = 0;
    }

    // Adds the given element to the top of the stack (expands capacity if necessary)
    @Override
    public void push(T element) {
        Node<T> n = new Node<T>(element, top);

        top = n;
        count++;

        
    }
    // Removes the top item from the stack and returns it
    @Override
    public T pop() {

        if(isEmpty())
        {
            System.out.println("Empty Stack");
            return null;
        }

        Node<T> newNode = top;

        top = newNode.getLink(); 
        count--; 

        return newNode.getData();

    }
    // Returns the top item
    @Override
    public T peek() {

        if(isEmpty())
        {
            System.out.println("Empty Stack");
            return null;
        }

        return top.getData();
    }

    @Override
    public boolean isEmpty() {

        return top == null; 
    }

    // Returns the number of elements in the stack
    @Override
    public int size() {

        return count; 

    }
    // Returns a string representation of this stack
    @Override
    public String toString() {

        String str = " ";

        Node next = top;

        if(size() == 0)
            System.out.println("Empty Stack");

        while(next != null) 
        {
            str += (next.getData() + " ");
            next = next.getLink(); 
        }
        return str;
    }
}
