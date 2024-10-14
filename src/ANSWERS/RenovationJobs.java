package ANSWERS;

// Main class for renovation jobs
public class RenovationJobs 
{
    public static void main(String[] args) 
    {
        // Array of month abbreviations
        final String[] MONTHS = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int nums = MONTHS.length; // Number of months
        
        // 2D array of renovation counts for each month
        int rooms[][] = 
        {
            {8, 2, 5},
            {7, 4, 5},
            {5, 5, 2},
            {2, 2, 3},
            {7, 7, 9},
            {7, 8, 5}
        };
        
        // Print report header
        System.out.println("----------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("----------------------------------------------------------");
        System.out.println("\t\tBathrooms \tKitchens \tGarden");
        
        // Loop to print renovation details per month
        for (int i = 0; i < nums; i++) 
        {
            System.out.printf("%-5s \t\t%-9d \t%-9d \t%-6d%n", MONTHS[i], rooms[i][0], rooms[i][1], rooms[i][2]);
        }
        
        // Array to hold total renovations per month
        int totalPerMonth[] = new int[nums];
        
        // Calculate totals for each month
        for (int i = 0; i < nums; i++)
        {
            totalPerMonth[i] = rooms[i][0] + rooms[i][1] + rooms[i][2];
        }
        
        // Print monthly totals header
        System.out.println("----------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("----------------------------------------------------------");
        
        // Loop to print total renovations per month
        for (int i = 0; i < nums; i++)
        {
            if (totalPerMonth[i] >= 15) // Highlight totals of 15 or more
            {
                System.out.println(MONTHS[i] + " \t\t" + totalPerMonth[i] + "\t***");
            }
            else
            {
                System.out.println(MONTHS[i] + " \t\t" + totalPerMonth[i]);
            }
        }
        
        // Print report footer
        System.out.println("----------------------------------------------------------");
    }
}
