/*
 * MeanMedianRange.java Version#1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input
 * Output
 * 04 May 2022
 */
 
 import java.util.Scanner;
 import java.io.File;
 import java.io.IOException;

 // Start MeanMedianRange
 public class MeanMedianRange {

     // Path to file
     static final String FILEPATH = "Documents/GitHub/MeanMedianRangeJava/src";

     // Start PSV Main
     public static void main(String[] args) {
         
        // Variables to control the disk file
        Scanner infile;          // Input file object
        String fileName;         // Name of the file
        int recordCount = 0;     // Number of records (lines) in the file
        int recordsToSkip = 0;   // Used when computing the median

        // Variables for fields of each record in the file
        String lineFromFile;     // Used when reading a line at a time from file
        int acctNo = 0;          // Acct number from a record in the file
        String customer = "";    // Customer name from a record in the file
        double acctBal = 0.0;    // Acct balance from a record in the file

        // Variables used to determine the mean and median
        double total = 0;        // Used when computing the mean
        double mean = 0;         // Mean (average) of all acct balances
        double median = 0;       // Median value of acct balances

        // Create the Scanner objects for the keyboard and disk access
        Scanner stdin = new Scanner(System.in);

        // Get just the name of the file from the keyboard
        // Build the path name and file name
        // Identify the folder where the file is located
        // The USer name is in the environment variable USER on my machine (Mac)
        System.out.printf ("Enter the name of the data file: ");
        fileName = stdin.nextLine();                   // Read the file name from stdin
        String loginID = System.getenv("USER");   // This machine is Mac
        // If Windows change to USERNAME
        if (loginID == null) loginID = System.getenv("USERNAME");
        
        // Create full path name
        String balancesFileName = "/Users/" + loginID + "/" + FILEPATH + "/" + fileName;
        
        // Attepmt to open file
        try {
            // PART 1. Count the number of records in the file
            //         Determine the mean when you know the 
            //         record count and the total of all balances

            // Declare infile Scanner
            infile = new Scanner(new File(balancesFileName));

            // While data is still in file
            while (infile.hasNextInt()) {
                acctNo = infile.nextInt();       // Read int for account number
                customer = infile.next();        // Read String customer name
                acctBal = infile.nextDouble();   // Read double for account balance
                total += acctBal;                // Add each acctBal to total
                recordCount++;                   // Update count
            }   // End of while

            // Close file
            infile.close();
            // Print data about file
            System.out.printf ("%d Records in %s\n", recordCount, fileName);

            // Compute mean
            mean = total / recordCount;
        }   // End of Try
        catch (IOException ioe) {

        }   // End of cath


     }   // End of PSV Main
 }   // End of MeanMedianRange
