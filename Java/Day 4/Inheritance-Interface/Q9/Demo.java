/*
9) create interface "Game" , have an abstract method "play()". from this interface implements classes like "Cricket" , "FootBall" and "Tennis".
Now Define one more class public class Demo with main function.
In this class have a static method "perform" which will take interface reference as parameter.
Inside "perform()" see to it that any child object passed ,its "play()" method should be invoked. Call "perform()" method from main function.
*/

public class Demo {

	public static void perform(Game game) {
		game.play();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new Cricket());
		perform(new Football());
		perform(new Tennis());
	}

}
