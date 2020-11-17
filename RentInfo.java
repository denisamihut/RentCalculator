package L6;


	public class RentInfo {
		public final static int RENT_PER_HOUR=40;
		public final static int RENT_SUPLIMENTARY_MINUTE=1;
		private String contractNumber;
		private int hours;
		private int minutes;
		private int price;
		private int pricePerHour;
		private int pricePerMinute;

		public void setContractNumber(String newContractNumber) {
			this.contractNumber = newContractNumber;	
		}  
		public void setHours(int newHours) {
			this.hours = newHours;
			pricePerHour=hours*RENT_PER_HOUR;

		}
		public void setMinutes(int newMinutes) {
			this.minutes = newMinutes;
			pricePerMinute=minutes*RENT_SUPLIMENTARY_MINUTE;
		}
		
		public String getContractNumber() {
			return contractNumber;
		}
		
		public int getHours() {
			return hours;
		}
		public int getMinutes() {
			return minutes;
		}

		public int getPricePerHour() {
			return pricePerHour;
		}
		public int getPricePerMinute() {
			return pricePerMinute;
		}
		public double getPrice() {
			price=pricePerHour+pricePerMinute;
			return price;
		}
	}

