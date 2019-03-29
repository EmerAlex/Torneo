package com.Torneo.dominio;

public class Partido {
	
	private Equipo equipoLocal,equipoVisitante,equipoGanador,equipoPerdedor;
	private double golesLocal;
	private double golesVisitante;
	
	

	
	public Partido(Equipo equipoLocal, Equipo equipoVisitante ) {
		this.equipoLocal=equipoLocal;
		this.equipoVisitante=equipoVisitante;
		
	}
	
	public void iniciarPartido() {
		
		int resultados = (int) Math.floor(Math.random()*100);
		
		if(resultados<=40) {
			equipoLocal.agregarPuntos(3);
			this.equipoGanador=equipoLocal;
			this.equipoPerdedor=equipoVisitante;
		}
		if(resultados>40 && resultados<60) {
			equipoLocal.agregarPuntos(1);
			equipoVisitante.agregarPuntos(1);
			this.equipoGanador=null;
		}
		if(resultados>=60) {
			equipoVisitante.agregarPuntos(3);
			this.equipoGanador=equipoVisitante;
			this.equipoPerdedor=equipoLocal;
		}
		
	}
	
	
	

	public double getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(double golesLocal) {
		this.golesLocal = golesLocal;
	}

	public double getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(double golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Equipo getEquipoLocal() {
		return equipoLocal;
	}

	public Equipo getEquipoVisitante() {
		return equipoVisitante;
	}

	public Equipo getEquipoGanador() {
		return equipoGanador;
	}

	public Equipo getEqupoPerdedor() {
		return equipoPerdedor;
	}
	

}
