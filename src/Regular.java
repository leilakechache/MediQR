import java.util.ArrayList;

public class Regular extends User{

	private String bloodType;
	private int height;
	private int weight;
	private ArrayList<String> allergies;
	
	public Regular(String firstName, String lastName, String username, String password, String email, String job, String company) {
		super(firstName, lastName, username, password, email);
		this.bloodType = "None";
		this.height = 0;
		this.weight = 0;
		this.allergies = new ArrayList<>();
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public ArrayList<String> getAllergies() {
		return allergies;
	}

	public void setAllergies(ArrayList<String> allergies) {
		this.allergies = allergies;
	}


	

}