public class Item{
	private String itemid, name;
	private int cost;
	
	public Item(String itemid, String name, int cost){
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	
	public void display(){
		System.out.println(itemid + "\t\t" + name + "\t\t" + cost);
	}
	
	public static void main(String args[]){
		
		System.out.println("Item ID\t\tName\t\tCost");
		
		Item i1 = new Item("ITEM01", "Book", 50);
		i1.display();
		
		Item i2 = new Item("ITEM02", "Pen", 20);
		i2.display();
		
	}
}