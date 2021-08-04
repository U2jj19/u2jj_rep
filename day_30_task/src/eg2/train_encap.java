package eg2;

public class train_encap {
	
	
	private int trainno;
	private String traincode;
	private String station;
	private String Arrival;
	private String Departure;
	
	public train_encap (int trainno, String traincode, String station, String arrival, String departure) {
		this.trainno = trainno;
		this.traincode = traincode;
		this.station = station;
		Arrival = arrival;
		Departure = departure;
	}
	public void printStatement() {
		
		System.out.printf("%d %1s %17s %8s %11s\n", trainno,traincode,station,Arrival,Departure);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Patna Ranchi Howarah Jansatabdi Express (02024)\r\n");
		System.out.println("-----------------------------------------------");
		System.out.println(" code    station           Arr.       Dep.");
		System.out.println("-----------------------------------------------");
		train_encap[] transactions = {
				new train_encap(1,"hwh","Howarah Jn","11:00","12:00"),
				new train_encap(2,"dgr","Durgapur Jn","03:45","13:51"),
				new train_encap(3,"asn","Asansol Jn","08:55","19:00"),
				new train_encap(4,"Gaya","Gaya Jn","13:30","1:35"),
				new train_encap(5,"pnbe","patma Jn","21:20","3:40"),
				new train_encap(6,"ran","Ranchi Jn","01:15","23:40")
				};
		for (train_encap transaction : transactions) {
			transaction.printStatement();
		}

	}


}
