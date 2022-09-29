import CarProduction.*;
import java.util.*;
public class TestCars {

	public static void main(String[] args) {
		//ToyotaCar c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
		CarFactory NAf,Ef,Af;
		List<ToyotaCar> cList = new ArrayList<ToyotaCar>();
		NAf=new NorthAmericanFactory();
		Ef=new EuropeanFactory();
		Af=new AsianFactory();
		
		cList.add(NAf.createCar("Camry","Luxury"));
		cList.add(NAf.createCar("Camry","Performance"));
		cList.add(NAf.createCar("Corolla","Luxury"));
		cList.add(NAf.createCar("Corolla","Performance"));
		
		cList.add(Ef.createCar("Camry","Luxury"));
		cList.add(Ef.createCar("Camry","Performance"));
		cList.add(Ef.createCar("Corolla","Luxury"));
		cList.add(Ef.createCar("Corolla","Performance"));
		
		cList.add(Af.createCar("Camry","Luxury"));
		cList.add(Af.createCar("Camry","Performance"));
		cList.add(Af.createCar("Corolla","Luxury"));
		cList.add(Af.createCar("Corolla","Performance"));
		
		for(int i=0; i<cList.size();i++) {
			cList.get(i).features();
		}

	}

}
