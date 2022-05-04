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
     static final String FILEPATH = "src";

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

     }   // End of PSV Main
 }   // End of MeanMedianRange
