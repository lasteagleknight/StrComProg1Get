import java.util.Random;


public class surviver {
	
	static Random random = new Random();
	
	int rounds = 150, tap;
	String name;
	boolean isAlive = true, deadZombie= false;

	public surviver(String name){
		this.name = name;
	}
	
	public void setRounds(int rounds){
		this.rounds = rounds;	
	}
	
	public void die(){
		isAlive = false;
	}
	
	public void bringBack(){
		isAlive = true;
	}
	
	public int getRounds(){
		return rounds;
	}
	
	public boolean getIsAlive(){
		return isAlive;
	}
	
	public void fightZombie(){
		
		deadZombie = false;
		tap = 0;
		
		if(rounds > 0){//checks if he has ammo
			do{
				
				System.out.printf("%s has %d rounds left.\n", name, rounds);
				int hit = 1 +random.nextInt(30); //sets up a random for gun
				--rounds;
				
				switch(hit){
				
					case 1: case 2: case 3:
						// instantly killing a zombie.
						deadZombie = true;
						System.out.printf("%s killed a zombie!\n",name);
						break;
						
					case 4: case 5: case 6:
						// hit but not killing a zombie.
						tap++;
						System.out.printf("%s shot a zombie!\n",name);
						System.out.println("Didn't seem to do the trick...");
				
						if(tap == 2){// if you hit zombie twice it dies
							deadZombie = true;
							System.out.printf("%s killed a zombie!\n",name);
						}//end tap
						break;
						
					case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15:
					case 16: case 17: case 18: 
						//you miss the zombie.
						System.out.printf("%s shot and missed\n", name);
						break;
						
					case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26:
					case  27: case 28: case 29: case 30:
						// Zombie kills you.
						isAlive = false;
						System.out.printf("oh my god they killed %s\n", name);
						System.out.println("You basterds!");
						break;
						
				}// end ammo switch
				
			}while(!deadZombie && isAlive && rounds > 0);
			
		}//ends ammo if statement
			
		if(rounds <= 0 && !deadZombie && isAlive){
			do{
				
				int hit = 1 + random.nextInt(30);
				
					switch(hit){
					
						case 1:
							// instantly killing a zombie.
							deadZombie = true;
							System.out.printf("%s killed a zombie!/n",name);
							break;
							
						case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10:
							// hit but not killing a zombie.
							tap++;
							System.out.printf("%s knocks a zombie back!/n",name);
							System.out.println("Didn't seem to do the trick...\n");
					
							if(tap == 3){// if you hit zombie three times it dies
								deadZombie = true;
								System.out.printf("%s killed a zombie!\n",name);
							}// ends tap statement
							break;
					
						case 11: case 12: case 13: case 14: case 15:case 16: case 17:case 18:
						case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26:
						case  27: case 28: case 29: case 30:
							// Zombie kills you.
							isAlive = false;
							System.out.printf("oh my god they killed %s\n", name);
							System.out.println("You basterds!");
							break;
							
						}//end switch statement blunt weapon
					
					}while(!deadZombie && isAlive);// ends repeat.
			
				}//ends blunt weapon if
		
	}// ends fightZombie statement.
		
	
	public boolean deadZombie(){
		return deadZombie;
	}
	
}
