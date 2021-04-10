package teste_kryptos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		
		int x;
		String funcao = "";
		
		while (!funcao.equals("exit")) {
			
			System.out.println();
			funcao = sc.nextLine();
			String[] digitado = funcao.split(" ");
			funcao = digitado[0];
			
			
				
				if (funcao.equals("put")) {
					x = (int)Integer.parseInt(digitado[1]);
					numeros.add(x);
					
					for (int i = 0; i < numeros.size(); i++) {
						System.out.print(numeros.get(i) + " ");
					}
					
				}

						
			if (funcao.equals("get")) {
				x = (int)Integer.parseInt(digitado[1]);
				System.out.print(numeros.get(x - 1));
				
			}
			
			if (funcao.equals("first")) {
				System.out.print(numeros.get(0));
				
			}
			
			if (funcao.equals("last")) {
				System.out.print(numeros.get(numeros.size() - 1));				
			}
			
			if (funcao.equals("remove")) {
				x = (int)Integer.parseInt(digitado[1]);
				System.out.println(numeros.get(x - 1));
				numeros.remove(x);
				
				for (int i = 0; i < numeros.size(); i++) {
					System.out.print(numeros.get(i) + " ");
				}
			}
			
			if (funcao.equals("clear")) {
				numeros.clear();
			}
			
			if (funcao.equals("list")) {
				for (int i = 0; i < numeros.size(); i++) {
					System.out.print(numeros.get(i) + " ");
				}
			}
			
			
		}

	}

}
