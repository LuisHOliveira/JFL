class Variaveis{

	private String []nome;
	private int []y;
	private double []x;
	
	public String getNome(int pos){
			return this.nome[pos];
	}
	
	//public void setNome(String n,int pos){}
	
	public int getY(int pos){
			return this.y[pos];	
	}
	//public void setY();
	
	public double getX(int pos){
			return this.x[pos];
	}
	//public void setX();

	public int testaVariavel(String vet[],int posicao){
		
		this.nome=vet;
		int i;
		
		while(nome[posicao].equals("INTEIRO") || nome[posicao].equals("RACIONAL") 
		&& nome[posicao] != (" ")){
				posicao ++;
		} 
		//recebida a string,
		//verifica o tipo de variavel e se seu nome é valido
		
		for(i=0;i<nome[posicao].length();i++){
			
			if(Character.isLetter(nome[posicao].charAt(i))==true){
					System.out.println("caract valido para var");
						
				}else{
					System.out.println("variavel nao valida");	
					posicao=-1;
					
					break;
				}						
		}	
		return posicao;		
	}
	
	public void declaraVariavelInt(String []l,int posicao){
		
		
	} 	
}	
