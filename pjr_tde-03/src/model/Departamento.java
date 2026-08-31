package model;

public class Departamento {
	
	public Departamento(String sigla, String nome) throws ModelException{
		this.setSigla(sigla);
		this.setNome(nome);
	}

	//
	//Atributos
	//
	private String sigla, nome;
	
	//
	//Métodos Mutantes
	//
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	
	public void setSigla(String sigla) throws ModelException{
		Departamento.validarSigla(sigla);
		this.sigla = sigla;
	}
	public void setNome(String nome) throws ModelException{
		Departamento.validarNome(nome);
		this.nome = nome;
	}
	
	public static void validarSigla(String sigla) throws ModelException{
		if(sigla.length() != 2)
			throw new ModelException("\nSigla Inválida: A sigla precisa ter 2 caracteres.\nSua sigla possuí: " + sigla.length() + " caracteres.");
		
		for(int i = 0; i < sigla.length(); i++) {
			char c = sigla.charAt(i);
			
			if(Character.isLowerCase(c))
				throw new ModelException("\nSigla Inválida: Todos os caracteres precisam ser em maiúsculos.");
		}
	}
	
	public static void validarNome(String nome) throws ModelException{
		if(nome.length() < 5 || nome.length() > 30)
			throw new ModelException("\nNome Inválido: O nome precisar ter de 5 a 30 caracteres.\n" + "Seu nome possui " + nome.length() + " caracteres.");
		
		for(int i = 0; i < nome.length(); i++) {
			char c = nome.charAt(i);
			
			if(!Character.isAlphabetic(c) && !Character.isSpaceChar(c))
				throw new ModelException("\nNome Inválido: Há um caracter inválido: '" + c + "' na posição: " + i);
		}
	}
	
	//
	//Métodos
	//
	@Override
	public String toString() {
		return "Departamento [sigla = " + sigla + ", nome = " + nome + "]";
	}
	
}