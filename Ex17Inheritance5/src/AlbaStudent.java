
public class AlbaStudent extends Student {

	private String task;
	
	public AlbaStudent() {
		// TODO Auto-generated constructor stub
	}

	public AlbaStudent(String name, int age, String major, String task) {
		super(name, age, major);
		// TODO Auto-generated constructor stub
		this.task = task;
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
		System.out.println("task: " + task);
	}
	
}
