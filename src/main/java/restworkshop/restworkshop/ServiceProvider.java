package restworkshop.restworkshop;

public class ServiceProvider {
	private static PersoonService persoonservice = new PersoonService();

	public static PersoonService getPersoonService() {
		return persoonservice;
	}
}