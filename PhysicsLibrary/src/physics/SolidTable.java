package physics;

public enum SolidTable {
	ICE(0.92, 2.2, 0, 334),
	IRON(7.87, 0.45, 1538, 276),
	LEAD(11.3, 0.13, 327, 25),
	GOLD(19.3, 0.13, 1064, 66),
	STEEL(7.8, 0.46, 1350, 0)
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double meltEntalpy;
	
	SolidTable(double d, double hc, double sp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		meltEntalpy = se * 1E3;
	}

}
