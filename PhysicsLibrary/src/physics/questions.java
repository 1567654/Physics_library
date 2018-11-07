package physics;

import java.util.Scanner;

public class questions {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Hur mycket v�ger 80 dm^3 j�rn?");
		System.out.println(library.volumeToMass3(SolidTable.IRON, 80) + "kg");
		
		System.out.println("Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.8 m/s i 60 minuter?");
        System.out.println(library.svtDistance(2.8, 3600) + "m");
        
        System.out.println("Hur mycket energi kr�vs f�r att v�rma upp 5 liter vatten?");
        System.out.println(library.heat2(Fluid_table.WATER, 5, 1) + "J");
        
        System.out.println("Hur stort �r det totala trycket 100 meter under havsytan?");
        System.out.println(library.pressureUnderWater(100) + 101300 + "Pa");
        
        System.out.println("Tomas som �r 180cm l�ng kastar upp en boll med massan 200 gram i luften s� den f�r starthastigheten 50 km/h. Hur h�gt kommer bollen?");
        System.out.println(library.velocityToHeight(13.9) + 1.8 + "m");
        
        System.out.println("En bil med massan 740kg accelererar med konstant acceleration fr�n 0-100 p� 4.4 sekunder. Hur stor effekt har bilens motor uppn�tt?");
        System.out.println(library.power(202017, 4.4) + "J");
        
        System.out.println("En studsboll sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�rge �n 0.5 meter?");
        System.out.println(library.fallspeed(10));
	}

}
