
/**
 * Write a description of class Stop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stop
{
    private String address;
    private Stop next;
    private int orderNumber;
    private Stop previous;

    //constructor
    public Stop(String address, int orderNumber) {
        this.address = address;
        this.orderNumber = orderNumber;
        this.next = null;
        this.previous = null;
    }

    //getter methods
    public String getAddress() {
        return address;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Stop getNext() {
        return next;
    }
    
    public Stop getPrevious() {
        return previous;
    }
    //setter methods
    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setNext(Stop next) {
        this.next = next;
    }
    
    public void setPrevious(Stop previous) {
        this.previous = previous;
    }

    //toString method, e.g. "[123 Sesame St. (#456)]"
    @Override
    public String toString() {
        return "["+ address + ". " +"(#"+ orderNumber+")]";
    }
}

