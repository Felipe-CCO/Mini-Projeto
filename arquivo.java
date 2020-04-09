import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class arquivo {
	
	public static String Read(String Caminho){
		
		//Inserir Conteudo 
	        String conteudo = "";
	        
	        try {
	            FileReader arq = new FileReader(Caminho);
	            BufferedReader lerArq = new BufferedReader(arq);
	            String linha="";
	            
	            try {
	                linha = lerArq.readLine();
	                while(linha!=null){
	                    conteudo += linha+"\n";
	                    linha = lerArq.readLine();
	                }
	                arq.close();
	                return conteudo;
	                
	            } catch (IOException ex) {
	                System.out.println("Erro: Não foi possível ler o arquivo!");
	                return "Erro";
	            }
	        } catch (FileNotFoundException ex) {
	            System.out.println("Erro: Arquivo não encontrado!");
	            return "Erro";
	        }
	    }
	
	//Exibir Conteudo
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public static String File (String apagar) {
    	File arq = new File(apagar);
		if(arq.delete()) 
	System.out.println("Arquivo Deletado Com sucesso\n");
		return apagar;
    }
}
