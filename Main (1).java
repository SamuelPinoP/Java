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

public class Main{
  public static void main(String[] args){
    CargoStarship ARK = new CargoStarship(10001, 10001, true, 101, 101, 400001, 5);
    System.out.println("The cargo capacity is " + ARK.getCargoCapacity());
    System.out.println("The current cargo " + ARK.getCurrentCargo());
    System.out.println(ARK.getPressurizedCargoModule());
    System.out.println("The velocity is " + ARK.getVelocity());
    System.out.println("The energy reserves are " + ARK.getEnergyReserves());
    System.out.println("The crew size is " + ARK.getCrewSize());
    System.out.println("The velocity is " + ARK.boostVelocity(50));
    System.out.println("The energy is " + ARK.rechargeEnergy(50));
    ARK.setVelocity(70);
    ARK.setEnergyReserves(70);
    System.out.println("The energy reserves are " + ARK.getEnergyReserves());
    System.out.println("The velocity is " + ARK.getVelocity());
    System.out.println("The velocity is " + ARK.boostVelocity(-100));
    System.out.println("The velocity is " + ARK.boostVelocity(100));
    System.out.println("The energy is " + ARK.rechargeEnergy(-100));
    System.out.println("The energy is" + ARK.rechargeEnergy(100));
    
    CargoStarship millenialFalcon = new CargoStarship(-1, -1, true, -1, -1, -1, -1);
    System.out.println("The cargo capacity is " + millenialFalcon.getCargoCapacity());
    System.out.println("The current cargo is " + millenialFalcon.getCurrentCargo());
    System.out.println(millenialFalcon.getPressurizedCargoModule());
    System.out.println("The velocity is " + millenialFalcon.getVelocity());
    System.out.println("The energy reserves are " + millenialFalcon.getEnergyReserves());
    System.out.println("The crew size is " + millenialFalcon.getCrewSize());
    System.out.println("The velocity is " + millenialFalcon.boostVelocity(50));
    System.out.println("The energy is " + millenialFalcon.rechargeEnergy(50));
    millenialFalcon.setVelocity(70);
    millenialFalcon.setEnergyReserves(70);
    System.out.println("The energy reserves are " + millenialFalcon.getEnergyReserves());
    System.out.println("The velocity is " + millenialFalcon.getVelocity());
    System.out.println("The velocity is " + millenialFalcon.boostVelocity(-100));
    System.out.println("The velocity is " + millenialFalcon.boostVelocity(100));
    System.out.println("The energy is " + millenialFalcon.rechargeEnergy(-100));
    System.out.println("The energy is " + millenialFalcon.rechargeEnergy(100));
    
    CargoStarship titan = new CargoStarship(10000, 10000, true, 50, 50, 400000, 4);
    System.out.println("The cargo capacity is " + titan.getCargoCapacity());
    System.out.println("The current cargo is " + titan.getCurrentCargo());
    System.out.println(titan.getPressurizedCargoModule());
    System.out.println("The velocity is " + titan.getVelocity());
    System.out.println("The energy reserves are " + titan.getEnergyReserves());
    System.out.println("The crew size is " + titan.getCrewSize());
    System.out.println("The velocity is " + titan.boostVelocity(50));
    System.out.println("The velocity is " + titan.rechargeEnergy(50));
    titan.setVelocity(70);
    titan.setEnergyReserves(70);
    System.out.println("The energy reserves are " + titan.getEnergyReserves());
    System.out.println("The velocity is " + titan.getVelocity());
    System.out.println("The velocity is " + titan.boostVelocity(-100));
    System.out.println("The velocity is " + titan.boostVelocity(100));
    System.out.println("The energy is " + titan.rechargeEnergy(-100));
    System.out.println("The energy is " + titan.rechargeEnergy(100));

    Starship voyager = new ResearchStarship(5, 51, 51, 400000, 5);    //OJO Polymorphism
    System.out.println("The energy reserves are " + voyager.getEnergyReserves()); 
    System.out.println("The velocity is " + voyager.getVelocity());
    System.out.println("The crew size is " + voyager.getCrewSize());
    ResearchStarship voyager1 = (ResearchStarship)voyager;     //OJO Polymorphism
    System.out.println(voyager1.getResearchField());      //OJO Polymorphism
    voyager1.setResearchField("Speed of Light");        //OJO Polymorphism
    System.out.println(voyager1.getResearchField());     //OJO Polymorphism

    Starship MARS = new ResearchStarship(3, 45, 45, 350000, 3);
    System.out.println("The energy reserves are " + MARS.getEnergyReserves());
    System.out.println("The velocity is " + MARS.getVelocity());
    System.out.println("The crew size is " + MARS.getCrewSize());
  }  
}