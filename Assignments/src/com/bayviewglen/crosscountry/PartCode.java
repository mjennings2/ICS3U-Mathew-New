/*
 * Name: Mathew Jennings
 * Course: ICS3U
 * Title: Cross Country Assignment
 * Description: Program in which name and times are inputed and the splits are calculated and displayed as a chart. At the end of the program all the times are displayed in a chart.  
 * Due Date: October 31st 2014
 * 
 */
package com.bayviewglen.crosscountry;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PartCode {
	// Marker says: you are not using the correct naming convention.  It should be ALL_UPPER_CASE
	public static final int secondsamin = 60;

	public static void main(String[] args) {
		DecimalFormat formatter = new DecimalFormat("00.000");

		Scanner keyboard = new Scanner(System.in);

		// Person One
		// Grab full name convert to just first name
		System.out.println("Please enter the 1st runner's First and Last name, with one space inbetween:");
		String name = keyboard.nextLine();
		String firstName = name.substring(0, name.indexOf(' '));

		System.out.println("Please enter " + firstName + "'s " + "time from the start to the end of the first mile (MM:SS.SSS):");
		String mile1 = keyboard.nextLine();

		// Grab time from start to mile one convert from string and all into
		// seconds
		double min = Integer.parseInt(mile1.substring(0, mile1.indexOf(':')));
		double minASec = min * secondsamin;
		double seconds = Double.parseDouble(mile1.substring(mile1.indexOf(':') + 1));
		double totalSecondsMile1 = seconds + minASec;

		// Grab time from start to mile two convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName + "'s time" + " form the start to the end of the second mile:");
		String mile2 = keyboard.nextLine();
		double min1 = Integer.parseInt(mile2.substring(0, mile2.indexOf(':')));
		double minASec1 = min1 * secondsamin;
		double seconds1 = Double.parseDouble(mile2.substring(mile2.indexOf(':') + 1));
		double totalSecondsMile2 = seconds1 + minASec1;

		// Grab time from start to end and convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName + "'s time " + "to complete the entire race:");
		String mile5 = keyboard.nextLine();
		double min2 = Integer.parseInt(mile5.substring(0, mile5.indexOf(':')));
		double minInSec2 = min2 * secondsamin;
		double seconds2 = Double.parseDouble(mile5.substring(mile5.indexOf(':') + 1));
		double totalSecondsMile5 = seconds2 + minInSec2;

		// Find out times of 2nd and 3rd split, convert to Strings
		double totalSecondsSplit2 = totalSecondsMile2 - totalSecondsMile1;
		double totalSecondsSplit3 = totalSecondsMile5 - totalSecondsMile2;
		double allInMin = (totalSecondsSplit2 / secondsamin);
		int justMin = (int) allInMin;
		double secondsOnly = ((allInMin - justMin) * secondsamin);
		double secondsRounded = Double.parseDouble(formatter.format(secondsOnly));

		String split2Total = justMin + ":" + secondsRounded;
		allInMin = (totalSecondsSplit3 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split3Total = justMin + ":" + secondsRounded;

		// Display info
		System.out.println("Summary of Runner\n-----------------\n Name: " + name + "\nSplit One: " + mile1 + "\nSplit Two: " + split2Total + "\nSplit Three " + split3Total + "\nTotal Time: " + mile5 + "\n");

		// Person Two
		// Grab full name2 convert to just first name2
		System.out.println("Please enter the 2nd runner's First and Last name, with one space inbetween:");
		String name2 = keyboard.nextLine();

		String firstName2 = name2.substring(0, name2.indexOf(' '));

		// Grab time from start to mile one convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName2 + "'s " + "time from the start to the end of the first mile (MM:SS.SSS):");
		String mile12 = keyboard.nextLine();

		min = Integer.parseInt(mile12.substring(0, mile12.indexOf(':')));
		minASec = min * secondsamin;
		seconds = Double.parseDouble(mile12.substring(mile12.indexOf(':') + 1));
		double totalSecondsMile12 = seconds + minASec;

		// Grab time from start to mile two convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName2 + "'s time" + " form the start to the end of the second mile:");
		mile2 = keyboard.nextLine();
		min1 = Integer.parseInt(mile2.substring(0, mile2.indexOf(':')));
		minASec1 = min1 * secondsamin;
		seconds1 = Double.parseDouble(mile2.substring(mile2.indexOf(':') + 1));
		totalSecondsMile2 = seconds1 + minASec1;

		// Grab time from start to end and convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName2 + "'s time " + "to complete the entire race:");
		String mile52 = keyboard.nextLine();

		min2 = Integer.parseInt(mile52.substring(0, mile52.indexOf(':')));
		minInSec2 = min2 * secondsamin;
		seconds2 = Double.parseDouble(mile52.substring(mile52.indexOf(':') + 1));
		totalSecondsMile5 = seconds2 + minInSec2;

		// Find out times of 2nd and 3rd split, convert to Strings
		totalSecondsSplit2 = totalSecondsMile2 - totalSecondsMile12;
		totalSecondsSplit3 = totalSecondsMile5 - totalSecondsMile2;
		allInMin = (totalSecondsSplit2 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split2Total2 = justMin + ":" + secondsRounded;
		allInMin = (totalSecondsSplit3 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split3Total2 = justMin + ":" + secondsRounded;

		// Display info
		System.out.println("Summary of Runner\n-----------------\n Name: " + name2 + "\nSplit One: " + mile12 + "\nSplit Two: " + split2Total2 + "\nSplit Thr ee " + split3Total2 + "\nTotal Time: " + mile52 + "\n");

		// Person Three
		// Grab full name3 convert to just first name3
		System.out.println("Please enter the 3rd runner's First and Last name, with one space inbetween:");
		String name3 = keyboard.nextLine();

		String firstName3 = name3.substring(0, name3.indexOf(' '));

		System.out.println("Please enter " + firstName3 + "'s " + "time from the start to the end of the first mile (MM:SS.SSS):");
		String mile13 = keyboard.nextLine();

		min = Integer.parseInt(mile13.substring(0, mile13.indexOf(':')));
		minASec = min * secondsamin;
		seconds = Double.parseDouble(mile13.substring(mile13.indexOf(':') + 1));
		double totalSecondsMile13 = seconds + minASec;

		// Grab time from start to mile one convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName3 + "'s time" + " form the start to the end of the second mile:");
		mile2 = keyboard.nextLine();
		min1 = Integer.parseInt(mile2.substring(0, mile2.indexOf(':')));
		minASec1 = min1 * secondsamin;
		seconds1 = Double.parseDouble(mile2.substring(mile2.indexOf(':') + 1));
		totalSecondsMile2 = seconds1 + minASec1;

		// Grab time from start to mile two convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName3 + "'s time " + "to complete the entire race:");
		String mile53 = keyboard.nextLine();

		// Grab time from start to end and convert from string and all into
		// seconds
		min2 = Integer.parseInt(mile53.substring(0, mile53.indexOf(':')));
		minInSec2 = min2 * secondsamin;
		seconds2 = Double.parseDouble(mile53.substring(mile53.indexOf(':') + 1));
		totalSecondsMile5 = seconds2 + minInSec2;

		// Find out times of 2nd and 3rd split, convert to Strings
		totalSecondsSplit2 = totalSecondsMile2 - totalSecondsMile13;
		totalSecondsSplit3 = totalSecondsMile5 - totalSecondsMile2;
		allInMin = (totalSecondsSplit2 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split2Total3 = justMin + ":" + secondsRounded;
		allInMin = (totalSecondsSplit3 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split3Total3 = justMin + ":" + secondsRounded;

		// Display info
		System.out.println("Summary of Runner\n-----------------\n Name: " + name3 + "\nSplit One: " + mile13 + "\nSplit Two: " + split2Total3 + "\nSplit Three " + split3Total3 + "\nTotal Time: " + mile53 + "\n");

		// Person Four
		// Grab full name4 convert to just first name4
		System.out.println("Please enter the 4th runner's First and Last name, with one space inbetween:");
		String name4 = keyboard.nextLine();
		String firstName4 = name4.substring(0, name4.indexOf(' '));

		System.out.println("Please enter " + firstName4 + "'s " + "time from the start to the end of the first mile (MM:SS.SSS):");
		String mile14 = keyboard.nextLine();

		// Grab time from start to mile one convert from string and all into
		// seconds
		min = Integer.parseInt(mile14.substring(0, mile14.indexOf(':')));
		minASec = min * secondsamin;
		seconds = Double.parseDouble(mile14.substring(mile14.indexOf(':') + 1));
		double totalSecondsMile14 = seconds + minASec;

		// grab time from start to mile two convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName4 + "'s time" + " form the start to the end of the second mile:");
		mile2 = keyboard.nextLine();
		min1 = Integer.parseInt(mile2.substring(0, mile2.indexOf(':')));
		minASec1 = min1 * secondsamin;
		seconds1 = Double.parseDouble(mile2.substring(mile2.indexOf(':') + 1));
		totalSecondsMile2 = seconds1 + minASec1;

		// Grab time from start to end and convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName4 + "'s time " + "to complete the entire race:");
		String mile54 = keyboard.nextLine();

		min2 = Integer.parseInt(mile54.substring(0, mile54.indexOf(':')));
		minInSec2 = min2 * secondsamin;
		seconds2 = Double.parseDouble(mile54.substring(mile54.indexOf(':') + 1));
		totalSecondsMile5 = seconds2 + minInSec2;

		// Find out times of 2nd and 3rd split, convert to Strings
		totalSecondsSplit2 = totalSecondsMile2 - totalSecondsMile14;
		totalSecondsSplit3 = totalSecondsMile5 - totalSecondsMile2;
		allInMin = (totalSecondsSplit2 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split2Total4 = justMin + ":" + secondsRounded;
		allInMin = (totalSecondsSplit3 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split3Total4 = justMin + ":" + secondsRounded;

		// Display info
		System.out.println("Summary of Runner\n-----------------\n Name: " + name4 + "\nSplit One: " + mile14 + "\nSplit Two: " + split2Total4 + "\nSplit Three " + split3Total4 + "\nTotal Time: " + mile54 + "\n");

		// Person Five
		// Grab full name5 convert to just first name5
		System.out.println("Please enter the 5th runner's First and Last name, with one space inbetween:");
		String name5 = keyboard.nextLine();
		String firstName5 = name5.substring(0, name5.indexOf(' '));

		// Grab time from start to mile one convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName5 + "'s " + "time from the start to the end of the first mile (MM:SS.SSS):");
		String mile15 = keyboard.nextLine();
		min = Integer.parseInt(mile15.substring(0, mile15.indexOf(':')));
		minASec = min * secondsamin;
		seconds = Double.parseDouble(mile15.substring(mile15.indexOf(':') + 1));
		double totalSecondsMile15 = seconds + minASec;

		// Grab time from start to mile two convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName5 + "'s time" + " form the start to the end of the second mile:");
		mile2 = keyboard.nextLine();
		min1 = Integer.parseInt(mile2.substring(0, mile2.indexOf(':')));
		minASec1 = min1 * secondsamin;
		seconds1 = Double.parseDouble(mile2.substring(mile2.indexOf(':') + 1));
		totalSecondsMile2 = seconds1 + minASec1;

		// Grab time from start to end and convert from string and all into
		// seconds
		System.out.println("Please enter " + firstName5 + "'s time " + "to complete the entire race:");
		String mile55 = keyboard.nextLine();
		min2 = Integer.parseInt(mile55.substring(0, mile55.indexOf(':')));
		minInSec2 = min2 * secondsamin;
		seconds2 = Double.parseDouble(mile55.substring(mile55.indexOf(':') + 1));
		totalSecondsMile5 = seconds2 + minInSec2;

		// Find out times of 2nd and 3rd split, convert to Strings
		totalSecondsSplit2 = totalSecondsMile2 - totalSecondsMile15;
		totalSecondsSplit3 = totalSecondsMile5 - totalSecondsMile2;
		allInMin = (totalSecondsSplit2 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split2Total5 = justMin + ":" + secondsRounded;
		allInMin = (totalSecondsSplit3 / secondsamin);
		justMin = (int) allInMin;
		secondsOnly = ((allInMin - justMin) * secondsamin);
		secondsRounded = Double.parseDouble(formatter.format(secondsOnly));
		String split3Total5 = justMin + ":" + secondsRounded;

		// Display info
		System.out.println("Summary of Runner\n-----------------\n Name: " + name5 + "\nSplit One: " + mile15 + "\nSplit Two: " + split2Total5 + "\nSplit Three " + split3Total5 + "\nTotal Time: " + mile55 + "\n");

		// Now for the chart
		System.out.println("Summary of all runners:\n-----------------------");
		System.out.printf("%15s%15s%15s%15s%15s\n", "Name", "Split One", "Split Two", "Split Three", "Entire Race");
		System.out.printf("%15s%15s%15s%15s%15s\n", name, mile1, split2Total, split3Total, mile5);
		System.out.printf("%15s%15s%15s%15s%15s\n", name2, mile12, split2Total2, split3Total2, mile52);
		System.out.printf("%15s%15s%15s%15s%15s\n", name3, mile13, split2Total3, split3Total3, mile53);
		System.out.printf("%15s%15s%15s%15s%15s\n", name4, mile14, split2Total4, split3Total4, mile54);
		System.out.printf("%15s%15s%15s%15s%15s\n", name5, mile15, split2Total5, split3Total5, mile55);

		keyboard.close();
	}
}
