import java.util.*;
public class Init_nodes{

	int node_count;
	Init_nodes(){
		Node n1=new Node();
		n1.pos_x=0;
		n1.pos_y=0;
		n1.Energy=50;
		
		
	}
public static void main(String[] args)
{
	Node newnode=new Node();
	newnode.pos_x=0;
	newnode.pos_y=0;
	
	Node nb1=new Node();
	nb1.pos_x=2;
	nb1.pos_y=1;
	
	newnode.neighbour_list.add(nb1);
	System.out.println(newnode.neighbour_list.get(0).pos_x);
	
}

}
