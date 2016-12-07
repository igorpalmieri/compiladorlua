package analyzer;

import java.util.ArrayList;

public class SymTable {
	private static int i_var = 0, i_label = 0; 
	
	private static ArrayList<String> variable = new ArrayList<String>();
	private static ArrayList<String> value = new ArrayList<String>();
	private static int reserved = 1000;
	
	private static void addVar(String var){
		SymTable.variable.add(var);
		SymTable.value.add("$"+(reserved--));
	}
	
	public static String getVar(String var){
		if(SymTable.variable.indexOf(var) == -1)
			SymTable.addVar(var);
		return SymTable.value.get(SymTable.variable.indexOf(var));
	}
	
	public static String getTempVar(){
		return "t"+(i_var++);
	}
	
	public static String getLabel(){
		return "L"+(i_label++);
	}
	
}
