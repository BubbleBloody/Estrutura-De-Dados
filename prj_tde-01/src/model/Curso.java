package model;

public class Curso {
	
	public Curso(String nome, int codigo) throws ModelException{
		this.setNome(nome);
		this.setCodigo(codigo);
	}
	
	//
	//Atributos
	//
	private String nome;
	private int codigo;
	
	//
	//Métodos Mutantes
	//
	public String getnome() {
		return nome;
	}
	public int getCodigo() {
		return codigo;
	}
	
	public void setNome(String nome) throws ModelException{
		Curso.validarNome(nome);
		this.nome = nome;
	}
	public void setCodigo(int codigo) throws ModelException{
		Curso.validarCodigo(codigo);
		this.codigo = codigo;
	}
	
	//
	//Métodos
	//
	@Override
	public String toString() {
		return "[Curso: " + this.getnome() + ", Código: " + this.getCodigo() + "]";
	}
	
	public static void validarNome(String nome) throws ModelException{
		if(nome == null || nome.length() == 0)
			throw new ModelException("Erro: O nome do curso não pode ser nulo.");
	}
	public static void validarCodigo(int codigo) throws ModelException{
		if(codigo <= 0) {
			throw new ModelException("Erro: O código do curso deve ser maior ou igual à 0");
		}
	}
}