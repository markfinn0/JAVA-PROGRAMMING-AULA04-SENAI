package section2_3;

public class MountainBike extends Bicicleta{
	
	//propriedades especificas
	private String tipoDeAmortecedor;
	
	//Construtores
	public MountainBike() {}

	public MountainBike(String codigo, String tipoDeQuadro, String tipoDeRoda, int aro, int quantMarchas,
			double velocMédia,String tipoDeAmortecedor) {
		super(codigo, tipoDeQuadro, tipoDeRoda, aro, quantMarchas, velocMédia);
		this.tipoDeAmortecedor=tipoDeAmortecedor;
	}

	
	//Comportamentos
	public String getTipoDeAmortecedor() {
		return tipoDeAmortecedor;
	}

	public void setTipoDeAmortecedor(String tipoDeAmortecedor) {
		this.tipoDeAmortecedor = tipoDeAmortecedor;
	}

	@Override
	public String toString() {
		return "MountainBike [tipoDeAmortecedor=" + tipoDeAmortecedor + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
