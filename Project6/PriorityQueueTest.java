public class PriorityQueueTest {
    public static void main(String[] args) {
        
        PriorityQueue pq = new PriorityQueue();
        
        pq.add("Alice", "broken leg", 3);
        pq.add("Bob", "sore throat", 5);
        pq.add("Cameron", "head injury", 2);
        pq.add("Dorothy", "broken arm", 3);
        pq.add("Eric", "deep cut, serious blood loss", 2);
        pq.add("Fred", "heart attack, resuscitation", 1);
        
        System.out.println(pq.toString());
        
        pq.remove();
        
        System.out.println(pq.toString());
        
        System.out.println("Bob is suddenly unable to breathe and becomes unconscious.");
        pq.changePriority("Bob", 1);

        System.out.println(pq.toString());
    }
}
