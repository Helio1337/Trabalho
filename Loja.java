package Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Loja {

	public File abrirArquivo(String local){
		
		File f = new File(local);
		
		return f; 
	}
	
	public List<String> lerLinhas(File f) throws IOException{
		List<String> lista = new ArrayList<String>();
		
		FileReader fr = new FileReader(f);
		
		BufferedReader reader = new BufferedReader(fr);
		
		String linha;
		
		while ((linha = reader.readLine())!=null) {
			lista.add(linha);
		}
		
		return lista;
		
	}
	
	public List<String> Estoque(Map<String,String> mapaloja,String nomeloja) throws IOException{
		
		File f = abrirArquivo(mapaloja.get(nomeloja));

		List<String> lista = lerLinhas(f);
	
		return lista;
	}

}