package analyzer;

public class Node {
    Node[] list;
    LUAToken token;
    String type;
    
    public Node(String type, Node[] list){
    	this.type = type;
    	this.list = list;
    }
    
    public Node(String type, Node only){
    	Node[] k = {only};
    	this.type = type;
    	this.list = k;
    }
    
    public Node(LUAToken token){
    	this.token = token;
    	this.type = "Terminal";
    }
}


