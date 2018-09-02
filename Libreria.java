package Objetos;

public class Libreria {
	
	private String Nombre;
	private String Pais;
	private String Ubicacion;
	private int Telefono;
	private char diaAbre;
	private char diaCierra;
	private int horaAbre;
	private int minutosAbre;
	private int horaCierra;
	private int minutosCierra;
	private static int cantidadLibrerias=0;

	public Libreria() {
		// TODO Auto-generated constructor stub
	}
	
	public Libreria(String pNombre, String pPais, String pUbicacion, int pTelefono, char pdiaAbre, char pdiaCierra, int phoraAbre, int pminutosAbre, int phoraCierra, int pminutosCierra) {
		setNombre(pNombre);
		setPais(pPais);
		setUbicacion(pUbicacion);
		setTelefono(pTelefono);
		setDiaAbre(pdiaAbre);
		setDiaCierra(pdiaCierra);
		setHoraAbre(phoraAbre);
		setMinutosAbre(pminutosAbre);
		setHoraCierra(phoraCierra);
		setMinutosCierra(pminutosCierra);
		cantidadLibrerias++;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String pNombre) {
		this.Nombre = pNombre;
	}

	public String getPais() {
		return Pais;
	}

	public void setPais(String pPais) {
		this.Pais = pPais;
	}

	public String getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(String pUbicacion) {
		this.Ubicacion = pUbicacion;
	}

	public int getTelefono() {
		return Telefono;
	}

	public void setTelefono(int pTelefono) {
		this.Telefono = pTelefono;
	}

	public char getDiaAbre() {
		return diaAbre;
	}

	public void setDiaAbre(char pdiaAbre) {
		this.diaAbre = pdiaAbre;
	}

	public char getDiaCierra() {
		return diaCierra;
	}

	public void setDiaCierra(char pdiaCierra) {
		this.diaCierra = pdiaCierra;
	}

	public int getHoraAbre() {
		return horaAbre;
	}

	public void setHoraAbre(int phoraAbre) {
		this.horaAbre = phoraAbre;
	}

	public int getMinutosAbre() {
		return minutosAbre;
	}

	public void setMinutosAbre(int pminutosAbre) {
		this.minutosAbre = pminutosAbre;
	}

	public int getHoraCierra() {
		return horaCierra;
	}

	public void setHoraCierra(int phoraCierra) {
		this.horaCierra = phoraCierra;
	}

	public int getMinutosCierra() {
		return minutosCierra;
	}

	public void setMinutosCierra(int pminutosCierra) {
		this.minutosCierra = pminutosCierra;
	}

	public static int getCantidadLibrerias() {
		return cantidadLibrerias;
	}

	public static void setCantidadLibrerias(int pcantidadLibrerias) {
		Libreria.cantidadLibrerias = pcantidadLibrerias;
	}

	@Override
	public String toString() {
		return "Libreria [Nombre=" + Nombre + ", Pais=" + Pais + ", Ubicacion=" + Ubicacion + ", Telefono=" + Telefono
				+ ", diaAbre=" + diaAbre + ", diaCierra=" + diaCierra + ", horaAbre=" + horaAbre + ", minutosAbre="
				+ minutosAbre + ", horaCierra=" + horaCierra + ", minutosCierra=" + minutosCierra + "]";
	}
	
	
}
