/* 
 ~ Definition of Some Terms ~

Instance variable - Variables declared inside the class, but outside 
any method.
Identifier - name of a variable or method.
Main class - Class that contains main method.

*/

// Object class called Car
public class Car {
  
  // Instance variables 
  private String make;
  private String model;
  private int year;
  private double mileage;
  
  /*
  ~ Constructor ~
  
  It sets the initial state of an object by assigning values to its
  instance variables. Essentially, it sets the initially value of 
  instance variable of an object.
  */ 
  
  // Constructor of Car class
  public Car(String make, String model, int year, double mileage) {
    /* 
    this.make
    We're referring to instance variable "private String make"
    
    make 
    We're referring to formal (argument) variable " String make"
    */
    this.make = make;
    this.model = model;
    this.year = year;
    this.mileage = mileage;
  }
  
  /*
  ~ Getter methods ~
  
  It is use to retrieve or access the value of an instance variable.
  To call a getter method: 
  
  objectName.getVariableName();
  */
  
  // Getter method for make variable 
  public String getMake() {
    return make;
  }
  
  // Getter method for model variable 
  public String getModel() {
    return model;
  }
  
  // Getter method for year variable 
  public int getYear() {
    return year;
  }
  
  // Getter method for mileage variable 
  public double getMileage() {
    return mileage;
  }
  
  /*
  ~ Object method ~
  
  Methods inside an object class. It functions the same way as 
  methods declared inside the main class. To call an object method: 
  
  objectName.methodName();
  */
  
  /* 
  Object method to update the car's mileage. Adds the initial value 
  of mileage variable, and the value of miles. To call it: 
  
  objectName.drive(someValue);
  
  */
  public double drive(double miles) {
    return mileage + miles;
  }
  
  /*
  Object method to check car's mileage status. To call it: 
  
  objectName.checkOdometer();
  */
  public String checkOdometer() {
    String mileageStatus = "";
    
    if(mileage < 10000) {
      mileageStatus = "Low Mileage"; 
      
    } else if(mileage <= 50000) {
      mileageStatus = "Moderate Mileage";
      
    } else if(mileage > 50000) {
      mileageStatus = "High Mileage";
    }
      return mileageStatus;
      
      /*
      For example the value of mileage is 20,000. We will return
      "Moderate Mileage".
      */
  }

}