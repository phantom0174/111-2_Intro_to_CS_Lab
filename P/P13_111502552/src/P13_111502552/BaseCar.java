package P13_111502552;

public class BaseCar {
	public String driver;
	public int speed, driver_boost;
	
	public int curLength = 0;
	
	public BaseCar(String driver, int speed, int driver_boost) {
		this.driver = driver;
		this.speed = speed;
		this.driver_boost = driver_boost;
	}
	
	public void proceed() {
		curLength += speed + driver_boost;
	}
}
