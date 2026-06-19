public class BusPassSystem {

	    public static void main(String[] args) {

	        String name = "Pallavi";
	        int age = 20;
	        String source = "Vijayawada";
	        String destination = "Hyderabad";

	        double price =
	                TicketPrice.calculatePrice(source, destination);

	        BusPass pass =
	                new BusPass(name, age, source, destination, price);

	        CloudStorage.saveTicket(pass);

	        System.out.println("\n******** BUS PASS********");
	        System.out.println("Passenger Name : " + pass.name);
	        System.out.println("Age            : " + pass.age);
	        System.out.println("From           : " + pass.source);
	        System.out.println("To             : " + pass.destination);
	        System.out.println("Price          : ₹" + pass.price);

	        System.out.println("\nBooking Successful");
	    }
	}

