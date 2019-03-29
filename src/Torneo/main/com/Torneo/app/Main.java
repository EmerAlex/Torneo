package com.Torneo.app;


import java.util.ArrayList;
import java.util.Arrays;

import com.Torneo.dominio.Equipo;
import com.Torneo.dominio.Fecha;
import com.Torneo.dominio.Jugador;
import com.Torneo.dominio.Partido;
import com.Torneo.dominio.Torneo;


public class Main {

	public static void main(String[] args) {
		 Torneo torneo = new Torneo();
		 Fecha fecha1=new Fecha();
		 Fecha fecha2=new Fecha();
		 Fecha fecha3=new Fecha();
		
		 Jugador j1 = new Jugador("Emerson", "Arquero");
		 Jugador j2 = new Jugador("Julias", "Defensa");
		 Jugador j3 = new Jugador("Andres", "Defensa");
		 Jugador j4 = new Jugador("Pedro", "Defensa");
		 Jugador j5 = new Jugador("Alonso", "Defensa");
		 Jugador j6 = new Jugador("Ferne", "Defensa");
		 Jugador j7 = new Jugador("Arturo", "Mediocampo");
		 Jugador j8 = new Jugador("Pablo", "Mediocamnpo");
		 Jugador j9 = new Jugador("Jose", "Mediocampo");
		 Jugador j10 = new Jugador("Hector", "Delantero");
		 Jugador j11= new Jugador("Juan", "Delantero");
		 ArrayList<Jugador>jugadores=new ArrayList<Jugador>(Arrays.asList(j1,j2,j3,j4,j5,j6,j7,j8,j9,j10,j11));
		 Equipo milan = new Equipo("milan", jugadores);
		 
		 Jugador j21 = new Jugador("Esteven", "Arquero");
		 Jugador j22 = new Jugador("Abysert", "Defensa");
		 Jugador j23 = new Jugador("Andres", "Defensa");
		 Jugador j24 = new Jugador("Tronco", "Defensa");
		 Jugador j25 = new Jugador("Alonso", "Defensa");
		 Jugador j26 = new Jugador("Alex", "Defensa");
		 Jugador j27 = new Jugador("Jubs", "Defensa");
		 Jugador j28 = new Jugador("Pablo", "Mediocamnpo");
		 Jugador j29 = new Jugador("Terns", "Mediocampo");
		 Jugador j210 = new Jugador("Hector", "Delantero");
		 Jugador j211= new Jugador("JuaYeansn", "Delantero");
		 ArrayList<Jugador>jugadores2=new ArrayList<Jugador>(Arrays.asList(j21,j22,j23,j24,j25,j26,j27,j28,j29,j210,j211));
		 Equipo arsenal = new Equipo("arsenal", jugadores2);

		 Jugador j31 = new Jugador("Hygs", "Arquero");
		 Jugador j32 = new Jugador("Julias", "Defensa");
		 Jugador j33 = new Jugador("Fabio", "Defensa");
		 Jugador j34 = new Jugador("Pedro", "Defensa");
		 Jugador j35 = new Jugador("Fanart", "Defensa");
		 Jugador j36 = new Jugador("Ferne", "Defensa");
		 Jugador j37 = new Jugador("Carl", "Mediocampo");
		 Jugador j38 = new Jugador("Pablo", "Mediocamnpo");
		 Jugador j39 = new Jugador("Carlos", "Mediocampo");
		 Jugador j310 = new Jugador("Hector", "Mediocampo");
		 Jugador j311= new Jugador("Mainets", "Delantero");
		 ArrayList<Jugador>jugadores3=new ArrayList<Jugador>(Arrays.asList(j31,j32,j33,j34,j35,j36,j37,j38,j39,j310,j311));
		 Equipo juventus = new Equipo("juventus", jugadores3);

		 Jugador j41 = new Jugador("Pedro", "Arquero");
		 Jugador j42 = new Jugador("Julias", "Defensa");
		 Jugador j43 = new Jugador("Andres", "Defensa");
		 Jugador j44 = new Jugador("Hernesto", "Defensa");
		 Jugador j45 = new Jugador("Alonso", "Defensa");
		 Jugador j46 = new Jugador("Helias", "Defensa");
		 Jugador j47 = new Jugador("Arturo", "Defensa");
		 Jugador j48 = new Jugador("Tomas", "Mediocamnpo");
		 Jugador j49 = new Jugador("Jose", "Mediocampo");
		 Jugador j410 = new Jugador("Hart", "Mediocampo");
		 Jugador j411= new Jugador("Juan", "Delantero");
		 ArrayList<Jugador>jugadores4=new ArrayList<Jugador>(Arrays.asList(j41,j42,j43,j44,j45,j46,j47,j48,j49,j410,j411));
		 Equipo chelsea = new Equipo("chelsea", jugadores4);
		 ArrayList<Equipo>equipos=new ArrayList<Equipo>(Arrays.asList(milan,arsenal,juventus,chelsea));
		 torneo.setEquipos(equipos);
		 
		 Partido partido1 = new Partido(juventus, chelsea);
		 Partido partido2 = new Partido(milan, arsenal);
		 
		 Partido partido3 = new Partido(juventus, arsenal);
		 Partido partido4 = new Partido(juventus, milan);
		 
		 Partido partido5 = new Partido(milan, chelsea);
		 Partido partido6 = new Partido(arsenal,chelsea);
		 
		 ArrayList<Partido> partidosFecha1= new ArrayList<Partido>(Arrays.asList(partido1,partido2));
		 ArrayList<Partido> partidosFecha2= new ArrayList<Partido>(Arrays.asList(partido3,partido4));
		 ArrayList<Partido> partidosFecha3= new ArrayList<Partido>(Arrays.asList(partido5,partido6));
		
		 fecha1.setPartidos(partidosFecha1);
		 fecha2.setPartidos(partidosFecha2);
		 fecha3.setPartidos(partidosFecha3);
		 
		 ArrayList<Fecha> fechas = new ArrayList<Fecha>();
		 fechas.add(fecha1);
		 fechas.add(fecha2);
		 fechas.add(fecha3);
		 
		 torneo.setFechas(fechas);
		 torneo.comenzarTorneo();
		 System.out.println("Equipos del torneo: ");
		 for(int i=0; i<4;i++) {
			 System.out.println(torneo.getEquipos().get(i).getNombre());
		 }
		 System.out.println("Equipos del torneo: ");
			for (int i = 0; i < 4; i++) {
				System.out.println(torneo.getEquipos().get(i).getNombre());
			}
		 System.out.println("\n");
		 for (int i=0; i<3;i++) {
			 System.out.println("En la fecha # "+(i+1)+" jugaron los equipos");
			 for (int j=0;j<2;j++) {
				 System.out.println(torneo.getFechas().get(i).getPartidos().get(j).getEquipoLocal().getNombre()+" vs "+torneo.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().getNombre());
			 }
			 System.out.println("\n");
		 }
		 System.out.println("\nGanadores de cada fecha:");
		 for (int i = 0; i < 3; i++) {
			 System.out.println("Fecha #" + (i + 1));
			 for (int j = 0; j < 2; j++) {
				 if (torneo.getFechas().get(i).getPartidos().get(j).getEquipoGanador() == null) {
					 System.out.println("Hubo un empate entre: "
							 + torneo.getFechas().get(i).getPartidos().get(j).getEquipoLocal().getNombre() + " y "
							 + torneo.getFechas().get(i).getPartidos().get(j).getEquipoVisitante().getNombre());
				 } else {
					 System.out.println(
							 "Ganador: " + torneo.getFechas().get(i).getPartidos().get(j).getEquipoGanador().getNombre()
							 + " y Perdedor: "
							 + torneo.getFechas().get(i).getPartidos().get(j).getEqupoPerdedor().getNombre());
				 }
				 
			 }
			 System.out.println("\n");
			 
			
			 
		 }
		 
		 
		 
		 for (int i=0; i<4;i++) {
			 System.out.println("El arquero del equipo "+torneo.getEquipos().get(i).getNombre()+" es: "+torneo.getEquipos().get(i).recorrerArrayJugadoresPosición("Arquero"));
			 System.out.println("Los defensas del equipo "+torneo.getEquipos().get(i).getNombre()+" son: "+torneo.getEquipos().get(i).recorrerArrayJugadoresPosición("Defensa"));
			 System.out.println("Los mediocampos del equipo "+torneo.getEquipos().get(i).getNombre()+" son: "+torneo.getEquipos().get(i).recorrerArrayJugadoresPosición("Mediocampo"));
			 System.out.println("los delanteros del equipo "+torneo.getEquipos().get(i).getNombre()+" son: "+torneo.getEquipos().get(i).recorrerArrayJugadoresPosición("Delantero"));
			 System.out.println("\n");
		 }
		 System.out.println("\n");
			ArrayList<String> resultados = torneo.verResultados();
			for (int i = 0; i < 8; i++) {
				System.out.println("El equipo " + resultados.get(i) + " obtuvo " + resultados.get(i + 1)+" puntos");
				i++;
			}
			System.out.println("Ganador: " + resultados.get(8) + "\n");
		 
	}

}
