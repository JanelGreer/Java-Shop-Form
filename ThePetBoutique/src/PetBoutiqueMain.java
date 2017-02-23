import java.util.*;

public class PetBoutiqueMain {

		
		public static void main(String[] args) 
		{
			//Declare variables
			String customerName;
			String address;
			int phone;
			String emailAddress;
			String petName;
			String petType;
			double petAge;
			double petWeight;
			double service;
			double medication; 

			//Scanner
			Scanner input = new Scanner(System.in);
			Customer cust1 = new Customer();
			Pet pet1 = new Pet();
			ServiceQuote quote1 = new ServiceQuote();
			
			//Get Information
			System.out.println("Enter the customer's name:");
			customerName = input.nextLine();
			cust1.setName(customerName);
			
			System.out.println("Enter the customer's address:");
			address = input.nextLine();
			cust1.setAddress(address);
			
			System.out.println("Enter the customer's phone number:");
			phone = input.nextInt();
			cust1.setPhone(phone);
			
			//Start customer if statement
			if (phone <= 0)
			{
				System.out.println("Incorrect Entry.");
				System.out.println("Please enter a number greater than zero.");
				phone = input.nextInt();
				cust1.setPhone(phone);
			}
			
			input.nextLine();
			System.out.println("Enter the customer's email address:");
			emailAddress = input.nextLine();
			cust1.setEmailAddress(emailAddress);
			
			
			System.out.println("Enter the pet's name:");
			petName = input.nextLine();
			pet1.setPetName(petName);
			
			System.out.println("Enter the pet's type:");
			petType = input.nextLine();
			pet1.setPetType(petType);
			
			System.out.println("Enter the pet's age:");
			petAge = input.nextDouble();
			pet1.setPetAge(petAge);
			
			//Start pet if statements
			if (petAge <= 0)
			{
				System.out.println("Incorrect Entry.");
				System.out.println("Please enter a number greater than zero.");
				petAge = input.nextDouble();
				pet1.setPetAge(petAge);
			}
			
			input.nextLine();
			System.out.println("Enter the pet's weight:");
			petWeight = input.nextDouble();
			pet1.setPetWeight(petWeight);
			
			if (petWeight <= 0)
			{
				System.out.println("Incorrect Entry.");
				System.out.println("Please enter a number greater than zero.");
				petWeight = input.nextDouble();
				pet1.setPetWeight(petWeight);
			}
			
			input.nextLine();
			System.out.println("Enter the service charge:");
			service = input.nextDouble();
			quote1.setService(service);
			
			if (service <= 0)
			{
				System.out.println("Incorrect Entry.");
				System.out.println("Please enter a number greater than zero.");
				service = input.nextDouble();
				quote1.setService(service);
			}
			
			input.nextLine();
			System.out.println("Enter the medication charge:");
			medication = input.nextDouble();
			quote1.setMedication(medication);
			
			if (medication <= 0)
			{
				System.out.println("Incorrect Entry.");
				System.out.println("Please enter a number greater than zero.");
				medication = input.nextDouble();
				quote1.setMedication(medication);
			}
			
			//Print
			System.out.println("********The Pet Boutique********");
			System.out.println("Customer Name:             " + cust1.getCustomerName());
			System.out.println("Customer Address:          " + cust1.getAddress());
			System.out.println("Customer Phone:            " + cust1.getPhone());
			System.out.println("Customer Email Address:    " + cust1.getEmailAddress());
			System.out.println("-------------------------------");
			System.out.println("Pet Name:                  " + pet1.getPetName());
			System.out.println("Pet Type:                  " + pet1.getPetType());
			System.out.println("Pet Age:                   " + pet1.getPetAge());
			System.out.println("Pet Weight:                " + pet1.getPetWeight());
			System.out.println("-------------------------------");
			System.out.printf("Service Charge:            $%,.2f\n", quote1.getService());
			System.out.printf("Medication Charge:         $%,.2f\n", quote1.getMedication());
			System.out.printf("Sales Tax:                 $%,.2f\n", quote1.getTaxAmount());
			System.out.printf("Total Charge:              $%,.2f\n", quote1.getTotal());
			

	}

}
