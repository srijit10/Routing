import java.util.*;


class Edge{
	Node u;
	Node v;
    double length;
	int flag;
}

class Edge_add {
	
	ArrayList<Edge> EdgeList=new ArrayList<Edge>();
	
	void input(ArrayList<Node> NodeList) //take input of an ArrayList of Nodes and produce an EdgeList
	{
	   for(int i=0;i<NodeList.size();i++)
	   {
		   for(int j=0; j<NodeList.get(i).neighbour_list.size() ; j++)
		   {
			   Edge temp=new Edge(); //original edge
			   
			   temp.u=NodeList.get(i);
			   temp.v=NodeList.get(i).neighbour_list.get(j);
			   //calculate edge length
			   temp.length=Math.sqrt((temp.u.pos_x-temp.v.pos_x)*(temp.u.pos_x-temp.v.pos_x)+(temp.u.pos_y-temp.v.pos_y)*(temp.u.pos_y-temp.v.pos_y));
			   
			   //remove u from neighbour_list of v
			   NodeList.get(i).neighbour_list.get(j).neighbour_list.removeElement(NodeList.get(i)); 
			   
			   //Add edge to EdgeList
			   EdgeList.add(temp);
			   
			   
			  
		   }
	   }
	}
	
}
