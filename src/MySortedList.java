
public class MySortedList {

	private Node head;
	
	private class Node{
		
		public int element;
		public Node link;
		
		public Node(int e, Node l){
			element = e;
			link = l;
		}
	}
	
	public MySortedList(){
		head = null;
	}
	
	public void add(int i){
		if(head == null){
			Node n = new Node(i,null);
			Node temp = head;
			head = n;
			head.link = temp;
		}else if(i<=head.element){
			Node n2 = new Node(i,null);
			Node temp = head;
			head = n2;
			head.link = temp;
		}else{
			Node store = head;
			
			while(store.link != null && store.link.element < i){
				store = store.link;
			}
			
			Node n3 = new Node(i, null);
			Node temp = store.link;
			store.link = n3;
			n3.link = temp;
		}
	}
	
	public void delete(int i){
		Node current = head;
		if(isEmpty()){
			System.out.println("list is empty");
			return;
		}
		if(head.element == i){
			System.out.println(i + " deleted");
			head = head.link;
			return;
		}
		while(true){
			if(current.link == null || current.link.element > i){
				System.out.println("not in list");
				break;
			}else if(current.link.element == i){
				System.out.println(i + " deleted");
				current.link = current.link.link;
				break;
			}else{
				//System.out.println(i + " deleted");
				current = current.link;
			}
		}
	}
	
	public int max(){
		Node current = head;
		int max = current.element;
		while(true){
			current = current.link;
			if(current == null)
				return max;
			if(current.element > max)
				max = current.element;
		}
	}
	
	public int min(){
		return head.element;
	}

	public void print(){
		Node current = head;
		while(current != null){
			System.out.print(current.element + " ");
			current = current.link;
		}
		System.out.println("\n");
	}
	
	public boolean isEmpty(){
		return head == null;
	}
}
