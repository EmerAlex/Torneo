package com.Torneo.dominio;

import java.util.ArrayList;

public class Equipo {
	
	private String nombre;
	private ArrayList<Jugador> jugadores;
	private int puntos;
	
	
	public Equipo(String nombre, ArrayList<Jugador> jugadores) {
		
		this.nombre=nombre;
		this.jugadores=jugadores;
		
	}
	public void registrarJugador(Jugador jugador) {
	
		jugadores.add(jugador);
	}
	public boolean topeJugadores() {
		if (jugadores.size()<22) {
			return true;
		}else {
			return true;
		}
	}
	public ArrayList<String> VerJugadores() {	
		ArrayList<String> listaJugadores = new ArrayList<String>();
		for(int i=0;i<this.jugadores.size();i++) {
			listaJugadores.add(this.jugadores.get(i).getNombre());
			listaJugadores.add(this.jugadores.get(i).getPosicion());
		}return listaJugadores;
	}
	
	public ArrayList<String> recorrerArrayJugadoresPosición(String posicion) {	
		ArrayList<String> listaJugadores = new ArrayList<String>();
		for(int i=0;i<this.jugadores.size();i++) {
			if(this.jugadores.get(i).getPosicion().contentEquals(posicion)) {
			listaJugadores.add(this.jugadores.get(i).getNombre());
			}
		}
		return listaJugadores;
	}
	
	public int puntosEquipo() {
		return this.puntos;
	}
	
	public void agregarPuntos(int puntos) {
		this.puntos+=puntos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}
	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
		

}
