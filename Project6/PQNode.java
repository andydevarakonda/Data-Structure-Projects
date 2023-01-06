public class PQNode {
    private String name;
    private String problem;
    private int priority;
    private PQNode previous, next;

    public PQNode(String name, String problem, int priority) {
        this.name = name;
        this.problem = problem;
        this.priority = priority;
        previous = next = null;
    }

    public String getName() {
        return name;
    }

    public String getProblem() {
        return problem;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public PQNode getPrevious() {
        return previous;
    }

    public void setPrevious(PQNode previous) {
        this.previous = previous;
    }

    public PQNode getNext() {
        return next;
    }

    public void setNext(PQNode next) {
        this.next = next;
    }

    public String toString() {
        return "["+name+" - "+problem+" ("+priority+")]";
    }
}
