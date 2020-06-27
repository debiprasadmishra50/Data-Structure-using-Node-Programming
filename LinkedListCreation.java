import java.util.Scanner;

class Node{
	int data;
	Node link;
	
	}

public class LinkedListCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node start=null;
		Scanner sc=new Scanner(System.in);
		//Node creation
		Node p=new Node();
		p.data=sc.nextInt();
		p.link=null;
		start=p;
		//1st Node ends
		
		//2nd Node creation
		Node q=new Node();
		q.data=sc.nextInt();
		q.link=null;
		p.link=q;
		//2nd Node ends
		
		
		while(start!=null) 
		{
			System.out.print(start.data+" ");
			start=start.link;
			
		}
		
	}

}
