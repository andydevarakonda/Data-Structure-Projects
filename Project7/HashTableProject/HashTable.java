public class HashTable {
    //use these final integers as codes for collision handling methods 
    public final int LINEAR_PROBE = 0;
    public final int QUADRATIC_PROBE = 1;
    public final int DOUBLE_HASHING = 2;

    private int size;                // number of places in the hash table
    private int[] table;            // array to hold the table
    private int collisionHandling;    // saves value of one of the above methods

    // Constructor to create new hash table of given size
    public HashTable(int size) {
        this.size = size;
        table = new int[size];
        collisionHandling = LINEAR_PROBE; //by default
    }

    // A method to set which collision handling method to use  
    public void setCollisionHandling(int collisionHandling) {
        this.collisionHandling = collisionHandling;
    }

    // The hash function
    private int hash(int value) {
        // h(k) = k % size;
        int hashCode = value % size;
        return hashCode;
    }

    // A method to insert integers into the hash function
    public void add(int value) {
        int hash = hash(value);
        add(hash,value);
    }

    // A method to insert integer at the given hash code (index)
    private void add(int hash, int value) {
        if(table[hash] == 0) {
            table[hash] = value;
        }else if(table[hash] == value) {
            System.out.println("Cannot add duplicate value ("+value+")");
        }else {
            handleCollision(hash, value);
        }
    }

    // A method to call the correct collision handling method,
    //         depending on the set value of collisionHandling
    private void handleCollision(int hash, int value) {
        switch (collisionHandling){
            case LINEAR_PROBE:
                linearProbing(hash, value);
                break;
            case QUADRATIC_PROBE:
                quadraticProbing(hash, value);
                break;
            case DOUBLE_HASHING:
                doubleHashing(hash, value);
                break;
            default:
                linearProbing(hash, value);    
        }
    }

    // collisionHandling method 0, linear probing
    private void linearProbing(int hash, int value) {

        for(int in = 0; in < this.size; in++ ){  

            int nHash = (hash + in)%(this.size) ;

            if(table[nHash] == 0){
                table[nHash] = value;
                return;
            }
        }

    }

    // collisionHandling method 1, quadratic probing
    private void quadraticProbing(int hash, int value) {
        for(int in = 0; in < this.size; in++ ){
            int nHash = (hash + in*in)%this.size;
            if(table[nHash] == 0){
                table[nHash] = value;
                return;
            }
        }
    }
    // collisionHandling method 2, double hashing
    private void doubleHashing(int hash, int value) {

        int double_hash  = nextLargestPrime()-(value % nextLargestPrime());
        for (int in = 0; in<size; in++) {
            int nHash= (hash+ in*double_hash)% this.size;
            if (table[nHash]== 0) {
                table[nHash] = value;
                return;
            }
        }
    }

    // A method to return the largest prime number less than the array's size
    private int nextLargestPrime() {
        int q;
        for(q = size-1; q > 1; q--) {
            if(isPrime(q)) 
                break;    // selects the largest prime number that's smaller than the size of the table
        }
        return q;
    }

    // A boolean method to return if a number is prime
    private boolean isPrime(int n) {
        //if n is divisible by any integer i such that 1 < i < n
        for(int i = 2; i < n; i++) {
            if(n%i == 0)
                return false; //n is not prime
        }
        //else n is prime
        return true;
    }

    // A method to clear all the data from the table 
    public void clear() {
        table = new int[size];
    }

    // A standard toString method, returns [ __ __ ... __ ]
    public String toString() {
        String s = "[ ";
        for(int i : table) {
            if(i == 0) {
                s += "__ ";
            }else {
                s += i + " ";
            }
        }
        return s + "]";
    }
}
