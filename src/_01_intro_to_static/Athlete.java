package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;
    
  

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber = nextBibNumber++; 
    } 
    
      

    public static void main(String[] args) { 
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
   
    	Athlete Sarah = new Athlete("Sarah", 10);
    	Athlete Joe = new Athlete ("Joe",8);
    	
    	System.out.println(Sarah.name);
    	System.out.println(Joe.name);
    	System.out.println(Sarah.bibNumber);
    	System.out.println(Joe.bibNumber);
    	System.out.println(Sarah.raceLocation);
    	System.out.println(Joe.raceLocation);

}


}