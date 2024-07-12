public class Main {
    public static void main(String[] args) {
        /*
        Here, we're creating an object called car1. The value of its
        instance variables is as follows: 
        
        make = "Honda"
        model = "Civic"
        year = 2018
        mileage = 20000
        
        To access these values later, we'll use getter methods
        
        car1.getVariableName();
        
        If we want to access the value of variable make of object car1: 
        
        car1.getMake();
        */
        Car car1 = new Car("Honda", "Civic", 2018, 20000);
        
        /*
        On the other hand, we're creating an object called car2. 
        The value of its instance variables is as follows: 
        
        make = "Ford"
        model = "Focus"
        year = 2018
        mileage = 18000
        
        To access these values later, we'll use getter methods
        
        car1.getVariableName();
        
        If we want to access the value of variable model of object car1: 
        
        car1.getModel();
        */
        Car car2 = new Car("Ford", "Focus", 2018, 18000);
        
        System.out.println("Car Management System");
        System.out.println();
        
        System.out.println("Car 1 Details");
        /*
        We'll retrieve the value of instance variables of an object 
        called car1 using getter methods
        */
        System.out.println("Make: " + car1.getMake());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Year: " + car1.getYear());
        System.out.println("Mileage: " + car1.getMileage());
        /* 
        We'll check the mileage status of car1 using the object 
        method called checkOdometer
        */
        System.out.println("Mileage Status: " + car1.checkOdometer());
        System.out.println();
        
        System.out.println("Car 2 Details");
        /*
        We'll retrieve the value of instance variables of an object 
        called car2 using getter methods
        */
        System.out.println("Make: " + car2.getMake());
        System.out.println("Model: " + car2.getModel());
        System.out.println("Year: " + car2.getYear());
        System.out.println("Mileage: " + car2.getMileage());
        /* 
        We'll check the mileage status of car2 using the object 
        method called checkOdometer
        */
        System.out.println("Mileage Status: " + car2.checkOdometer());
        System.out.println();
        
        System.out.println("Updated Mileage");
        /*
        To get the new mileage of car 1, we'll use the object method
        called drive. There, we'll add 55000 to the initial value of
        mileage variable which is 20000.
        
        20000 + 55000 = 75000
        */
        System.out.println("Car 1 New Mileage: " + car1.drive(55000));
        /*
        To check the new mileage of car 1, we'll call the object method 
        called checkOdometer.
        
        Since the new mileage of car 1 is 75000, its mileage status
        will be updated to High Mileage.
        */
        System.out.println("Mileage Status: " + car1.checkOdometer());
        /*
        To get the new mileage of car 2, we'll use the object method
        called drive. There, we'll add 200 to the initial value of
        mileage variable which is 18000.
        
        18000 + 200 = 18200
        */
        System.out.println("Car 2 New Mileage: " + car2.drive(200));
        /*
        To check the new mileage of car 1, we'll call the object method 
        called checkOdometer.
        
        The new mileage of car 2 is 18200, its mileage status
        will remain to Moderate Mileage.
        */
        System.out.println("Mileage Status: " + car2.checkOdometer());
    }
} 