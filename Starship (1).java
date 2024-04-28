/*---------------------------------------------------
Name: Samuel Pino
Student ID: 4000358810
COP 2800 – Java Programming
Spring 2024 – Tu 5:30 PM – 8:50 PM
Assignment # 4
Plagiarism Statement
I certify that this assignment is my own work and that I have not
copied in part or whole or otherwise plagiarized the work of other
students, persons, Generative Pre-trained Generators (GPTs) or any other AI tools.
I understand that students involved in academic dishonesty will face
disciplinary sanctions in accordance with the College's Student Rights
and Responsibilities Handbook (https://www.mdc.edu/rightsandresponsibilities)
01234567890120123456789012345678901234567890123456789345678901234567890123456789
----------------------------------------------------------*/

import java.util.Date;

public class Starship {

  private String missionObjective;
  private double maxDistance;
  private int crewSize;
  private String destination;
  
  private String starshipID;
  private int energyReserves;
  private double velocity;
  private Date launchDate;
  

  public Starship() {

    this.starshipID = "Voyager Infinity-" + (int)(Math.random()*10000);
  }

  public Starship(int energyReserves) {

    this.energyReserves = energyReserves;
    this.starshipID     = "Voyager Infinity-" + (int)(Math.random()*10000);
  }

  public Starship(int energyReserves, double velocity) {

    this.starshipID     = "Voyager Infinity-" + (int)(Math.random()*10000);
    this.energyReserves = energyReserves;
    this.velocity       = velocity;
    this.launchDate     = new Date();
  }

  public Starship(int energyReserves, double velocity, double maxDistance, int crewSize) {
    
    this.maxDistance = maxDistance;
    this.crewSize    = crewSize;
    
    try{
      if (maxDistance > 400000 || maxDistance < 0) {
        this.maxDistance = 400000;
        System.out.println("The maximum distance is 400000 and the minimum is 0, stay within those values, you wanted a distance of " + maxDistance + " it will be set to 400000.\n");
      }
      else {
        this.maxDistance = maxDistance;
      }
    }
  
    catch (Exception e) {
      System.out.println("Remember to provide a numerical value for the distance between 0 and 400000 the Max Distance will be set to" + this.maxDistance + "\n");
      this.maxDistance = 400000;   
    }
    try{
      if (crewSize > 10 || crewSize < 2) {
        this.crewSize = 2;
        System.out.println("We can only have 2 to 10 tripulants in the ship and you wanted to have " + crewSize + " so we have set it to 2.\n");
      }
      else {
        this.crewSize = crewSize;
      }
    }

    catch (Exception e) {
      System.out.println("Remember to provide a numerical value for the amount of tripulants\n");
      this.crewSize = 2;   
    }
    
    this.starshipID       = "Voyager Infinity-" + (int)(Math.random()*10000);
    this.energyReserves   = energyReserves;
    this.velocity         = velocity;
    this.launchDate       = new Date();
    this.missionObjective = "explore";
    this.destination      = "moon";
  }

  public double boostVelocity(int boost) {

    this.velocity += boost;
    return velocity;
  }

  public int rechargeEnergy(int recharge) {

    this.energyReserves += recharge;
    return energyReserves;
  }

  public int getEnergyReserves() {

    return energyReserves;
  }

  public double getVelocity() {

    return velocity;
  }

  public void setEnergyReserves(int energyReserves) {

    this.energyReserves = energyReserves;
  }

  public void setVelocity(double velocity) {

    this.velocity = velocity;
  }

  public String getStarshipID() {

    return starshipID;
  }

  public Date getDate() {

    return launchDate;
  }

  public String getMissionObjective(){
    
    return missionObjective;
  }

  public String getDestination(){
    
    return destination;
  }

  public double getMaxDistance() {
    
    return maxDistance;
  }

  public int getCrewSize() {
    
    return crewSize;
  }

  public void setCrewSize(int crewSize){

    this.crewSize = crewSize;
  }

  public void setMissionObjective(String missionObjective){
    
    this.missionObjective = missionObjective;
  }

  public void setDestination(String destination){
    
    this.destination = destination;
  }
  
  public void setMaxDistance(double maxDistance){
    
    this.maxDistance = maxDistance;
  }
}