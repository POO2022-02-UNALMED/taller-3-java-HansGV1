package taller3.televisores;

public class Control {
	private TV tv;
	
	public void enlazar(TV tele) {
		this.tv = tele;
		this.tv.setControl(this);
	}
	
	public void setTV(TV te) {
		this.tv = te;
	}
	
	public TV getTV() {
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
		this.tv.volumeUp();
	}
	
	public void volumeDown() {
		this.tv.volumeDown();
	}
	
	public void setCanal(int can) {
		this.tv.setCanal(can);
	}
}
