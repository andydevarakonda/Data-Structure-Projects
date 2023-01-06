public class StackTest{
    



	public static void main(String[] args) {
		StackADT<Book> arrayStack = new ArrayStack<Book>();
		System.out.println("*** TEST ARRAY STACK ***");
		test(arrayStack);
		
		StackADT<Book> linkedListStack = new LinkedListStack<Book>();
		System.out.println("*** TEST LINKED LIST STACK ***");
		test(linkedListStack);
	}
	
	private static void test(StackADT<Book> stack) {
		stack.push(new Book("Introduction to Algorithms", "Thomas H. Cormen", 121.99));
		stack.pop();
		stack.pop();
		stack.push(new Book("Data Structures and Algorithms Made Easy", "Narasimha Karumanchi", 35.99));
		stack.push(new Book("Data Structures and Algorithms in Java", "Michael T. Goodrich, Roberto Tamassia", 51.99));
		System.out.println("Stack size: " + stack.size());
		System.out.println("The stack contents:\n" + stack);
		stack.pop();
		stack.push(new Book("The Algorithm Design Manual", "Steven Skiena", 55.99));
		stack.pop();
		System.out.println("Stack size: " + stack.size());
		System.out.println("The stack contents:\n" + stack);
	}
}
