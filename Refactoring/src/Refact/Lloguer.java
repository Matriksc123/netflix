package Refact;

import java.util.ArrayList;
import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	private ArrayList<Vehicle> vehiculos = new ArrayList<Vehicle>();
	
	public Lloguer(Date data, int dies, ArrayList<Vehicle> vehiculos) {
		this.data = data;
		this.dies = dies;
		this.vehiculos = vehiculos;
	}
	public Lloguer(Date data, int dies, Vehicle vehicleBasic) {
		this.data = data;
		this.dies = dies;
		this.vehiculos.add(vehicleBasic);
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
