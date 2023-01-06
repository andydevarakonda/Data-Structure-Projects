
/**
 * Write a description of class Stop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Route
{
    private Stop start;
    private Stop end;

    //constructor
    public Route() {
        this.start = null;
        this.end = null;
    }

    public void addStart(String address,int orderNumber){
        if(start == null && end == null){
            start=end= new Stop(address,orderNumber);
            return;
        }
        Stop s = new Stop(address, orderNumber);
        s.setNext(start);
        start.setPrevious(s);
        start = s;
    }

    public void addEnd(String address, int orderNumber){
        if(start == null && end == null){
            start=end= new Stop(address,orderNumber);
            return;
        }
        Stop s = new Stop(address, orderNumber);
        s.setPrevious(end);
        end.setNext(s);
        end = s;
    }

    public void insert(String address, int orderNumber){
        if(start == null && end == null){
            start=end= new Stop(address,orderNumber);
            return;
        }
        if(address.compareToIgnoreCase(start.getAddress())<0) 
        {
            addStart(address,orderNumber);
            return;
        }
        Stop temp_var=start;
        while(temp_var!=null) {
            if(address.compareToIgnoreCase(temp_var.getAddress())<0) {
                Stop s = new Stop(address,orderNumber);
                s.setPrevious(temp_var.getPrevious());
                s.setNext(temp_var);
                temp_var.getPrevious().setNext(s);
                temp_var.setPrevious(s);
                
                return;
            }
            temp_var=temp_var.getNext();
        }
        addEnd(address,orderNumber);
        

    }

   
    public String toString() {

        String string="";
        if( start == null && end == null){
            return "No stops on route";
        }
        Stop temp_var=start;
        while(temp_var!=null) {
            string=string+temp_var.toString()+"\n";
            temp_var=temp_var.getNext();
        }
        return string;
        
    }
}
