package EstruturaDeDados;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EstruturaPilha {

	public static void main(String[] args) {
		
		int op;
		Stack<String> livro = new Stack<String>();
		
		Scanner leia = new Scanner(System.in);
		
		
		do {

			System.out.println("\n\t\tOpções");
			System.out.println("\n--------------------------------------------------------");
			System.out.println("\n(1) Adicionar livros a pilha");
			System.out.println("\n(2) Listar todos os livros");
			System.out.println("\n(3) Retirar livros da pilha");
			System.out.println("\n(0) Sair");
			System.out.println("\n--------------------------------------------------------");
			System.err.println("\nDigite uma opção: ");
			op = leia.nextInt();

			switch (op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o nome do livro: ");
				String livros = leia.nextLine();
				if(livros.isEmpty()) {
					System.out.println("\nO nome do livro não foi adicionado\n");
				}else {
					livro.add(livros);
					System.out.println("\nO livro foi adicionado");
					}
				break;

			case 2:
				leia.nextLine();
				System.out.println("\nListar todos os livros: ");
				System.out.println(livro);
				
				break;

			case 3:
				if (livro.isEmpty() == true) {
				System.out.println("\nA pilha esta vazia ");
					break;
				}else {
					System.out.printf("Um livro foi retirado da pilha: %s\n",livro.pop());
					System.out.println("\nsobrou na pilha: \n");
					for(Iterator<String> it = livro.iterator();it.hasNext();) {
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
