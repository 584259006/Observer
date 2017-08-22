
public class ObserverPatternDemo {
	public static void main (String[] arg){
		Subject subject = new Subject();
		
		new Binary (subject);
		new OctalObserver (subject);
		
		// 15 1111  17 
		
		System.out.println("First state change: 15");
		subject.setState(15);
		subject.setState(10);
		
		
	}	
}
