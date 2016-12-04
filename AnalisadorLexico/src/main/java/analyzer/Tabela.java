package analyzer;

import java.util.ArrayList;

public class Tabela {
	public static int var_index = 0, label_index = 0; 
	
	private static ArrayList<String> variable = new ArrayList<String>();
	private static ArrayList<String> value = new ArrayList<String>();
	private static int reserved = 1000;
	
	public static void addVariable(String var){
		Tabela.variable.add(var);
		Tabela.value.add("t"+(reserved--));
	}
	
	public static String getVariable(String var){
		return Tabela.value.get(Tabela.variable.indexOf(var));
	}
	
}
