
public  class Binary extends Observer {
	
	public Binary( Subject subject){
		this.subject = subject;
		this.subject.attach (this);
	}
	
	@Override
	public void update(){
		System.out.println("Binary String: " +Integer.toBinaryString(subject.getState()));
		
	}
	

}
