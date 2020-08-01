public class GamesDemo{
	public static void main(String args[]){
		Game arr[] = {new Football(), new Cricket(), new Tennis()};
		for(int i=0; i < arr.length; i++)
			arr[i].play();
	}
}