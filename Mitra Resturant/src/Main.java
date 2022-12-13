
import java.util.Scanner;

public class Main {

    protected static String user, pass;

    public static void main(String[] args) {
        Management f = new Management();
        Order_FastFood fastfood = new Order_FastFood();
        Order_HotBeverages ohb = new Order_HotBeverages();
        Order_ColdBeverages c=new Order_ColdBeverages();
        Scanner sc = new Scanner(System.in);
        String setname = "Binty";
        String setpass = "1234";
        System.out.println("******************************************************");
        System.out.println(">>>Please enter your username & password to log in<<<");
        System.out.println("******************************************************");
        System.out.print("\t\tEnter User name : ");
        user = sc.nextLine();
        System.out.print("\t\tEnter Password : ");
        pass = sc.nextLine();
        if (user.equals(setname) && pass.equals(setpass)) {
            System.out.println("*******************************************");
            System.out.println("\t WelCome to Mitra Resturant");
            System.out.println("*******************************************\n");
            boolean repeat = true;
            while (repeat) {
                System.out.println("*******************************************");
                System.out.println("\tSelect your option ");
                System.out.println("\t1. Employee Management");
                System.out.println("\t2. Fast Food");
                System.out.println("\t3. Hot Beverages");
                System.out.println("\t4.Cold Beverages");
                
                System.out.println("*******************************************");
                System.out.print("Eneter you choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("\n\n\n****************************************");
                        System.out.println("\tYou have chose Employee Management");
                        System.out.println("******************************************");
                        System.out.println("\tSelect your option ");
                        System.out.println("");
                        System.out.println("\t1. Insert New Employee");
                        System.out.println("\t2. Remove Existing Employee");
                        System.out.println("\t3. Show All Employees");
                        System.out.println("\t4. Search a Employee");
                        System.out.println("\t5. Go Back");
                        System.out.println("******************************************");
                        System.out.print("Eneter you choice: ");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1:
                                System.out.println("\n\n=============================================\n\n");
                                System.out.println("*******************************************");
                                System.out.println("\tYou have chose to Insert New Employee");
                                System.out.println("*******************************************");
                                System.out.print("Employee  ID : ");
                                String empId1 = sc.next();
                                System.out.print("Employee Name : ");
                                String name1 = sc.next();
                                System.out.print("Employee Salary : ");
                                double salary1 = sc.nextDouble();
                                Employee e1 = new Employee(empId1, name1, salary1);
                                if (f.insertEmployee(e1)) {
                                    System.out.println("Employee Inserted Successfully.");
                                    System.out.print("Name " + name1 + ",  Id " + empId1);
                                } else {
                                    System.out.println("Employee can not be created now. Try again later");
                                }
                                System.out.println("\n\n================================================\n\n");
                                break;
                            case 2:
                                System.out.println("\n\n===============================================\n\n");
                                System.out.println("*******************************************");
                                System.out.println("You have chose to Remove Employee");
                                System.out.println("*******************************************");
                                System.out.print("Employee  ID: ");
                                String empId2 = sc.next();
                                Employee e2 = f.searchEmployee(empId2);
                                System.out.println("Are You sure you want to delete this Employee? ");
                                System.out.print("To Delete Employee press-1: ");
                                int delete = sc.nextInt();
                                if (delete == 1) {
                                    if (e2 != null) {
                                        if (f.removeEmployee(e2)) {
                                            System.out.println("Employee ID " + empId2 + " Removed Successfully.");
                                        } else {
                                            System.out.println("Employee can not be removed now. Try again later");
                                        }
                                    } else {
                                        System.out.println("No Employee found.");
                                    }
                                } else {
                                    System.out.println("Account is not deleted. Thanks for come back");
                                }
                                System.out.println("\n\n=================================================\n\n");
                                break;
                            case 3:
                                System.out.println("\n\n=================================================\n\n");
                                System.out.println("*******************************************");
                                System.out.println("\tYou have chose to Show All Employee");
                                System.out.println("*******************************************");
                                f.showAllEmployees();
                                System.out.println("\n\n=================================================\n\n");
                                break;
                            case 4:
                                System.out.println("\n\n=================================================\n\n");
                                System.out.println("*******************************************");
                                System.out.println("\tYou have chose to Search Employee");
                                System.out.println("*******************************************");
                                System.out.print("Employee  ID: ");
                                String empId4 = sc.next();
                                Employee e4 = f.searchEmployee(empId4);
                                if (e4 != null) {
                                    System.out.println("\n\n*******************************************\n");
                                    System.out.println("Employee has been founded.");
                                    System.out.println("Employee ID : " + e4.getEmpId());
                                    System.out.println("Employee Name : " + e4.getName());
                                    System.out.println("Employee Salary : " + e4.getSalary());
                                    System.out.println("\n**********************************************\n");
                                } else {
                                    System.out.println("No Employee found.");
                                }
                                System.out.println("\n\n=================================================\n\n");
                                break;
                            case 5:
                                System.out.println("\n\n=================================================\n\n");
                                System.out.println("*******************************************");
                                System.out.println("\t   Back to the main menu...............");
                                System.out.println("*******************************************");
                                System.out.println("\n\n=================================================\n\n");
                                break;
                            default:
                                System.out.println("\n\n=================================================\n\n");
                                System.out.println("*******************************************");
                                System.out.println("\tInvalid option. Try again...............");
                                System.out.println("*******************************************");
                                System.out.println("\n\n=================================================\n\n");
                                break;
                        }
                        break;
                    case 2:
                        fastfood.order();
                        break;
                    case 3:
                        ohb.order_HotBeverages();
                    case 4:
                        c.order_coldBeverage();
                }
            }

        } else {
            System.out.println("Incorrect Username or Password ! Try again");
        }
    }
}
