package analyzer;

import java.io.FileReader;
import java.nio.file.Paths;

public class Compilador {

	public static void main(String[] args) throws Exception{
		String sourceCode = Paths.get("").toAbsolutePath()+"/src/main/java/analyzer/example.lua";

		AnalisadorLexico al = new AnalisadorLexico(new FileReader(sourceCode));		
		AnalisadorSintatico as = new AnalisadorSintatico(al);
		
		Node root = (Node) as.parse().value;
		
		//printTree(root,"");
		
		System.out.println(root.print());
	}
	
	public static void printTree(Node n,String k){
		if(n.type == "Terminal")
			System.out.println(k+" "+n.token.value);	
		else
			System.out.println(k+" "+n.type);
		if(n.list != null){
			if(n.list.length > 1)
				k = k + "-";
			for(Node no : n.list)
					printTree(no,k);
		}
			
	}
}
