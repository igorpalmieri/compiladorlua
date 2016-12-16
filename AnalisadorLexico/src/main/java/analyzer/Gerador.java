package analyzer;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Gerador {
	
	public static void main(String[] args) throws FileNotFoundException{
		File f = new File(Paths.get("").toAbsolutePath()+"/src/main/java/analyzer/lua_scanner.flex");
		jflex.Main.generate(f);
		
		String[] s = {"-parser","AnalisadorSintatico","-expect","5",Paths.get("").toAbsolutePath()+"/src/main/java/analyzer/lua_parser4.cup"};
		try {
			java_cup.Main.main(s);
			moverArch("AnalisadorSintatico.java");
			moverArch("sym.java");
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Compilador.main(null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static boolean moverArch(String archNombre) {
        boolean efectuado = false;
        File arch = new File(archNombre);
        if (arch.exists()) {
            System.out.println("\n*** Movendo " + arch + " \n***");
            Path currentRelativePath = Paths.get("");
            String nuevoDir = currentRelativePath.toAbsolutePath().toString()
                    + File.separator + "src//main//java" + File.separator
                    + "analyzer" + File.separator + arch.getName();
            File archViejo = new File(nuevoDir);
            archViejo.delete();
            if (arch.renameTo(new File(nuevoDir))) {
                System.out.println("\n*** Gerado " + archNombre + "***\n");
                efectuado = true;
            } else {
                System.out.println("\n*** Erro " + archNombre + " ***\n");
            }

        } else {
            System.out.println("\n*** Codigo nao existente ***\n");
        }
        return efectuado;
    }

	
}
