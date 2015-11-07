/**
 * Created by Claude on 11/7/2015.
 */

import java.util.Scanner;


public class scale {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wind speed: ");
        int wind = sc.nextInt();


        // if statements to figure out category.
        if (74 >= wind) {
            System.out.println("Category 1: Very dangerous winds will produce some damage:\n " +
                    "Well-constructed frame homes could have damage to roof, \n" +
                    "shingles, vinyl siding and gutters.\n " +
                    "Large branches of trees will snap and shallowly rooted trees may be toppled.\n " +
                    "Extensive damage to power lines\n " +
                    "and poles likely will result in power outages that could last a few to several days.\n");
        }

        else if (96 >= wind) {
            System.out.println("Category 2: Extremely dangerous winds will cause extensive damage:\n " +
                    "Well-constructed frame homes could sustain major roof and siding damage.\n " +
                    "Many shallowly rooted trees will be snapped or uprooted and block numerous roads.\n " +
                    "Near-total power loss is expected with outages that could last from several days to weeks.\n");
        }

        else if (110 >= wind) {
            System.out.println("Category 3 (Major): Devastating damage will occur:\n " +
                    "Well-built framed homes may incur major damage or removal of roof decking and gable ends.\n " +
                    "Many trees will be snapped or uprooted, blocking numerous roads.\n " +
                    "Electricity and water will be unavailable for several days to weeks after the storm passes.\n");
        }

        else if (130 >= wind) {
            System.out.println("Category 4 (Major): Catastrophic damage will occur:\n " +
                    "Well-built framed homes can sustain severe damage with loss of most of the roof structure\n " +
                    "and/or some exterior walls.\n " +
                    "Most trees will be snapped or uprooted and power poles downed.\n " +
                    "Fallen trees and power poles will isolate residential areas.\n " +
                    "Power outages will last weeks to possibly months.\n " +
                    "Most of the area will be uninhabitable for weeks or months.\n");
        }

        else if (157 >= wind) {
            System.out.println("Category 5 (Major): Catastrophic damage will occur:\n " +
                    "A high percentage of framed homes will be destroyed, with total roof failure and wall collapse.\n " +
                    "Fallen trees and power poles will isolate residential areas.\n " +
                    "Power outages will last for weeks to possibly months.\n " +
                    "Most of the area will be uninhabitable for weeks or months.\n");

        }else{
                System.out.println("You broke the Hurricane Scale! Hurry! Go to your basement!");
            }
        }

    }
