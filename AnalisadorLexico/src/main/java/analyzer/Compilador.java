package analyzer;

import java.io.FileReader;
import java.nio.file.Paths;

import java_cup.runtime.Symbol;

public class Compilador {

	public static void main(String[] args) throws Exception{
		String sourceCode = Paths.get("").toAbsolutePath()+"/src/main/java/analyzer/example.lua";

		AnalisadorLexico al = new AnalisadorLexico(new FileReader(sourceCode));
/*		Symbol s;
		while((s = al.next_token()).sym != sym.EOF){
			System.out.println(((LUAToken)s.value).value + " " + ((LUAToken)s.value).type);
		}*/
		
		AnalisadorSintatico as = new AnalisadorSintatico(al);
		
		Node root = (Node) as.parse().value;
		
		printTree(root,"");
	}
	
	public static void printTree(Node n,String k){
		if(n.type == "Terminal")
			System.out.println(k+" "+n.token.value);
		else
			System.out.println(k+" "+n.type);
		k = k + "-";
		if(n.list != null)
			for(Node no : n.list)				
				printTree(no,k);
	}
}
