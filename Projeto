# Mini-Projeto

import java.util.Scanner;

public class Projeto {

    public static void main(String[] args) {
			
    	Scanner teclado = new Scanner(System.in);
    			
    	int opcao;
    	String nome = null;
    			
    	do{
    		System.out.println("================Menu================");
    		System.out.println("1 - Inserir nome no arquivo");
    		System.out.println("2 - Exibir todos os nomes do arquivo");
    		System.out.println("3 - Apagar todo arquivo");
    		System.out.println("0 - Para Sair");
    		System.out.println("====================================");
    		opcao = teclado.nextInt();
    				
    		switch(opcao) {
    			case 0: System.out.println("Programa Encerrado!");
    					break;
    			case 1: System.out.println("Escreva o nome que deseja Inserir:");
    					nome = teclado.next();
    					break;
    			case 2: 
    					break;
    			default: System.out.println("Opção Inválida");
    		}
    	} while (opcao != 0);
    	
    	//Inserir dados no txt
    	String arq = "teste.txt";
    	
    	if(arquivo.Write(arq, nome))
    		System.out.println("Arquivo salvo com sucesso!");
    	else
    		System.out.println("Erro ao salvar o arquivo!");
    	
    	//Exibir conteudo do txt
    	String Exibir = arquivo.Read(arq);
    	
        if(Exibir.isEmpty())
            System.out.println("Erro ao ler do arquivo!");
        else
            System.out.println("Conteudo do aquivo:\n"+nome);
    }
    
}
