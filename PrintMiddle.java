// Java program to find middle of linked list 
import java.util.*;
class PrintMiddle{
public static void main(String [] args) 
	{       
                Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList(); 
                System.out.println("Enter the number of elements you insert");
                int n=sc.nextInt();
                for(int i=0;i<n;i++){
                    list.add(sc.nextInt());
                }
	        list.printMiddle(); 
		
	} 
}
class LinkedList 
{ 
	Node head,tail; 
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	/* Function to print middle of linked list */
	void printMiddle() 
	{ 
		Node slow_ptr = head; 
		Node fast_ptr = head; 
		if (head != null) 
		{ 
			while (fast_ptr != null && fast_ptr.next != null) 
			{ 
				fast_ptr = fast_ptr.next.next; 
				slow_ptr = slow_ptr.next; 
			} 
			System.out.println("The middle element is " + 
								slow_ptr.data); 
		} 
	} 

	/* Inserts a new Node at back of the list. */
	public void add(int new_data) 
	{ 
		Node new_node = new Node(new_data); 
		if(head==null) 
                {
                      head=new_node; 
                      tail=new_node;
                }
                else
                {
                   tail.next=new_node;
                   tail=new_node;
                }              
	} 
} 

