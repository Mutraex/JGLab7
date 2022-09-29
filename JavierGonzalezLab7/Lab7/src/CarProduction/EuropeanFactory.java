package CarProduction;

public class EuropeanFactory implements CarFactory {

	public EuropeanFactory(){
		
	}
	public ToyotaCar createCar(String model, String pack) {
		ToyotaCar c=null;
		if(model.equalsIgnoreCase("Camry")&&pack.equalsIgnoreCase("Luxury")) {
			c= new EuroCamryLuxury();
		}
		else if(model.equalsIgnoreCase("Camry")&&pack.equalsIgnoreCase("Performance")) {
			c= new EuroCamryPerformance();
		}
		else if(model.equalsIgnoreCase("Corolla")&&pack.equalsIgnoreCase("Luxury")) {
			c= new EuroCorollaLuxury();
		}
		else if(model.equalsIgnoreCase("Corolla")&&pack.equalsIgnoreCase("Performance")) {
			c= new EuroCorollaPerformance();
		}
		return c;
	}

}
