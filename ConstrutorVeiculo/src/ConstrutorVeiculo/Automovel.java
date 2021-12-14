package ConstrutorVeiculo;

public class Automovel {
	
	 private int velocidade; //encapsulamento
	 private float litragem;
	 private String frenagem;
	 private String tipoCombustivel;
	 
	 
	 
	 
	/**
	 * @param velocidade
	 * @param litragem
	 * @param frenagem
	 * @param tipoCombustivel
	 */
	
	 // usando construtor
	 
		
		  public Automovel(int velocidade, float litragem, String frenagem, String
		  tipoCombustivel) { super(); this.velocidade = velocidade; this.litragem =
		  litragem; this.frenagem = frenagem; this.tipoCombustivel = tipoCombustivel; }
		 
	
	public void listarDados() {
		System.out.println("Velocidade...: "+this.velocidade + "Km/h");
		System.out.println("Litragem...: "+this.litragem+ "1ts");
		System.out.println("Frenagem...: "+this.frenagem);
		System.out.println("Tipo Combustivel...: "+this.tipoCombustivel);
		

	}
	
	public float ajustarVelocidade(){
		
		float velocAjustada = this.velocidade *1.10f;
		return velocAjustada;
	}
	

	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public float getLitragem() {
		return litragem;
	}
	public void setLitragem(float litragem) {
		this.litragem = litragem;
	}
	public String getFrenagem() {
		return frenagem;
	}
	public void setFrenagem(String frenagem) {
		this.frenagem = frenagem;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	 
	 
	 

}
