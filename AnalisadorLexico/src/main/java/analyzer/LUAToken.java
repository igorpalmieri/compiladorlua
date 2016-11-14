package analyzer;

public class LUAToken {

	public String value;
	public int type;
	public int start;

	    public LUAToken(int type, String value, int start) {
	        this.type = type;
	        this.value = value;
	        this.start = start;
	    }
	    
	    public LUAToken(String value, int start){
	    	this.value = value;
	    	this.start = start;
	    }

}
