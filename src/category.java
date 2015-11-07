/**
 * Created by Claude on 11/7/2015.
 */

import java.util.Scanner;
public class category {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the category: ");
        int category = scanner.nextInt();

        if (category == 1) {
            System.out.println("The wind speed is between 74 - 95 MPH");
        }

        if (category == 2) {
            System.out.println("The wind speed is between 96 - 110 MPH");
        }

        if (category == 3) {
            System.out.println("The wind speed is between 111 - 129 MPH");
        }

        if (category == 4) {
            System.out.println("The wind speed is between 130 - 156 MPH");
        }

        if (category == 5) {
            System.out.println("The wind speed is between 131 - 157 MPH");

        }


    }
}



