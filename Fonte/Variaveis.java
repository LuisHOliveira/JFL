class Variaveis{
	private String []nome;
	private int y;
	
	public void testaVariavel(String vet[],int posicao){
		
		this.nome=vet;
		int i;
		double []r;
		int []x;
		
		while(nome[posicao].equals("INTEIRO") && nome[posicao] != (" ")){
				posicao ++;
		}
		
		for(i=0;i<nome[posicao].length();i++){
				
				if(Character.isLetter(nome[posicao].charAt(i))==true){
					System.out.println("variavel valida");
				}
				else{
					System.out.println("variavel nao valida");	
					
				}
			
		}
		
		
			
		}
		
	}
