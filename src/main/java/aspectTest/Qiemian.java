package aspectTest;

public class Qiemian {

	public void after() {
		System.out.println("Qiemian after");
	}
	
	public void before() {
		System.out.println("Qiemian before");
	}
	
	public void returning() {
		System.out.println("Qiemian returning");
	}
	
	public void throwing() {
		System.out.println("Qiemian throwing");
	}
	
	public void around() {
		System.out.println("Qiemian around");
	}
}
