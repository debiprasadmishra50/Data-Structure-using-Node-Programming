import java.util.Scanner;

class Node1{
	int info;
	Node1 link;
}
public class CreationOfMultipleNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("no of nodes u wanna give");
		int n=sc.nextInt();
		Node1 start,p,q;
		start=null;
		//1st node created
		p=new Node1();
		System.out.println("enter node info");
		p.info=sc.nextInt();
		p.link=null;
		start=p;
		
		for(int i=2;i<=n;i++)
		{
			//2nd node 
			q=new Node1();
			System.out.println("enter node info");
			q.info=sc.nextInt();
			q.link=null;
			p.link=q;
			p=q;
			
		}
		while(start!=null) 
		{
			System.out.print(start.info+" ");
			start=start.link;
			
		}
		
	}

}
