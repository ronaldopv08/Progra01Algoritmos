package Objetos;

//import javax.swing.Icon;

public class Libro {
	
	private int  lssn;
	private String Nombre;
	private String Tema;
	private String Descripcion;
	private int cantidadVendida;
	private int cantidadDisponible;
	private int Precio;
	private static int cantidadLibros=0;
	//private Icon foto;  NO SE QUE FORMATO DEBE SER LA IMAGEN DEL LIBRO

	public Libro() {
		// TODO Auto-generated constructor stub
	}

	public Libro(int plssn, String pNombre, String pTema, String pDescripcion, int pcantidadVendida, int pcantidadDisponible, int pPrecio) {
		setLssn(plssn);
		setNombre(pNombre);
		setTema(pTema);
		setDescripcion(pDescripcion);
		setCantidadVendida(pcantidadVendida);
		setCantidadDisponible(pcantidadDisponible);
		setPrecio(pPrecio);
		cantidadLibros++;
	}



	public int getLssn() {
		return lssn;
	}

	public void setLssn(int plssn) {
		this.lssn = plssn;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String pNombre) {
		this.Nombre = pNombre;
	}

	public String getTema() {
		return Tema;
	}

	public void setTema(String pTema) {
		this.Tema = pTema;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String pDescripcion) {
		this.Descripcion = pDescripcion;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int pcantidadVendida) {
		this.cantidadVendida = pcantidadVendida;
	}

	public int getCantidadDisponible() {
		return cantidadDisponible;
	}

	public void setCantidadDisponible(int pcantidadDisponible) {
		this.cantidadDisponible = pcantidadDisponible;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int pPrecio) {
		this.Precio = pPrecio;
	}

	public static int getCantidadLibros() {
		return cantidadLibros;
	}

	public static void setCantidadLibros(int pcantidadLibros) {
		Libro.cantidadLibros = pcantidadLibros;
	}

	@Override
	public String toString() {
		return "Libro [lssn=" + lssn + ", Nombre=" + Nombre + ", Tema=" + Tema + ", Descripcion=" + Descripcion
				+ ", cantidadVendida=" + cantidadVendida + ", cantidadDisponible=" + cantidadDisponible + ", Precio="
				+ Precio + "]";
	}

	
}
