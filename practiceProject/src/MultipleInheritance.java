
class Animal{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking........");
	}
}
class BabyDog extends Dog{
	void weep() {
		System.out.println("weeping.......");
	}
}

public class MultipleInheritance {
public static void main(String[] args) {
	    BabyDog d=new BabyDog();
	    d.bark();
	    d.weep();
	    d.eat(); 
}
}
