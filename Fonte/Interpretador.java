
class Interpretador {
    
    private String linhas[];
    private String tokens []= new String[4000];
    private int i;
    private int j;
    private int pos=0;
    
     Variaveis []n= new Variaveis[4000];
     //Instancia um objeto Variavel
     
      
    public void interpreta(String l[]) {
		
		for(i=0;i<n.length;i++){
			n[i]= new Variaveis();
			}
	
		this.linhas = l;
		//recebe a string a ser interpretada
        
        for(i=0;i<this.linhas.length;i++){
			//Percorre linha por linha da string recebida
			
			if(this.linhas[i] != null){
				String tokens[]=linhas[i].split("[\\s\\.,]+");
				//separa a string linhas pela qnte de espaços 
				//em um novo vetor de strings
				
				for(j=0;j<tokens.length;j++){
					// Percorre as "novas" strings
					System.out.println(tokens[j]);
					
					if(tokens[j].equals("INTEIRO")){
						pos=n[j].testaVariavel(tokens,j);
						
						if(pos != -1){
							System.out.println("ok :)");
							n[j].declaraVariavelInt(tokens,pos);
						}
					} 
					
					if(tokens[j].equals("RACIONAL")){
						pos=n[j].testaVariavel(tokens,j);
						
						if(pos != -1){
							System.out.println("ok :)");
							n[j].declaraVariavelInt(tokens,pos);
						}
					}

					if(tokens[j].equals("+")){
						System.out.println("entrou, ok!soma");
						//this.linhas.soma();
					}
					if(tokens[j].equals("-")){
						System.out.println("entrou, ok!sub");
						//this.linhas.sub();
						
					}
					if(tokens[j].equals("*")){
						System.out.println("entrou, ok!mult");
						//this.linhas.multi();
						
					}
					if(tokens[j].equals("/")){
						System.out.println("entrou, ok!div");
						//this.linhas.div();	
						
					}
					if(tokens[j].equals("MS")){
						System.out.println("entrou, ok!MostraSaida");
						//this.linhas.mostraSaida();
					}
				}
			}
		}
	}
}

