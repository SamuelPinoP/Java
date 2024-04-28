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

public class CargoStarship extends Starship {
  private double cargoCapacity; // max 10000 //
  private double currentCargo; // max cargoCapacity //
  private boolean pressurizedCargoModule;
  // this starship has a maximmum of 4 crewSize //
  
  public CargoStarship() {
    super();
    this.cargoCapacity = 0;
    this.currentCargo = 0;
    this.pressurizedCargoModule = true;
  }

  public CargoStarship(double cargoCapacity, double currentCargo, boolean pressurizedCargoModule, int energyReserves, double velocity, double maxDistance, int crewSize) {
    super(energyReserves, velocity, maxDistance, crewSize);
    this.cargoCapacity          = cargoCapacity;
    this.currentCargo           = currentCargo;
    this.pressurizedCargoModule = pressurizedCargoModule;

    if (getEnergyReserves() > 100 || getEnergyReserves() < 0){
      this.setEnergyReserves(0);
      System.out.println("\nThe energy reserves cannot be more than 100 or less than 0, stay within those values, the energy reserves will be set to 0.\n");
    }
    
    if (getVelocity() > 100 || getVelocity() < 0) {
      this.setVelocity(0);
      System.out.println("\nThe velocity cannot be more than 100 or less than 0, stay within those values, you wanted a the velocity will be set to 0.\n");
    }
    
    if (cargoCapacity > 10000 || cargoCapacity < 0) {
      this.cargoCapacity = 0;
      System.out.println("\nThe maximum cargo capacity is 10000 and the minimum is 0, stay within those values, you wanted a cargo of " + cargoCapacity + " it will be set to 0.\n");
    }
    else {
      this.cargoCapacity = cargoCapacity;
    }

    if (currentCargo > cargoCapacity || currentCargo < 0){
      this.currentCargo = 0;
      System.out.println("\nThe current cargo cannot be more than the cargo capacity and the minimum is 0, stay within those values, you wanted a cargo of " + currentCargo + " it will be set to 0.\n");
    }
    else {
      this.currentCargo = currentCargo;
    }
    
    if (getCrewSize() > 4 || getCrewSize() < 2){
      setCrewSize(2);
      System.out.println("\nThe crew cannot be more than 4 or less than 2, stay within those values, you wanted a crew of " + crewSize + " it will be set to 2.\n");
    }  
    else {
      setCrewSize(crewSize);
    }
  }

  public double getCargoCapacity(){
    
    return cargoCapacity;
  }

  public double getCurrentCargo(){

    return currentCargo;
  }

  public boolean getPressurizedCargoModule() {

    return pressurizedCargoModule;
  }

  public void setCargoCapacity(double cargoCapacity) {

    this.cargoCapacity = cargoCapacity;  
  }

  public void setCargoCurrentCargo(double currentCargo){

    this.currentCargo = currentCargo;
  }

  public void setPressurizedCargoModule(boolean pressurized){

    this.pressurizedCargoModule = pressurized;
  }

  public double boostVelocity(int boost) {
    this.setVelocity(this.getVelocity() + boost);
    
    if (getVelocity() > 100 || getVelocity() < 0) {
      this.setVelocity(0);
      System.out.println("\nThe velocity cannot be more than 100 or less than 0, stay within those values, the velocity will be set to 0.\n");
    }
    return this.getVelocity(); 
  }

  public int rechargeEnergy(int recharge){
    this.setEnergyReserves(this.getEnergyReserves() + recharge);

    if (getEnergyReserves() > 100 || getEnergyReserves() < 0){
      this.setEnergyReserves(0);
      System.out.println("\nThe energy reserves cannot be more than 100 or less than 0, stay within those values, you wanted energy reserves of " + recharge + " it will be set to 0.\n");
    }
    return this.getEnergyReserves();
  }
}