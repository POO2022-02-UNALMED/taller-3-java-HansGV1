package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tele) {
		this.tv = tele;
		this.tv.setControl(this);
	}
	
	public void setTv(TV te) {
		this.tv = te;
	}
	
	public TV getTv() {
		return this.tv;
	}
	
	public void turnOn() {
		this.tv.turnOn();
	}
	
	public void turnOff() {
		this.tv.turnOff();
	}
		
	public void canalUp() {
		this.tv.canalUp();
	}
	
	public void canalDown() {
		this.tv.canalDown();
	}
	
	public void volumenUp() {
		this.tv.volumenUp();
	}
	
	public void volumeDown() {
		this.tv.volumenDown();
	}
	
	public void setCanal(int can) {
		this.tv.setCanal(can);
	}
}
