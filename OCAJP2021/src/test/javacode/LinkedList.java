package test.javacode;

public class LinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	void deleteNode(int key) {
		Node temp=head, prev=null;
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		if(temp==null)
			return;
		prev.next=temp.next;
	}
	public void push(int new_data) {
		Node new_node=new Node(new_data);
		new_node.next=head;
		head=new_node;
	}
	public void printList() {
		Node tnode=head;
		while(tnode!=null) {
			System.out.print(tnode.data+" ");
			tnode=tnode.next;
		}
	}		
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.printList();
	}
}

/*package test.javacode;
class LinkedList {
    Node head; // head of list
 
     Linked list Node
    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
     Given a key, deletes the first
       occurrence of key in
     * linked list 
    void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;
 
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }
 
        // Search for the key to be deleted, keep track of
        // the previous node as we need to change temp.next
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
 
        // If key was not present in linked list
        if (temp == null)
            return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
 
     Inserts a new Node at front of the list. 
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
     This function prints contents of linked list starting
       from the given node 
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
 
     Drier program to test above functions. Ideally this
    function should be in a separate user class. It is kept
    here to keep code compact 
    public static void main(String[] args)
    {
        LinkedList llist = new LinkedList();
 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        System.out.println("\nCreated Linked list is:");
        llist.printList();
 
        llist.deleteNode(1); // Delete node with data 1
 
        System.out.println(
            "\nLinked List after Deletion of 1:");
        llist.printList();
    }
}*/