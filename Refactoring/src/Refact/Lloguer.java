package Refact;

import java.util.Date;

public class Lloguer {
	private Date data;
	private int dies;
	private Vehicle vehicle;
	
	public Lloguer(Date data, int dies, Vehicle vehicle) {
		this.data = data;
		this.dies = dies;
		setVehicle(vehicle);
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public int getDies() {
		return dies;
	}
	public void setDies(int dies) {
		this.dies = dies;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public double aPagar() {
		double aPagar = 0;
        switch (vehicle.getCategoria()) {
            case Vehicle.BASIC:
                aPagar += 3;
                if (dies > 3) {
                    aPagar += (dies - 3) * 1.5;
                }
                break;
            case Vehicle.GENERAL:
                aPagar += 4;
                if (dies > 2) {
                    aPagar += (dies - 2) * 2.5;
                }
                break;
            case Vehicle.LUXE:
                aPagar += dies * 6;
                break;
        }
		return aPagar;
	}
	public int bonificacions() {
    	int bonificacions = 0;
	        bonificacions ++;
	        if (vehicle.getCategoria() == Vehicle.LUXE &&
	                dies>1 ) {
	            bonificacions ++;
	        }  
    	return bonificacions;
    }

}
