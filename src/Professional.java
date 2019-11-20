
public class Professional extends User{

	private String job;
	private String company;
	
	public Professional(String firstName, String lastName, String username, String password, String email, String job, String company) {
		super(firstName, lastName, username, password, email);
		this.job = job;
		this.company = company;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
