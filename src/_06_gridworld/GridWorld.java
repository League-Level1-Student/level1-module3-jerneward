package _06_gridworld;

import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {

public static void main(String[] args) {
	
	World world = new World();
	world.show();
	
	Bug bug1 = new Bug();
	Location location1 = new Location(8,8);
	
	world.add(location1, bug1);
	
	Bug bug2 = new Bug();
	Random random = new Random();
	Location location2 = new Location(random.nextInt(10), random.nextInt(10));
	
	world.add(location2, bug2);
	

	
}
	
	
}
