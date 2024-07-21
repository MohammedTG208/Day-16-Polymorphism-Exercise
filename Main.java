import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        boolean stop=true;
        do {
            System.out.println("Vehicle Rental System: \n" +
                    "1. Rent a Car\n" +
                    "2. Rent a Bike\n" +
                    "3. Rent a Truck\n" +
                    "4. View Rented Vehicles\n" +
                    "5. Exit ");
            System.out.print("Enter your choice: ");
            try {

            if (input.nextInt()>=6){
                System.out.println("try again");
            }else {
                switch (input.nextInt()) {
                    case 1:
                        input.nextLine();
                        System.out.println("Enter Car Model: ");
                        String model = input.nextLine();
                        System.out.println("Enter Rental Days: ");
                        int day = input.nextInt();
                        Vehicle car = new Car(day, model);
                        rentedVehiclesPrint(car);
                        rentedVehicles.add(car);
                        break;
                    case 2:
                        input.nextLine();
                        System.out.println("Enter Bike brand: ");
                        String brand = input.nextLine();
                        System.out.println("Enter Rental hour: ");
                        int hour = input.nextInt();
                        Vehicle bike = new Bike(brand, hour);
                        rentedVehiclesPrint(bike);
                        rentedVehicles.add(bike);
                        break;
                    case 3:
                        input.nextLine();
                        System.out.println("Enter Truck Type: ");
                        String type = input.nextLine();
                        System.out.println("Enter Rental Week: ");
                        int week = input.nextInt();
                        Vehicle truck = new Truck(week, type);
                        rentedVehiclesPrint(truck);
                        rentedVehicles.add(truck);
                        break;
                    case 4:
                        for (int i = 0; i < rentedVehicles.size(); i++) {
                            rentedVehicles.get(i).displayDetails();
                        }
                        break;
                    case 5:
                        System.out.println("Thank you for using the Vehicle Rental System! ");
                        stop = false;
                        break;
                }
            }
            }catch (InputMismatchException e){
                System.out.println( "Enter valid input");
                stop=false;
            }
        }while (stop);
    }
    public static void rentedVehiclesPrint(Vehicle vehicle){
        vehicle.displayDetails();
        System.out.println("\n");
    }
}