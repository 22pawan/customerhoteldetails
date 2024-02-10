import java.util.Scanner;

class Room {
    protected int roomNumber;
    protected int floorNumber;

    public Room(int roomNumber, int floorNumber) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
class CustomerDetails extends Room {
    private String name;
    private String dateOfJoining;
    public CustomerDetails(String name, String dateOfJoining, int roomNumber, int floorNumber) {
        super(roomNumber, floorNumber);
        this.name = name;
        this.dateOfJoining = dateOfJoining;
    }
   public String getName() {
        return name;
    }
    public String getDateOfJoining() {
        return dateOfJoining;
    }
    public void displayDetails() {
        System.out.println("\nCustomer Details:");
        System.out.println("Name: " + name);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Floor Number: " + getFloorNumber());
    }
}
public class hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the customer: ");
        String name = scanner.nextLine();

        System.out.print("Enter the date of joining (YYYY-MM-DD): ");
        String dateOfJoining = scanner.next();

        System.out.print("Enter the room number: ");
        int roomNumber = scanner.nextInt();

        System.out.print("Enter the floor number: ");
        int floorNumber = scanner.nextInt();
        CustomerDetails customer = new CustomerDetails(name, dateOfJoining, roomNumber, floorNumber);
        customer.displayDetails();
        scanner.close();
    }
}
