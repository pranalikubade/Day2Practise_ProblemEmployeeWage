import java.util.Random;

public class EmployeeWageComputation {
    
    private static final int WAGE_PER_HOUR = 20;
    private static final int FULL_DAY_HOUR = 8;
    private static final int PART_TIME_HOUR = 4;
    private static final int MAX_WORKING_DAYS = 20;
    private static final int MAX_WORKING_HOURS = 100;
    
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;
        
        while (totalWorkingDays < MAX_WORKING_DAYS && totalWorkingHours < MAX_WORKING_HOURS) {
            int empCheck = new Random().nextInt(2);
            int empHour = 0;
            String empType = "";
            
            switch (empCheck) {
                case 0:
                    empType = "Absent";
                    break;
                    
                case 1:
                    empType = "Present";
                    int empTypeCheck = new Random().nextInt(2);
                    
                    switch (empTypeCheck) {
                        case 0:
                            empType += "-FullTime";
                            empHour = FULL_DAY_HOUR;
                            break;
                            
                        case 1:
                            empType += "-PartTime";
                            empHour = PART_TIME_HOUR;
                            break;
                    }
                    
                    break;
            }
            
            System.out.println("Employee is " + empType);
            
            int dailyWage = WAGE_PER_HOUR * empHour;
            totalWage += dailyWage;
            
            totalWorkingDays++;
            totalWorkingHours += empHour;
        }
        
        System.out.println("Total working days: " + totalWorkingDays);
        System.out.println("Total working hours: " + totalWorkingHours);
        System.out.println("Total wage for the month: " + totalWage);
    }
}
