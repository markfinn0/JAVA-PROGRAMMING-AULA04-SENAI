package section2_3;

public class RoadBike extends Bicicleta{
	
	//Propriedades especificas
	private String tipoDePedal;

	//Construtores
	
	public RoadBike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoadBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantMarchas,
			double velocMédia,String tipoDePeda) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantMarchas, velocMédia);
		this.tipoDePedal=tipoDePedal;
	}

	public String getTipoDePedal() {
		return tipoDePedal;
	}

	public void setTipoDePedal(String tipoDePedal) {
		this.tipoDePedal = tipoDePedal;
	}

	@Override
	public String toString() {
		return "RoadBike [tipoDePedal=" + tipoDePedal + ", getCodigo()=" + getCodigo() + ", getTipoDeQuadro()="
				+ getTipoDeQuadro() + ", getTipoDeRoda()=" + getTipoDeRoda() + ", getAro()=" + getAro()
				+ ", getQuantMarchas()=" + getQuantMarchas() + ", getVelocMédia()=" + getVelocMédia() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
	
	
}
