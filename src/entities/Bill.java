package entities;

public class Bill {
	
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	
	public double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}
	
	public double cover() {
		if(feeding() < 30) {
			return 4;
		} else {
			return 0;
		}
	}
	
	public double ticket() {
		if(gender == 'F') {
			return 8;
		}else {
			return 10;
		}
		
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}

}
