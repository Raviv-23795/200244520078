/*

create a hierarchy

Animal
void makeSound()
					
override "makeSound()" in all the child classes.
Dog		Cat		Tiger
				void hunting()

write a class "AnimalDemo" with main and perform functions
perform function should be defined in such a way that it can accept any animal and invoke "makeSound()" function.
also make sure if "Tiger" is passed , its "hunting()" method also should be called.

*/
public class AnimalDemo {
	static void perform(Animal animal) {
		animal.makeSound();
		
		if (animal instanceof Tiger) {
			Tiger tiger  = (Tiger) animal;
			tiger.hunting();
		}

	}
	public static void main(String[] args) {
		perform(new Dog());
		perform(new Cat());
		perform(new Tiger());

	}

}
