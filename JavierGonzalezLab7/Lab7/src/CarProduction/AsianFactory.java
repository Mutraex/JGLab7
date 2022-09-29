package CarProduction;

public class AsianFactory implements CarFactory {

	public AsianFactory(){
		
	}
	public ToyotaCar createCar(String model, String pack) {
		ToyotaCar c=null;
		if(model.equalsIgnoreCase("Camry")&&pack.equalsIgnoreCase("Luxury")) {
			c= new AsiaCamryLuxury();
		}
		else if(model.equalsIgnoreCase("Camry")&&pack.equalsIgnoreCase("Performance")) {
			c= new AsiaCamryPerformance();
		}
		else if(model.equalsIgnoreCase("Corolla")&&pack.equalsIgnoreCase("Luxury")) {
			c= new AsiaCorollaLuxury();
		}
		else if(model.equalsIgnoreCase("Corolla")&&pack.equalsIgnoreCase("Performance")) {
			c= new AsiaCorollaPerformance();
		}
		return c;
	}

}
