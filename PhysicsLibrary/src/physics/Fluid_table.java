package physics;

public enum Fluid_table { 
	WATER(0.998, 4.19, 0, 100, 2260),
	H2SO4(1.84, 1.38, 10, 336, 511),
	ETHANOL(0.789, 2.43, -117, 78, 841),
	GLYCEROL(1.261, 2.43, 18, 290, 0),
	MERCURY(13.55, 0.14, -39, 357, 296)
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double boilPoint;
	double steamEntalpy;
	
	Fluid_table(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}

}
