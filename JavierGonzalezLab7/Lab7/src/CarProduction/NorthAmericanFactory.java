package CarProduction;

public class NorthAmericanFactory implements CarFactory {

	public NorthAmericanFactory(){
		
	}
	public ToyotaCar createCar(String model, String pack) {
		ToyotaCar c=null;
		if(model.equalsIgnoreCase("Camry")&&pack.equalsIgnoreCase("Luxury")) {
			c= new NACamryLuxury();
		}
		else if(model.equalsIgnoreCase("Camry")&&pack.equalsIgnoreCase("Performance")) {
			c= new NACamryPerformance();
		}
		else if(model.equalsIgnoreCase("Corolla")&&pack.equalsIgnoreCase("Luxury")) {
			c= new NACorollaLuxury();
		}
		else if(model.equalsIgnoreCase("Corolla")&&pack.equalsIgnoreCase("Performance")) {
			c= new NACorollaPerformance();
		}
		return c;
	}

}
