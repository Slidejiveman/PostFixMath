package PostFixMathPD;

public class LinkedStack<String> implements Stack<String> {
	/**--------Create Empty List--------*/
	private SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    /**--------Constructor--------*/
	public LinkedStack() {
		
	}
	/**--------Interface Methods--------*/
	public int size() {
		return this.list.size();
	}
	public boolean isEmpty() {
		return this.list.isEmpty();
	}
	public void push(String string) {
		this.list.addFirst(string);
	}
	public String top() {
		return this.list.first();
	}
	public String pop() {
		return this.list.removeFirst();
	}
}
