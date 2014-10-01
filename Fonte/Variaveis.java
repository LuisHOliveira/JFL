class Variaveis{
	private String []v;
	
	public int declaraVariavel(String vet[],int posicao){
		this.v=vet;
		int i;
		double r;
		
		if(v[posicao]=="INTEIRO"){
			i=posicao;
			return posicao;
		}
		else{
			posicao++;
			
		}
		if(v[posicao]=="RACIONAL"){
			r=posicao;
			return posicao;
		}
		else{
			posicao++;
			
		}
		
		return posicao;
	
	}

	
}
