
class Interpretador {
    
    private String linhas[];
    private String tokens []= new String[40000];
    private int i;
    private int j;
    
     Variaveis n=new Variaveis();
      
    public String[] getLinhas(){
		return this.linhas;
		}
		
    public void interpreta(String l[]) {
		this.linhas = l;
        
        for(i=0;i<this.linhas.length;i++){
			
			if(this.linhas[i] != null){
				String tokens[]=linhas[i].split("[\\s\\.,]+");
				
				for(j=0;j<tokens.length;j++){
					System.out.println(tokens[j]);
					
					if(tokens[j].equals("INTEIRO")){
						n.declaraVariavel(tokens,j);
					}
					
					if(tokens[j].equals("RACIONAL")){
						System.out.println("entrou, ok!");
						//this.linhas.declaraVariavel(linhas,j);
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

