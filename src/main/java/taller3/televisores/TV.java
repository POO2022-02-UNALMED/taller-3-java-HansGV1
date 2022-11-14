package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	public TV(Marca mar, boolean estad){
		this.marca = mar;
		this.estado = estad;
		setNumTV(TV.getNumTV()+1);
	}
	
	public void setMarca(Marca ma) {
		this.marca = ma;
	}
	
	public Marca getMarca() {
		return this.marca;
	}
	
	public void setControl(Control con) {
		this.control = con;
	}
	
	public Control getControl() {
		return this.control;
	}
	
	public void setPrecio(int price) {
		this.precio = price;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	public void setVolumen(int vol) {
		this.volumen = vol;
	}
	
	public int getVolumen() {
		return this.volumen;
	}
	
	public void setCanal(int can) {
		if ((can >= 1 && can <= 120) && this.estado == true) {
			this.canal = can;
		}
	}
	
	public int getCanal() {
		if (estado == true) {
			return this.canal;
		}
		else{
			return 1;
		}
	}
	
	public static void setNumTV(int num) {
		TV.numTV = num;
	}
	
	public static int getNumTV() {
		return TV.numTV;
	}
	
	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
	}
	
	public void canalUp() {
		if ((this.canal>= 1 && this.canal < 120) && this.estado == true) {
			this.canal++;
		}
	}
	
	public void canalDown() {
		if ((this.canal> 1 && this.canal <= 120) && this.estado == true) {
			this.canal--;
		}
	}
	
	public void volumenUp() {
		if (this.volumen>= 0 && this.volumen < 7 && this.estado == true) {
			this.volumen++;
		}
	}
	
	public void volumenDown() {
		if (this.volumen> 0 && this.volumen <= 7 && this.estado == true) {
			this.volumen--;
		}
	}
	
	
}
