package Main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Produtos {
	 
	public void Mostrar(List<String> produto){								//Feito!
		System.out.println("Loja :");
		for(String linha : produto){
			System.out.println(linha);
		}
	}
	
	public String CalcularMedia(List<String> produto){
		String[] numero = null;
		double soma=0;
		
		for(String linha : produto){
			numero=linha.split("=>");
			soma+=Double.parseDouble(numero[1]);
		} 
		Double media= soma/produto.size();
		return numero[0].concat("=>"+media);
	}
	
	public String Melhor(Map<String,String> mapaloja) throws IOException{
		Loja l = new Loja();
		List<String> lojas = new ArrayList<String>();
		for(String i : mapaloja.keySet()){
		    lojas.add(CalcularMedia(l.Estoque(mapaloja, i)));
		    Collections.sort(lojas);
		}
		String nomes=lojas.get(0);
		String[] nome=nomes.split("=>");
		return nome[0];
	}

		

}
