package section2_3.instanceof_operator;
import section2_3.MountainBike;
import section2_3.RoadBike;
import section2_3.Bicicleta;
public class InstanceofTester {
	
	public static void main (String[]args) {
//		MountainBike mb1=new MountainBike();
//		RoadBike rb1=new RoadBike();
//		Bicicleta mb2=new MountainBike();
//		Bicicleta rb2=new RoadBike();
		
		Bicicleta[] bikes=new Bicicleta[5];
		bikes[0]=new MountainBike("MB001","Aço Carbono","Raios de Metal",20,18,30,"Soft");
		bikes[1]=new RoadBike("MB002","Slim Aço Carbono","Raios de Metal",20,18,30,"Plug-in");
		
		for (Bicicleta temp:bikes) {
			
			if(temp instanceof RoadBike) {
				System.out.println(temp);
				
			}
			
			System.out.println(temp);
		}
		
	}
	
	
}
