package cn.ibm.com.testdemo.animal;

public class testAnimal {
public static void main(String[] args) {
	Animal animal = new Dog();
	animal.eat();
	
	Dog dog = (Dog)animal;
	dog.eat();
	dog.work();
}

}
