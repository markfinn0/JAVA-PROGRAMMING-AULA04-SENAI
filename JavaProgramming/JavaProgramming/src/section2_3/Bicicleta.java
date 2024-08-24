package section2_3;

public abstract class Bicicleta {

	//Propriedas Genéricas
	private String codigo,tipoDeQuadro,tipoDeRoda;
	
	private int aro,quantMarchas;
	
	private double velocMédia;
	
	
	//Construtores
	public Bicicleta() {}


	public Bicicleta(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantMarchas,
			double velocMédia) {
		this.codigo = codigo;
		this.tipoDeQuadro = tipoDeQuadro;
		this.tipoDeRoda = tipoDeRoda;
		this.aro = aro;
		this.quantMarchas = quantMarchas;
		this.velocMédia = velocMédia;
	}

	
	
	//Comportamentos
	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTipoDeQuadro() {
		return tipoDeQuadro;
	}


	public void setTipoDeQuadro(String tipoDeQuadro) {
		this.tipoDeQuadro = tipoDeQuadro;
	}


	public String getTipoDeRoda() {
		return tipoDeRoda;
	}


	public void setTipoDeRoda(String tipoDeRoda) {
		this.tipoDeRoda = tipoDeRoda;
	}


	public int getAro() {
		return aro;
	}


	public void setAro(int aro) {
		this.aro = aro;
	}


	public int getQuantMarchas() {
		return quantMarchas;
	}


	public void setQuantMarchas(int quantMarchas) {
		this.quantMarchas = quantMarchas;
	}


	public double getVelocMédia() {
		return velocMédia;
	}


	public void setVelocMédia(double velocMédia) {
		this.velocMédia = velocMédia;
	}


	@Override
	public String toString() {
		return "Bicicleta [codigo=" + codigo + ", tipoDeQuadro=" + tipoDeQuadro + ", tipoDeRoda=" + tipoDeRoda
				+ ", aro=" + aro + ", quantMarchas=" + quantMarchas + ", velocMédia=" + velocMédia + "]";
	}
	
	
	
}
