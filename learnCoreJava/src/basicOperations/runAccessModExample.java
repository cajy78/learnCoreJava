package basicOperations;

public class runAccessModExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("current value of static var before class instantiation is:"+accessModifierExample.stc);
		accessModifierExample.functionStatic();
		System.out.println("current value of static var before class instantiation and after calling static function is:"+accessModifierExample.stc);
		accessModifierExample acc = new accessModifierExample();
		acc.functionPublic(12345);
		acc.functionProtected();
		
		// acc.prog = "Python";
	}

}
