package analyzer;

import java.io.FileReader;

public class Compilador {

	public static void main(String[] args) throws Exception{
		String sourceCode = "C:/Users/Igor-Surface/workspace/AnalisadorLexico/src/main/java/analyzer/example.lua";

		AnalisadorLexico al = new AnalisadorLexico(new FileReader(sourceCode));
		AnalisadorSintatico as = new AnalisadorSintatico(al);
		
		Node root = (Node) as.parse().value;
		System.out.println(root.value);
	}
}
