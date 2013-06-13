package Main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	public void main(String[] args){
		Scanner leitao = new Scanner(System.in);
		Map<String,String> mapaloja= new HashMap<String,String>();
		boolean res = true;
		String nome,local;
		
		do{
			System.out.println("Informe o Nome da Loja: ");
			nome=leitao.next();
			System.out.println("Informe o Local da Loja: ");
			local=leitao.next();
			
			mapaloja.put(nome, local);
			System.out.println("Deseja Continuar ? (true/false)");
			res = leitao.nextBoolean();
			
		}while(res);
	}
}
