import java.util.Random;
import java.util.Scanner;


public class game {
	
	static Scanner input = new Scanner( System.in );
	static Random random = new Random();
	static int trap;
	
	public static void main(String[] args){
		
		String playerName;
		int night = 1, food = 80, randomPlayer, eat = 10,get;
		
		System.out.println("What is your name?");
		playerName = input.nextLine();
		
		//sets up main player
		surviver player = new surviver(playerName);
		
		//sets up army
		surviver man1 = new surviver(buildArmy(1));
		surviver man2 = new surviver(buildArmy(2));
		surviver man3 = new surviver(buildArmy(3));
		surviver man4 = new surviver(buildArmy(4));
		surviver man5 = new surviver(buildArmy(5));
		surviver man6 = new surviver(buildArmy(6));
		surviver man7 = new surviver(buildArmy(7));
		surviver man8 = new surviver(buildArmy(8));
		surviver man9 = new surviver(buildArmy(9));
		
		// tells user of the plan
		intro();
		
		//set up for game.
		do{
			//First is a search for items the user can use to fight zombies
			//food to 1, ammo to 2, trap to 3, death to 4, nothing to 5, life is 6
			randomPlayer = random.nextInt(10);
			int got = 0;
			do{
				switch(randomPlayer){
					case 1:
						if(man1.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man1.name);
								goOn();
							}
							else if(get == 2){
								man1.setRounds(man1.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man1.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man1.name);
							}
							else if(get == 4){
								man1.die();
								System.out.printf("%s was killed by a random zombie!\n", man1.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man1.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man1.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man1.name);
							}
							break;
						}
					case 2:
						if(man2.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man1.name);
								goOn();
							}
							else if(get == 2){
								man2.setRounds(man2.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man2.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man2.name);
							}
							else if(get == 4){
								man1.die();
								System.out.printf("%s was killed by a random zombie!\n", man2.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man2.name);
							}
							else if(get == 6){
								if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man1.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man2.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man2.name);
							}
							break;
						}
					case 3:
						if(man3.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man3.name);
								goOn();
							}
							else if(get == 2){
								man3.setRounds(man1.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man1.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man3.name);
							}
							else if(get == 4){
								man3.die();
								System.out.printf("%s was killed by a random zombie!\n", man3.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man3.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man2.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man1.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man3.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man3.name);
							}
							break;
						}
					case 4:
						if(man4.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man4.name);
								goOn();
							}
							else if(get == 2){
								man1.setRounds(man4.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man4.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man4.name);
							}
							else if(get == 4){
								man4.die();
								System.out.printf("%s was killed by a random zombie!\n", man4.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man4.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man3.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man1.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man4.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man4.name);
							}
							break;
						}
					case 5:
						if(man5.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man5.name);
								goOn();
							}
							else if(get == 2){
								man5.setRounds(man5.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man5.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man5.name);
							}
							else if(get == 4){
								man5.die();
								System.out.printf("%s was killed by a random zombie!\n", man5.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man5.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man4.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man1.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man5.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man5.name);
							}
							break;
						}
					case 6:
						if(man6.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man6.name);
								goOn();
							}
							else if(get == 2){
								man6.setRounds(man6.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man6.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man6.name);
							}
							else if(get == 4){
								man6.die();
								System.out.printf("%s was killed by a random zombie!\n", man6.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man6.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man5.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man1.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man6.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man6.name);
							}
							break;
						}
					case 7:
						if(man7.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man7.name);
								goOn();
							}
							else if(get == 2){
								man7.setRounds(man7.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man7.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man7.name);
							}
							else if(get == 4){
								man7.die();
								System.out.printf("%s was killed by a random zombie!\n", man7.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man7.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man6.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man1.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man7.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man7.name);
							}
							break;
						}
					case 8:
						if(man8.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man8.name);
								goOn();
							}
							else if(get == 2){
								man8.setRounds(man8.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man8.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man8.name);
							}
							else if(get == 4){
								man8.die();
								System.out.printf("%s was killed by a random zombie!\n", man8.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man8.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man7.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man1.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man8.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man8.name);
							}
							break;
						}
					case 9:
						if(man9.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", man9.name);
								goOn();
							}
							else if(get == 2){
								man9.setRounds(man9.getRounds() + 20);
								System.out.printf("%s found bullets.\n",man9.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", man9.name);
							}
							else if(get == 4){
								man1.die();
								System.out.printf("%s was killed by a random zombie!\n", man9.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", man9.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,man9.name);
								}
								else if(!player.isAlive){
									player.bringBack();
									System.out.printf("%s brought back %s\n",man9.name,player.name);
								}
								else
									System.out.printf("%s found nothing", man9.name);
							}
							break;
						}
					case 10:
						if(player.isAlive){
							get = travel();
							got = 1;
							if(get == 1){
								food += 10;
								System.out.printf("%s found food.\n", player.name);
								goOn();
							}
							else if(get == 2){
								player.setRounds(player.getRounds() + 20);
								System.out.printf("%s found bullets.\n",player.name);
								System.out.println("...Why whould anyone carry weppons in a community college?");
							}
							else if(get == 3){
								System.out.printf("%s found parts for a trap\n", player.name);
							}
							else if(get == 4){
								player.die();
								System.out.printf("%s was killed by a random zombie!\n", player.name);
							}
							else if(get == 5){
								System.out.printf("%s found nothing\n", player.name);
							}
							else if(get == 6){
								if(!man2.isAlive){
									man2.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man2.name);
								}
								else if(!man3.isAlive){
									man3.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man3.name);
								}
								else if(!man4.isAlive){
									man4.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man4.name);
								}
								else if(!man5.isAlive){
									man5.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man5.name);
								}
								else if(!man6.isAlive){
									man6.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man6.name);
								}
								else if(!man7.isAlive){
									man7.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man7.name);
								}
								else if(!man8.isAlive){
									man8.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man8.name);
								}
								else if(!man9.isAlive){
									man9.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man9.name);
								}
								else if(!man1.isAlive){
									man1.bringBack();
									System.out.printf("%s brought back %s\n",player.name,man1.name);
								}
								else
									System.out.printf("%s found nothing", player.name);
							}
							break;
						}
				
				}
			}while(got == 0);
			
			
			//search needed to add
			System.out.printf("Night %d\n", night);
			
			int hord = zombie();
			System.out.printf("There are %d zombies outside!\n", hord);
			System.out.println("lock and load!");
			goOn();
			
			do{
				// battle loop repeats until all zombies are dead.
			
				if(man1.isAlive){//checks if man1 is alive
					man1.fightZombie();
					if(man1.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man1 fight
				
				if(man2.isAlive && hord != 0){
					man2.fightZombie();
					if(man2.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man2 fight
				
				if(man3.isAlive && hord != 0){
					man3.fightZombie();
					if(man3.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man3 fight
				
				if(man4.isAlive && hord != 0){
					man4.fightZombie();
					if(man4.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man2 fight
				
				if(man5.isAlive && hord != 0){
					man5.fightZombie();
					if(man5.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man5 fight
				
				if(man6.isAlive && hord != 0){
					man6.fightZombie();
					if(man6.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man2 fight
				
				
				if(man7.isAlive && hord != 0){
					man7.fightZombie();
					if(man7.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man7 fight
				
				if(man8.isAlive && hord != 0){
					man8.fightZombie();
					if(man8.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man2 fight
				
				
				if(man9.isAlive && hord != 0){
					man9.fightZombie();
					if(man9.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man2 fight
				
				if(player.isAlive && hord != 0){
					player.fightZombie();
					if(player.deadZombie)
						hord--;
					countZombies(hord);
					goOn();
				}//ends man2 fight
				
			}while(hord > 0 && (player.isAlive || man1.isAlive || man2.isAlive || man3.isAlive || man4.isAlive
					 || man5.isAlive || man6.isAlive || man7.isAlive || man8.isAlive || man9.isAlive));
			// ends night battle if zombies die or all the players do.
			
			eat = 0;
			//checks if users are alive. And makes dinner.
			if(man1.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man1.name);
			}
			if(man2.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man2.name);
			}
			if(man3.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man3.name);
			}
			if(man4.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man4.name);
			}
			if(man5.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man5.name);
			}
			if(man6.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man6.name);
			}
			if(man7.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man7.name);
			}
			if(man8.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man8.name);
			}
			if(man9.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", man9.name);
			}
			if(player.isAlive){
				eat++;
				System.out.printf("%s servived the night\n", player.name);
			}
			goOn();
			
			food = dinner(food,eat);
			goOn();
			//kills players if there is no food.
			if(food <= 0){
				if(man8.isAlive){
					man9.die();
					System.out.printf("%s died of hunger", man9.name);
				}else if(man8.isAlive){
					man8.die();
					System.out.printf("%s died of hunger", man8.name);
				}else if(man7.isAlive){
					man7.die();
					System.out.printf("%s died of hunger", man7.name);
				}else if(man6.isAlive){
					man6.die();
					System.out.printf("%s died of hunger", man6.name);
				}else if(man5.isAlive){
					man5.die();
					System.out.printf("%s died of hunger", man5.name);
				}else if(man4.isAlive){
					man4.die();
					System.out.printf("%s died of hunger", man4.name);
				}else if(man3.isAlive){
					man3.die();
					System.out.printf("%s died of hunger", man3.name);
				}else if(man2.isAlive){
					man2.die();
					System.out.printf("%s died of hunger", man2.name);
				}else if(man1.isAlive){
					man1.die();
					System.out.printf("%s died of hunger", man1.name);
				}else if(player.isAlive){
					player.die();
					System.out.printf("%s died of hunger", player.name);
				}
			}
			
			
			night++;
		}while(night < 11 && (player.isAlive || man1.isAlive || man2.isAlive || man3.isAlive || man4.isAlive
				 || man5.isAlive || man6.isAlive || man7.isAlive || man8.isAlive || man9.isAlive));
		
		// results if user wins 
		if(night > 10){
			System.out.println("The army came and saved the rest of you.");
		}
		
		//results if user loses
		if(!(player.isAlive && man1.isAlive && man2.isAlive && man3.isAlive && man4.isAlive
				 && man5.isAlive && man6.isAlive && man7.isAlive && man8.isAlive && man9.isAlive)){
			System.out.println("everyone died. ");
		}
		
	}// end of game.
	
	
	// asking for user names
	public static String buildArmy(int i){
			String name;
			System.out.printf("who is your %d friend?\n", i);
			name = input.nextLine();
			return name;
	}
	
	// set up story for game.
	public static void intro(){
		System.out.println("Zombies have risen from the grave. You and your friends have locked yourself in a school.");
		System.out.println("You have ten nights to servive till helps arrive.");
		System.out.println("You only have 8 nights worth of food. However you can look for more food outside.");
		System.out.println("If you go, however, you run the risk of getting bite.");
		goOn();
		System.out.println("Each person has 150 bullets of ammo.");
	}
	
	//zombie counter
	public static int zombie(){
		int zombie;
		zombie = 10 + random.nextInt(40);
		countZombies(zombie);
		if(trap == 1){
			zombie /= 2;
			System.out.println("The trap killed half the zombies!");
			countZombies(zombie);
		}
		return zombie;
	}
	
	// a pause for to much text of code.
	public static void goOn(){
		String next;
		System.out.println("Hit return to continue.");
		next = input.nextLine();
	}
	
	//setting a eating counter
	public static int dinner(int food, int eat){
		food -= eat;
		System.out.printf("There are %d meals left.\n after dinner.",food);
		return food;
	}
	
	// code for traveling.
	public static int travel(){
		trap = 0;
		int grab = 0;
		int danger;
		//food to 1, ammo to 2, trap to 3, death to 4, nothing to 5, life is 6
		System.out.println("Are you willing to risk getting some resorce?");
		String question = input.nextLine();
		question = question.toLowerCase();
		boolean look = question.contains("yes");
		if(look){
			System.out.println("Where whould you like to look?");
			System.out.println("1.nursing wing, 2.gym , 3.cafeteria, 4.arts center");
			int direction = input.nextInt();
			switch(direction){
			case 1:
				danger = random.nextInt(3);
				if(danger == 0)
					grab = 4;
				else if(danger == 1 || danger == 3)
					grab = 5;
				else if(danger == 2)
					grab = 6;
				break;
			case 2:
				danger = random.nextInt(3);
				if(danger == 0)
					grab = 4;
				else if(danger == 1 || danger == 3)
					grab = 5;
				else if(danger == 2)
					grab = 2;
				break;
			case 3:
				danger = random.nextInt(3);
				if(danger == 0)
					grab = 4;
				else if(danger == 1 || danger == 3)
					grab = 5;
				else if(danger == 2)
					grab = 1;
				break;
			case 4:
				danger = random.nextInt(3);
				if(danger == 0)
					grab = 4;
				else if(danger == 1 || danger == 3)
					grab = 5;
				else if(danger == 2){
					trap = 1;
					grab = 3;
				}
				break;
			}
		}
		return grab;
	}
	
	// repeat text.
	public static void countZombies(int zombies){
		System.out.printf("There are %d zombies outside!\n", zombies);
	}
	
	
	
	
	
}
