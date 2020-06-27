	import java.util.*;

class Node2{
	int info;
	Node2 link;
}
public class LinkedList_UsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Node2 start,q;
		//1st node
		Node2 p=new Node2();
		System.out.println("enter info");
		p.info=sc.nextInt();
		p.link=null;
		start=p;
		System.out.println("do u wanna add more nodes?<Y/N>");
		char option=sc.next().charAt(0);
		while(option!='N')
		{
			q=new Node2();
			System.out.println("enter info");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			System.out.println("do u wanna add more nodes?<Y/N>");
			option=sc.next().charAt(0);
		}

		while(start!=null) 
		{
			System.out.print(start.info+" ");
			start=start.link;
			
		}
		
		
	}

}
