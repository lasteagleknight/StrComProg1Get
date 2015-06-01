import java.util.ArrayList;


public class Inventory {//Inventory for all weppons and clues.
	
	ArrayList<Object> pockets=new ArrayList<Object>();
	

	public void inventory(){
		
	}
	
	public void inventoryList(){// tells you what you have in your pockets.
		System.out.printf("You have ");
		for(int i = 0; i < pockets.size(); i++){
			System.out.printf(" %s", pockets.get(i).getClass().getName());
		}
		System.out.println();
	}
	
	public void addItem(Object a){
		pockets.add(a);
	}
	
	public void removeItem(int a){
		pockets.remove(a);
	}
	
	public Object getObject(int clue){
		return pockets.get(clue);
	}
	
	public void lookCloser(){//list off all clues you have. and examine them closer.
		for(int a = 2; a < pockets.size(); a++){
			System.out.printf("the %s", pockets.get(a));
			pockets.get(a).examine();
		}
	}
	
}
