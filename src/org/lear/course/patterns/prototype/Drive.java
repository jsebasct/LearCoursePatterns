package org.lear.course.patterns.prototype;

/**
 * Se desea realizar un programa que modele un mapa virtual al estilo SimCity
 * Realizar un componente que entregue elementos ya construidos de la ciudad.
 * 
 * 
 * La ciudad está montada sobre un terreno este a su vez pueden está compuesto por 
 * terrenos más pequeños creando así sub divisiones. Desarrollar un componente 
 * que organice esta estructura.
 * [sounds like DECORATOR]
 * 
 * 
 * Sobre cada terreno de la ciudad debe ser posible colocar un elemento.
 * Cada elemento tiene que realizar una función diferente.
 * Desarrollar una estrategia que solucione esta problemática.
 * [sounds like ...STRETEGY]
 * 
 * 
 * Se desea poder obtener una instancia de VirtualMap sin conocer como es creada.
 * Desarrollar una solución.
 * [sounds like ...]
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
		
		IndustryArea area = (IndustryArea) city.getIndustryArea("small_industry");
		area.generateResource();
	}

}
