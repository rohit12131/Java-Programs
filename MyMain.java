class MyMain{
	public static void main(String args[]){
		//Test t=new Test();
		//Encapsulation t=new Encapsulation();
		Encapsulation t=new Test(); //upcasting
		t.setName("Rohit");
		t.setI(10);
		System.out.println(t.getName());
		System.out.println(t.getI());
	}
}