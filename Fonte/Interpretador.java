
class Interpretador {
    
    private String linhas[];
    private String tokens []= new String[40000];
    private int i;
    private int j;
    
     Variaveis n=new Variaveis();
      
    public void interpreta(String l[]) {
		this.linhas = l;
        
        for(i=0;i<this.linhas.length;i++){
			
			if(this.linhas[i] != null){
				String tokens[]=linhas[i].split(" ");
				
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
					if(this.linhas[j]=="*"){
						//this.linhas.multi();
						
					}
					if(this.linhas[j]=="/"){
						//this.linhas.div();	
						
					}
					if(this.linhas[j]=="MS"){
						//this.linhas.mostraSaida();
					}
				}
			}
		}
	}
}

