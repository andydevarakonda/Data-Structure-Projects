import java.util.*;
/**
 * Write a description of class GroceryLists here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GroceryLists{
    public static void main(String[] args) {
        /* DO NOT EDIT THE MAIN METHOD */

        //declare and initialize an ArrayList for each person
        ArrayList<GroceryItem> aList = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> bList = new ArrayList<GroceryItem>();
        ArrayList<GroceryItem> cList = new ArrayList<GroceryItem>();

        //populate all three lists
        addGroceries(aList, bList, cList);

        //print the three lists
        System.out.println("Arya's List:");
        printList(aList);
        System.out.println("Brighton's List:");
        printList(bList);
        System.out.println("Charlie's List:");
        printList(cList);

        //combine the three lists into one ArrayList (allList)
        System.out.println("Combined List: ");
        ArrayList<GroceryItem> allList = combineLists(aList, bList, cList);
        printList(allList);

        //remove all "broccoli" from allList
        deleteByName(allList, "broccoli");
        System.out.println("No more broccoli:");
        printList(allList);

        //count the number of unique items in allList
        System.out.println("Number of unique items: " + countUnique(allList)
            + "\n***");

        //print a temporary list containing only the fruit category
         System.out.println("Just the fruits:");
         printList(findCategory(allList, "fruit"));

        // //BONUS: combine duplicated items (e.g. 2 apple + 1 apple = 3 apple)
        // combineDuplicates(allList);
        // System.out.println("BONUS - Combined duplicates:");
        // printList(allList);
    }

    private static void addGroceries(ArrayList<GroceryItem> aList, ArrayList<GroceryItem> bList, ArrayList<GroceryItem> cList) {
        /* DO NOT EDIT THIS METHOD */

        //adding items to Arya's list
        aList.add(new GroceryItem("bell pepper", "vegetable", 2));
        aList.add(new GroceryItem("pineapple", "fruit", 1));
        aList.add(new GroceryItem("apple", "fruit", 2));
        aList.add(new GroceryItem("cheese", "dairy", 2));
        aList.add(new GroceryItem("bagel", "bakery", 2));

        //adding items to Brighton's list
        bList.add(new GroceryItem("broccoli", "vegetable", 3));
        bList.add(new GroceryItem("apple", "fruit", 4));
        bList.add(new GroceryItem("bagel", "bakery", 6));
        bList.add(new GroceryItem("bacon", "meat", 1));
        bList.add(new GroceryItem("yogurt", "dairy", 1));

        //adding items to Charlie's list
        cList.add(new GroceryItem("cheese", "dairy", 1));
        cList.add(new GroceryItem("bagel", "bakery", 4));
        cList.add(new GroceryItem("banana", "fruit", 6));
        cList.add(new GroceryItem("turkey", "meat", 1));
        cList.add(new GroceryItem("broccoli", "vegetable", 2));
    }

    private static ArrayList<GroceryItem> combineLists(ArrayList<GroceryItem> aList, ArrayList<GroceryItem> bList, ArrayList<GroceryItem> cList) {
        ArrayList<GroceryItem> masterList = new ArrayList<GroceryItem>();
        masterList.addAll(aList);
        masterList.addAll(bList);
        masterList.addAll(cList);
        return masterList;
    }

    private static void deleteByName(ArrayList<GroceryItem> list, String name) {
        for(int i = 0; i<=list.size();i++){
            if(list.get(i).getName().equals(name)){
                list.remove(i);
            }
        }
    }

    private static void printList(ArrayList<GroceryItem> list) {
        for(int i = 0;i <=list.size();i++){
            if( i >= list.size()){
                System.out.println("***");
            }
            else{
                System.out.println("- "+ list.get(i).toString());
            }
        }
    }

    private static ArrayList<GroceryItem> findCategory(ArrayList<GroceryItem> list, String category) {
        ArrayList<GroceryItem> masterList = new ArrayList<GroceryItem>();
        for (GroceryItem g : list) 
        {
            if(g.getCategory().equals(category)){
            masterList.add(g);
        }
    }
        return masterList; //temporary, change this later
    }

    private static int countUnique(ArrayList<GroceryItem> list) {
        int count = 0;
        ArrayList<String> masterList = new ArrayList<String>();
        ArrayList<String> masterList_temp = new ArrayList<String>();
        for (GroceryItem g : list) 
        {
            masterList.add(g.getName());
        }
        for(int i = 0;i <masterList.size();i++){
            if(!masterList_temp.contains(masterList.get(i))){
                masterList_temp.add(masterList.get(i));
                count++;
            }
        }
        return count;
    }

    // private static void combineDuplicates(ArrayList<GroceryItem> list) {
        // ArrayList<GroceryItem> masterList = new ArrayList<GroceryItem>();
        // ArrayList<GroceryItem> masterList_temp = new ArrayList<GroceryItem>();
        // for (GroceryItem g : list) 
        // {
            // masterList.add(g);
        // }
        // for(int i = 0;i <masterList.size();i++){
            // if(){
                // masterList_temp.add(masterList.get(i));
                
            // }
        // }
        
    // }
}
