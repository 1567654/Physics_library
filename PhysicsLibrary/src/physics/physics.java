package physics;

import java.util.Scanner;

public class physics {
	public static void main(String[] args) {
		//fahrenheitToCelsius();
		//kelvinToCelsius();
		//fluidPressure();
		//pressureUnderWater();
		//kineticEnergy();
		//potentialEnergy();
		//fallspeed();
		//delta();
		//volumeToMass();
		//volumeToMass2();
		volumeToMass3();
		//svtVelocity();
		//svtDistance();
		//svtTime();
		//work();
		//power();
		//heat();
		//heat2();
		//heat3();
		//velocityToHeight();
	}
	public static void fahrenheitToCelsius() {
		Scanner input = new Scanner(System.in);
		double fahrenheit = input.nextDouble();
		double celsius = (fahrenheit - 32) / 1.8;
		System.out.println(celsius);
		input.close();
	}
	public static void kelvinToCelsius() {
		Scanner input = new Scanner(System.in);
		double kelvin = input.nextDouble();
		double celsius = kelvin - 273.15;
		System.out.println(celsius);
		input.close();
	}
	public static void fluidPressure() {
		Scanner input = new Scanner(System.in);
		String fluid = input.nextLine();
		String fluid2 = fluid.toUpperCase();
		double deep = input.nextDouble();
		System.out.println(library.fluidPressure(Fluid_table.valueOf(fluid2), deep));
		input.close();
	}
	public static void pressureUnderWater() {
		Scanner input = new Scanner(System.in);
		double deep = input.nextDouble();
		double pressureUnderWater = 998 * 9.82 * deep;
		System.out.println(pressureUnderWater);
		input.close();
	}
	public static void kineticEnergy() {
		Scanner input = new Scanner(System.in);
		double mass = input.nextDouble();
		double velocity = input.nextDouble();
		double kineticEnergy = mass * velocity;
		System.out.println(kineticEnergy);
		input.close();
	}
	public static void potentialEnergy() {
		Scanner input = new Scanner(System.in);
		double mass = input.nextDouble();
		double height = input.nextDouble();
		double potentialEnergy = mass * 9.82 * height;
		System.out.println(potentialEnergy);
		input.close();
	}
	public static void fallspeed() {
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();
		double fallspeed = height * 2.802855688;
		System.out.println(fallspeed);
		input.close();
	}
	public static void delta() {
		Scanner input = new Scanner(System.in);
		double last = input.nextDouble();
		double first = input.nextDouble();
		double delta = first - last;
		System.out.println(delta);
		input.close();
	}
	public static void volumeToMass() {
		Scanner input = new Scanner(System.in);
		String fluid = input.nextLine();
		String fluid2 = fluid.toUpperCase();
		double volume = input.nextDouble();
		System.out.println(library.volumeToMass(Fluid_table.valueOf(fluid2), volume));
		input.close();
	}
    public static void volumeToMass2() {
    	Scanner input = new Scanner(System.in);
		String gas = input.nextLine();
		String gas2 = gas.toUpperCase();
		double volume = input.nextDouble();
		System.out.println(library.volumeToMass2(GasTable.valueOf(gas2), volume));
		input.close();
	}
    public static void volumeToMass3() {
    	Scanner input = new Scanner(System.in);
		String solid = input.nextLine();
		String solid2 = solid.toUpperCase();
		double volume = input.nextDouble();
		System.out.println(library.volumeToMass3(SolidTable.valueOf(solid2), volume));
		input.close();
	}
    public static void svtVelocity() {
    	Scanner input = new Scanner(System.in);
    	double distance = input.nextDouble();
    	double time = input.nextDouble();
    	double svtVelocity = distance / time;
    	System.out.println(svtVelocity);
    	input.close();
    }
    public static void svtDistance() {
    	Scanner input = new Scanner(System.in);
    	double velocity = input.nextDouble();
    	double time = input.nextDouble();
    	double svtDistance = velocity * time;
    	System.out.println(svtDistance);
    	input.close();
    }
    public static void svtTime() {
    	Scanner input = new Scanner(System.in);
    	double distance = input.nextDouble();
    	double velocity = input.nextDouble();
    	double svtTime = distance / velocity;
    	System.out.println(svtTime);
    	input.close();
    }
    public static void work() {
    	Scanner input = new Scanner(System.in);
    	double distance = input.nextDouble();
    	double force = input.nextDouble();
    	double work = distance * force;
    	System.out.println(work);
    	input.close();
    }
    public static void power() {
    	Scanner input = new Scanner(System.in);
    	double work = input.nextDouble();
    	double time = input.nextDouble();
    	double power = work / time;
    	System.out.println(power);
    	input.close();
    }
    public static void heat() {
    	Scanner input = new Scanner(System.in);
		String solid = input.nextLine();
		String solid2 = solid.toUpperCase();
		double mass = input.nextDouble();
		double deltaT = input.nextDouble();
		System.out.println(library.heat(SolidTable.valueOf(solid2), mass, deltaT));
		input.close();
    }
    public static void heat2() {
    	Scanner input = new Scanner(System.in);
		String fluid = input.nextLine();
		String fluid2 = fluid.toUpperCase();
		double mass = input.nextDouble();
		double deltaT = input.nextDouble();
		System.out.println(library.heat2(Fluid_table.valueOf(fluid2), mass, deltaT));
		input.close();
    }
    public static void heat3() {
    	Scanner input = new Scanner(System.in);
		String gas = input.nextLine();
		String gas2 = gas.toUpperCase();
		double mass = input.nextDouble();
		double deltaT = input.nextDouble();
		System.out.println(library.heat3(GasTable.valueOf(gas2), mass, deltaT));
		input.close();
    }
    public static void velocityToHeight() {
    	Scanner input = new Scanner(System.in);
    	double velocity = input.nextDouble();
    	double velocityToHeight = velocity / 2;
    	System.out.println(velocityToHeight);
    	input.close();
    }

	
}
