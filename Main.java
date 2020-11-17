package L6;

import java.util.Scanner;

import Sammys.RentInfo;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		showMotto();		
		RentInfo info = new RentInfo();

		String contractNr =  getContractNumberFromUser();
		info.setContractNumber(contractNr);

		int hr = getHoursFromUser();
		info.setHours(hr);

		int min = getMinutesFromUser();
		info.setMinutes(min);

		showRentInfo(info);
	}

	public static void showRentInfo(RentInfo info) {
		System.out.println("Numar contract: "+info.getContractNumber());
		System.out.println("Pret pe ore: "+info.getPricePerHour());
		System.out.println("Pret pe minute: "+info.getPricePerMinute());
		System.out.println("Pret total: "+info.getPrice());
	}

	public static String getContractNumberFromUser() {
		System.out.println("Introduceti numarul contractului:");
		String contract = scanner.nextLine(); 
		return contract;
	}

	public static int getHoursFromUser() {
		System.out.println("Pentru cate ore inchiriati?:");
		int hr = scanner.nextInt(); 
		return hr;
	}

	public static int getMinutesFromUser() {
		System.out.println("Pentru cate minute inchiriati?:");
		int min = scanner.nextInt(); 
		return min;
	}	

	public static void showMotto() {
		String motto = "MOTTO: „ Sammy’s makes it fun in the sun ”";
		String stars1="***********************************************************";
		String stars2="***********************************************************";

		System.out.println(stars1);
		System.out.println(motto);
		System.out.println(stars2);
	}
}