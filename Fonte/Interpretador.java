
class Interpretador {
    
    private String linhas[];
    private String tokens []= new String[1000];
    private int i;
    private int j;
    
    Variaveis n=new Variaveis();
    
    
    public void interpreta(String l[]) {
        this.linhas = l;
        
        for(i=0;i<this.linhas.length;i++){
			
			String tokens[]=linhas[i].split(" ");
			
			if(this.tokens[i] != null){
					if(this.tokens[i]=="INTEIRO"){
						
						System.out.println("entrou, ok!");
					//	n.declaraVariavel(linhas,j);
					}
					if(this.linhas[j]=="RACIONAL"){
						//this.linhas.declaraVariavel(linhas,j);
					}
					if(this.linhas[j]=="+"){
//						this.linhas.soma();
					}
					if(this.linhas[j]=="-"){
	//					this.linhas.sub();
						
					}
					if(this.linhas[j]=="*"){
					//	this.linhas.multi();
						
					}
					if(this.linhas[j]=="/"){
				 //		this.linhas.div();	
						
					}
					if(this.linhas[j]=="MS"){
				//		this.linhas.mostraSaida();
					}

				}
			
			}
		}
	}
