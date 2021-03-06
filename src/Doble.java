/**
 * @author Mar�a Mercedes Retolaza, 16339 
 * Esta clase implementa los m�todos de la lista doble 
 *
 * @param <E>
 */
public class Doble<E> extends AbstractList<E> implements iStack<E>{
	protected int count;
	protected DoublyLinkedNode<E> head;
	protected DoublyLinkedNode<E> tail;


	/**
	 * Constructor De la lista doble 
	 */
	public Doble(){
		head = null;
		tail = null;
		count = 0;
	}

	/**
	 * @param value
	 * @param head
	 * @param object
	 */
	private Doble(E value, Doble<E> head, Object object) {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}


	/**
	 * @param value
	 */
	public void addFirst(E value){
		head = new DoublyLinkedNode<E>(value, head, null);
		if (tail == null) tail = head;
		count++;
	}

	/**
	 * @param value
	 */
	public void addLast(E value){
		tail = new DoublyLinkedNode<E>(value, null, tail);
		if (head == null) head = tail;
		count++;
	}

	/**
	 * @return
	 */
	public E removeLast(){
		DoublyLinkedNode<E> temp = tail;
		return null;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public void addFirst() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void addLast() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public E getLast() {
		throw new UnsupportedOperationException("Not supported yet."); 
	}

	@Override
	public void push(E p) {
		tail = new DoublyLinkedNode<E>(p, null, tail);
		if (head == null) head = tail;
		count++;
	}

	@Override
	public E pop() {
		DoublyLinkedNode<E> temp = tail;
		if(!isEmpty()){
			if(head.nextElement==null){
				head = null;
				tail = null;
			}
			else{
				tail = tail.previousElement;
				tail.nextElement = null;
			}}

		return (E)temp.value();
	}}