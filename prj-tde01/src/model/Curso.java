package model;

public class Curso {
	
	public Curso(int codigo, String nome) {
		this.setCodigo(codigo);
		this.setNome(nome);
	}
	
	//
	//Atributos
	//
	private int codigo;
	private String nome;
	
	//
	//Encapsulamento
	//
	public int getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Curso [Código = " + codigo + " Nome = " + nome + "]";
	}
	
}