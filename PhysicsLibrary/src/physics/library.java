package physics;

import java.util.Scanner;

public class library {
	

	/**
	 * 
	 * @param fahrenheit en variabel
	 * tar in fahrenheit i formeln och ber�knar tempuraturen
	 * @return returnerar v�rdet i celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) / 1.8;
		return celsius;
	}
	/**
	 * 
	 * @param kelvin en variabel
	 * tar in kelvin i formeln och ber�knar tempuraturen
	 * @return returnerar v�rdet i celsius
	 */
	public static double kelvinToCelsius(double kelvin) {
		double celsius = kelvin - 273.15;
		return celsius;
	}
	/**
	 * 
	 * @param fluid en v�tska
	 * @param deep djupet i meter
	 * tar in v�tskan och djupet i formeln och ber�knar trycket
	 * @return returnerar trycket 
	 */
	public static double fluidPressure(Fluid_table fluid, double deep) {
		double p = 0;
		p = fluid.density * deep * 9.82;
		return p;
	}
	/**
	 * 
	 * @param deep djupet i meter
	 * tar in djupet i formeln och ber�knar trycket
	 * @return returnerar trycket i vatten
	 */
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = 998 * 9.82 * deep;
		return pressureUnderWater;
	}
	/**
	 * 
	 * @param mass massa i kg
	 * @param velocity hastighet i m/s
	 * ber�knar r�relseenergin med massan och hastigheten
	 * @return returnerar r�relseenergin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = mass * velocity;
		return kineticEnergy;
	}
	/**
	 * 
	 * @param height h�jd i meter
	 * roten ur 
	 * @return returnerar hastigheten fr�n fallet
	 */
	public static double fallspeed(double height) {
		double fallspeed = 2 * 9.82 * height ;
		return fallspeed;
	}
	/**
	 * 
	 * @param first f�rsta variabeln
	 * @param last sista variabeln
	 * ber�knar skillnaden mellan variablarna
	 * @return returnerar resultatet
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		return delta;
	}
	/**
	 * 
	 * @param fluid en v�tska
	 * @param volume 
	 * @return returnerar massan
	 */
	public static double volumeToMass(Fluid_table fluid, double volume) {
		double m = 0;
		m = fluid.density;
		return m;
	}
	/**
	 * 
	 * @param gas ett gas
	 * @param volume
	 * @return returnerar massan
	 */
    public static double volumeToMass2(GasTable gas, double volume) {
    	double m = 0;
    	m = gas.density;
    	return m;
	}
    /**
     * 
     * @param solid ett fast �mne
     * @param volume
     * @return returnerar massan
     */
    public static double volumeToMass3(SolidTable solid, double volume) {
		double m = 0;
		m = volume * solid.density;
		return m;
	}
    /**
     * 
     * @param distance str�cka i meter
     * @param time tid i sekunder
     * ber�knar medelhastigheten
     * @return returnerar medelhastigheten
     */
    public static double svtVelocity(double distance, double time) {
    	double svtVelocity = distance / time;
    	return svtVelocity;
    }
    /**
     * 
     * @param velocity hastighet i m/s
     * @param time tid i sekunder
     * ber�knar str�ckan 
     * @return returnerar str�ckan
     */
    public static double svtDistance(double velocity, double time) {
    	double svtDistance = velocity * time;
    	return svtDistance;
    }
    /**
     * 
     * @param distance str�cka i meter
     * @param velocity hastighet i m/s
     * ber�knar tiden
     * @return returnerar tiden
     */
    public static double svtTime(double distance, double velocity) {
    	double svtTime = distance / velocity;
    	return svtTime;
    }
    /**
     * 
     * @param distance str�cka i meter
     * @param force kraft i newton
     * ber�knar arbetet
     * @return returnerar arbete i watt
     */
    public static double work(double distance, double force) {
    	double work = distance * force;
    	return work;
    }
    /**
     * 
     * @param work arbete i watt
     * @param time tid i sekunder
     * ber�knar effekten
     * @return returnerar effekten joule
     */
    public static double power(double work, double time) {
    	double power = work / time;
    	return power;
    }
    /**
     * 
     * @param solid ett fast �mne
     * @param mass massa
     * @param deltaT tempuratursskillnad
     * ber�knar m�ngden energi som �r n�dv�ndigt f�r att v�rma upp den till en viss tempuratur
     * @return returnerar m�ngden n�dv�ndigt energi
     */
    public static double heat(SolidTable solid, double mass, double deltaT) {
    	double m = 0;
    	m = solid.heatCapacity * mass * deltaT;
    	return m;
    }
    /**
     * 
     * @param fluid en v�tska
     * @param mass massa
     * @param deltaT tempuratursskillnad
     * ber�knar m�ngden energi som �r n�dv�ndigt f�r att v�rma upp den till en viss tempuratur
     * @return returnerar m�ngden n�dv�ndigt energi
     */
    public static double heat2(Fluid_table fluid, double mass, double deltaT) {
    	double m = 0;
    	m = fluid.heatCapacity * mass * deltaT;
    	return m;
    }
    /**
     * 
     * @param gas ett gas
     * @param mass massa 
     * @param deltaT tempuratursskillnad
     * ber�knar m�ngden energi som �r n�dv�ndigt f�r att v�rma upp den till en viss tempuratur
     * @return returnerar m�ngden n�dv�ndigt energi
     */
    public static double heat3(GasTable gas, double mass, double deltaT) {
    	double m = 0;
    	m = gas.heatCapacity * mass * deltaT;
    	return m;
    }
    /**
     * 
     * @param velocity hastighet i m/s
     * ber�knar h�jden
     * @return returnerar h�jden
     */
    public static double velocityToHeight(double velocity) {
    	double velocityToHeight = velocity / 2;
    	return velocityToHeight;
    }
	
}
