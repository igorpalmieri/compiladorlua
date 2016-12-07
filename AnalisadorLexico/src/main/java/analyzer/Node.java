package analyzer;

public class Node {
    Node[] list;
    LUAToken token;
    String type;
    private String code;
    String result;
    
    public Node(String type, Node[] list){
    	this.type = type;
    	this.list = list;
    	this.code = "";
    }
    
    public Node(String type, Node only){
    	Node[] k = {only};
    	this.type = type;
    	this.list = k;
    	this.code = "";
    }
    
    public Node(String type, Node[] list, String code){
    	this.type = type;
    	this.list = list;
    	this.code = code;
    }
    public Node(String type, Node[] list, String code, String result){
    	this.type = type;
    	this.list = list;
    	this.code = code;
    	this.result = result;
    }
    
    public Node(String type, Node only, String code){
    	Node[] k = {only};
    	this.type = type;
    	this.list = k;
    	this.code = code;
    }
    public Node(String type, Node only, String code, String result){
    	Node[] k = {only};
    	this.type = type;
    	this.list = k;
    	this.code = code;
    	this.result = result;
    }
    
    public Node(LUAToken token){
    	this.token = token;
    	this.type = "Terminal";   	
    	String temp = SymTable.getTempVar();
    	//System.out.println(token.value + " " + temp);
    	this.code = temp + " := " + token.value + "\n";
    	this.result = temp;
    }
    public Node(LUAToken token, String result){
    	this.token = token;
    	this.type = "Terminal";
    	this.code = result;
    	this.result = result;
    }
    public String print(){
    	String total = "";
    	for(String s : code.split("\\{")){
    		if(total != ""){ 
    			int index = Integer.parseInt(String.valueOf(s.toCharArray()[0]));
    			total += list[index].print() + s.substring(2);
    		}   	
    		else
    			total += s;    		
    	}
    	return total;
    }
}


