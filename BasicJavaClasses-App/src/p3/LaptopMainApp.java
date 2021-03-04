package p3;

public class LaptopMainApp {

	public static void main(String[] args) {
		
		Laptop hp = new Laptop();
		hp.setBrand("HP");
		hp.setCost(454545);
		hp.setHdd(2);
		hp.setRam(16);
		
		System.out.println(" RAM "+hp.getRam());
		System.out.println(" RAM "+hp.getBrand());
		System.out.println(" RAM "+hp.getHdd());
		System.out.println(" RAM "+hp.getCost());
		
		
		hp.setRam(8);

		System.out.println(" RAM "+hp.getRam());
		
		
		
		
		
		
	}

}
