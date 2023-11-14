package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaFila {

	public static void main(String[] args) {
		
		int op;
		Queue<String> fila = new LinkedList<String>();
		
		Scanner leia = new Scanner(System.in);
		
		
		do {

			System.out.println("\n\t\tOpções");
			System.out.println("\n--------------------------------------------------------");
			System.out.println("\n(1) Adicionar cliente na fila");
			System.out.println("\n(2) Listar todos os clientes na fila");
			System.out.println("\n(3) Retirar cliente da fila");
			System.out.println("\n(0) Sair");
			System.out.println("\n--------------------------------------------------------");
			System.err.println("\nDigite uma opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o seu nome: ");
				String cliente = leia.nextLine();
				if(cliente.isEmpty()) {
					System.out.println("\nO nome do cliente não foi adicionado\n");
				}else {
					fila.add(cliente);
					System.out.println("\nCliente foi adicionado na fila\n");
					}
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nListar todos os clientes: ");
				System.out.println(fila);
				break;

			case 3:
				if (fila.isEmpty()) {
				System.out.println("\nA fila esta vazia ");
				break;
				}else {
					System.out.printf("\nO (a) cliente %s foi chamado(a)!",fila.poll());
					System.out.println("\nFila: \n");
					
					for(Iterator<String> it = fila.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
				
				
				
				}
				
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			default:
				System.out.println("\nOpcão invalida");
				
			}
		} while (op != 0);
		
		
		
	}
}
