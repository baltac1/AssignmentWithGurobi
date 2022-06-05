public class Worker {
	public String name;
	public int wagePerShift;
	public int[] availability;
	
	
	public Worker(String _name, int _wagePerShift, int[] _availability) {
		this.name = _name;
		this.wagePerShift = _wagePerShift;
		this.availability = _availability;
	
	}
	public void setName(String _name) {
		this.name = _name;
	}
	public void setWagePerShift(int _wagePerShift) {
		this.wagePerShift = _wagePerShift;
	}
	public void setAvailability(int[] _availability) {
		this.availability = _availability;
	}
}
