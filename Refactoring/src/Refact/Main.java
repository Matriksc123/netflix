package Refact;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
		Vehicle vehicle1 = new Vehicle("Tata", "Vista", Vehicle.BASIC);
		Date date = dateFormat.parse("2/8/2013");
		Lloguer lloguer1 = new Lloguer(date, 2, vehicle1);
		Vehicle vehicle2 = new Vehicle("Citroen", "Saxo", Vehicle.GENERAL);
		date = dateFormat.parse("5/10/2015");
		Lloguer lloguer2 = new Lloguer(date, 5, vehicle2);
		Vehicle vehicle3 = new Vehicle("Tesla", "Roaster", Vehicle.LUXE);
		date = dateFormat.parse("4/12/2018");
		Lloguer lloguer3 = new Lloguer(date, 5, vehicle3);
		
		Client miCliente = new Client("49334588T","Joso","633967201");
		miCliente.afegeix(lloguer1);
		miCliente.afegeix(lloguer2);
		miCliente.afegeix(lloguer3);

		System.out.println(GestorLloguersLite(miCliente));

	}
	public static String GestorLloguersLite(Client client) {
        return client.informe();
	}

}
