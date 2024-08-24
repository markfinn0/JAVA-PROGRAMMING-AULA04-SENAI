package section2_3.instanceof_operator.downcasting_upcasting;

import section2_3.MountainBike;
import section2_3.Bicicleta;

public class UpDownTester {
	
	public static void main (String[]args) {
		//forma de fazer um casting...
		Bicicleta mb=(Bicicleta) new MountainBike("MB001","Aço Carbono","Raios de Metal",20,18,30,"Soft");
		System.out.println(mb);
		System.out.println(((MountainBike)mb).getTipoDeAmortecedor());
		
	
	
	}
	
}
