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

public class ResearchStarship extends Starship{
  private String researchField;    
  private int numberOfScientists;

  public ResearchStarship(){
    super();
    this.researchField = "asteroid mining";
    this.numberOfScientists = 2;
  }

  public ResearchStarship(int numberOfScientists, int energyReserves, double velocity, double maxDistance, int crewSize){
    super(energyReserves, velocity, maxDistance, crewSize);
    this.researchField = "asteroid mining";
    this.numberOfScientists = numberOfScientists;
  }

  public int getNumberOfScientists(){
    
    return numberOfScientists;
  }

  public String getResearchField(){

    return researchField;
  }

  public void setResearchField(String researchField){

    this.researchField = researchField;
  }

  public void setNumberOfScientists(int numberOfScientists){

    this.numberOfScientists = numberOfScientists;
  }

  public double boostVelocity(int boost) {
    this.setVelocity(this.getVelocity() + boost);

    if (getVelocity() > 50 || getVelocity() < 0) {
      this.setVelocity(0);
      System.out.println("The velocity cannot be more than 50 or less than 0, stay within those values, you wanted a velocity of the velocity will be set to 0.\n");
    }
    return this.getVelocity(); 
  }

  public int rechargeEnergy(int recharge){
    this.setEnergyReserves(this.getEnergyReserves() + recharge);

    if (getEnergyReserves() > 50 || getEnergyReserves() < 0){
      this.setEnergyReserves(0);
      System.out.println("The energy reserves cannot be more than 50 or less than 0, stay within those values, you wanted energy reserves of " + recharge + " it will be set to 0.\n");
    }
    return this.getEnergyReserves();
  }
}