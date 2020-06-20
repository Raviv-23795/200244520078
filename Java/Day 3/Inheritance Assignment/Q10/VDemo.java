/*
1)	Define an interface “Vehicle” with “start()” function .
Now derive classes like “TwoWheeler”, “ThreeWheeler”, “FourWheeler” etc. from “Vehicle” and override “start()” function.
Define a class “VDemo” in which write main()  function. In the main function create a reference to Vehicle class referring to any of the sub class.
Using this reference, call “start" method.
*/
public class VDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle =  new TwoWheeler();
		vehicle.start();
		
		vehicle = new FourWheeler();
		vehicle.start();
		
		vehicle = new ThreeWheeler();
		vehicle.start();
	}

}
