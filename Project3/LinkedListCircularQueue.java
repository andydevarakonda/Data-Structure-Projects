public class LinkedListCircularQueue {

    private int count;
    private Node front, rear;

    // Creates an empty queue
    public LinkedListCircularQueue(){
        front = null;
        rear = null;
        count = 0;

    }

    // Adds the specified element to the rear of the queue
    public void enqueue(String element) {

        Node n = new Node(element,null);

        if(isEmpty()){

            front =n;
            //n.setLink(n);
        }
        else{

            rear.setLink(n);

        }
        rear = n;
        rear.setLink(front);
        count++;
    }

    // Removes the element at the front of the queue and returns a reference to it
    public String dequeue()  {
        String head = null;
        if(isEmpty())
        {
            System.out.println("Empty Queue"); 
            return null;
        }

        head = front.getData();
        front = front.getLink(); 
        count--;

        if(isEmpty())
            rear = null; 

        return head; 

    }

    // Returns the element at the front of the queue without removing it
    public String first() {

        if(isEmpty())
        {
            System.out.println("Empty Queue");
            return null;
        }

        return front.getData();

    }

    // Returns true if the queue contains no elements, false otherwise
    public boolean isEmpty() {
        return (count ==0);

    }

    // Returns the number of elements in the queue
    public int size() {

        return count; 
    }
    // Returns a string representation of the queue
    public String toString() {
        String result = "";
        Node current = front;
        if (!isEmpty())
            do {
                result = result + (current.getData()).toString() + "\t";
                current = current.getLink();
            } while (current != front);
        return result;
    }

}
