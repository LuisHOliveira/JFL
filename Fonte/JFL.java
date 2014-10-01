import java.util.Scanner;
import java.io.*;

class JFL{
	public static void main(String args[])throws Exception{
	
	File f;
	Scanner s;
	Interpretador j;
	
	String linhas[]= new String[4000];
	
	try{
	
		f=new File(args [0]);
		s=new Scanner(f);
		j=new Interpretador();
		int i=0;
	
	while(s.hasNext()){
		linhas[i]=s.nextLine();
		i++;
	
		}
		
		j.interpreta(linhas);
	} catch (IOException e) {
            System.out.println("Nao consegui ler o arquivo: " + (args.length > 0 ? args[0] : "(desconhecido)"));
            System.out.println("Uso:");
            System.out.println("    java JFL /caminho/para/arquivo.JFL");
        }

	}

}
