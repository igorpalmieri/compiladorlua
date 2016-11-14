package analyzer;

public class Node {
    public String value;
    public int type;
    Node left, right;
    
    public Node(String value, int type, Node left, Node right){
    	this.value = value;
    	this.type = type;
    	this.left = left;
    	this.right = right;
    }
    public Node(String value, int type){
    	this.value = value;
    	this.type = type;
    }
}


