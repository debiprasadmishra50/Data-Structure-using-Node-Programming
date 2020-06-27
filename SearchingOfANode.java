import java.util.Scanner;

class Node{
	int info;
	Node link;
}
public class SearchingOfANodee {

	public static void search(Node start)
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter info to be searched");
		int a=sc.nextInt();
		Node ptr=start;
		while(ptr!=null)
		{
			if(ptr.info==a)
			{
				flag=1;
				break;
			}
			ptr=ptr.link;
		}
		if(flag==1)
			System.out.println("search successful");
		else
			System.out.println("unsuccessful");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		search(null);
	}

}
