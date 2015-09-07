package org.lear.course.patterns.prototype;

/**
 * Se desea realizar un programa que modele un mapa virtual al estilo SimCity
 * Realizar un componente que entregue elementos ya construidos de la ciudad.
 * 
 * @author jscruz
 */
public class Drive {

	public static void main(String[] args) {
		
		CityRegistry city = new CityRegistry();
		Park small = (Park)city.getPark("small_park");
		
		String smallInfo = String.format("Parque chico zonas verdes: %s juegos: %s"
				, small.getGreenZonesNumber()
				, small.getGamesNumber());
		System.out.println(smallInfo);
		
		//small.setName("Parque Chacabuco");
		//Park small2 = (Park)city.getPark("small_park");
		//System.out.println(small2.getName());
	}

}
