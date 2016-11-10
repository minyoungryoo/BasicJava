
public class Machine implements Info {
	public void start(){
		System.out.println("Machine started");
	}
	public void stop(){
		System.out.println("Machine stopped");
	}
	private int id = 7;

	public void showInfo() {
		System.out.println("Machine ID is " + id);
	}
	
	public String toString(){
		return "I am a machine";
	}
	
}
