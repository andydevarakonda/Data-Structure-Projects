/*
 * Notice that System.out.println() has been called in most methods 
 * We recommend that you keep these lines of code where they are, 
 * to help you follow the process of your code.
 */

public class PriorityQueue {

    //Reference to the first node in the queue
    private PQNode first;

    // Default constructor, initializes empty list
    public PriorityQueue(){

        first = null;

    }

    // First add method
    public void add(String name, String problem, int priority) {
        /* DO NOT EDIT THIS METHOD */
        add(new PQNode(name, problem, priority));
    }

    // Second add method
    private void add(PQNode node) {
        System.out.println("add "+node.getName());

        PQNode temp = first; 

        if(first == null)  
        {
            first = node;
            return;
        }

        else if(first.getPriority() >= node.getPriority()) 
        {
            node.setNext(first);
            first = node;
        }
        else 
        {
            if(temp.getNext() == null)
            {
                temp.setNext(node);
            }

            while(temp.getNext() != null && node.getPriority() >= temp.getPriority())
            {
                temp = temp.getNext();
                return;
            }
            node.setNext(temp);
            temp = node;
        }
    }

    public PQNode remove() {
        System.out.println("remove");
        return remove(first);
    }

    private PQNode remove(PQNode node) {
        System.out.println("remove" +node.getName());

        PQNode l_node = null; 
        PQNode t_node = first; 

        if(first != l_node){
            first.getNext().setPrevious(null); 
        }
        else{
            l_node = null;
        }

        first = first.getNext();
        t_node.setNext(null);

        return t_node;
    }

    public PQNode peek() {
        return first;
    }

    public boolean isEmpty() {

        if(first ==null){
            return true;
        }
        else{
            return false;
        }
    }

    public int size() {
        int size = 0; 
        PQNode t = first; 
        while(t != null)
        {
            size++; 
            t.getNext(); 
        }
        return size; 
    }

    public void changePriority(String name, int newPriority) {
        System.out.println("change priority of "+name+" to "+newPriority);
        PQNode d=new PQNode(name,"",0);
        PQNode n=remove(d);
        add(name,n.getProblem(),newPriority);

    }

    public String toString() {
        /* DO NOT EDIT THIS METHOD */
        if(isEmpty()){
            return "Empty queue";
        }
        int index = 1;
        PQNode current = first;
        String s = "----------\n";
        while(current != null) {
            s += "-  #"+index+": "+current.toString()+"\n";
            current = current.getNext();
            index++;
        }
        s += "----------";
        return s;
    }
}
