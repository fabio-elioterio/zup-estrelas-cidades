package br.com.zup.estrelas.cidades.pojo;


public class Cidade {
	private String nome;
	private int cep;
	private int nro_habitantes;
	private boolean capital;
	private String estado;
	private double renda_per_capita;
	private String data_fundacao;
	
	
	
	
	public Cidade() {
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getNro_habitantes() {
		return nro_habitantes;
	}
	public void setNro_habitantes(int nro_habitantes) {
		this.nro_habitantes = nro_habitantes;
	}
	public boolean isCapital() {
		return capital;
	}
	public void setCapital(boolean capital) {
		this.capital = capital;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getRenda_per_capita() {
		return renda_per_capita;
	}
	public void setRenda_per_capita(double renda_per_capita) {
		this.renda_per_capita = renda_per_capita;
	}
	public String getData_fundacao() {
		return data_fundacao;
	}
	public void setData_fundacao(String data_fundacao) {
		this.data_fundacao = data_fundacao;
	}
	
}
