package physics;

import java.util.Scanner;

public class questions {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Hur mycket väger 80 dm^3 järn?");
		System.out.println(library.volumeToMass3(SolidTable.IRON, 80) + "kg");
		
		System.out.println("Hur långt hinner Tomas om han löper med medelhastigheten 2.8 m/s i 60 minuter?");
        System.out.println(library.svtDistance(2.8, 3600) + "m");
        
        System.out.println("Hur mycket energi krävs för att värma upp 5 liter vatten?");
        System.out.println(library.heat2(Fluid_table.WATER, 5, 1) + "J");
        
        System.out.println("Hur stort är det totala trycket 100 meter under havsytan?");
        System.out.println(library.pressureUnderWater(100) + 101300 + "Pa");
        
        System.out.println("Tomas som är 180cm lång kastar upp en boll med massan 200 gram i luften så den får starthastigheten 50 km/h. Hur högt kommer bollen?");
        System.out.println(library.velocityToHeight(13.9) + 1.8 + "m");
        
        System.out.println("En bil med massan 740kg accelererar med konstant acceleration från 0-100 på 4.4 sekunder. Hur stor effekt har bilens motor uppnått?");
        System.out.println(library.power(202017, 4.4) + "J");
        
        System.out.println("En studsboll släpps från 10 meters höjd och varje gång den nuddar marken tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar hörge än 0.5 meter?");
        System.out.println(library.fallspeed(10));
	}

}
