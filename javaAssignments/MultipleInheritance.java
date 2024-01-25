package javaAssignments; 
//5. Write a Java Program to implement multiple inheritance
class MultipleInheritance implements A, B {

	@Override
	public void method() {
		A.super.method();
		B.super.method();
	}
	
	public static void main(String [] args) {
		
		MultipleInheritance mi = new MultipleInheritance();
		mi.method();
	}

}
	
		
	
		
		

		

	


