class Node3{
	int info;
	Node3 link;
}
public class CountingNoOfNodes {

	public static int count(Node3 start)
	{
		int c=0;
		Node3 ptr=start;
		while(ptr!=null)
		{
			c=c+1;
			ptr=ptr.link;
		}
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node3 start=new Node3();
		start=null;
		int c=count(start);
		System.out.println(c);
		
	}

}
