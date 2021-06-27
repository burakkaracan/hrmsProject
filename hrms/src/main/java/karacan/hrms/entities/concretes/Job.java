package karacan.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Job {
	
	@Id
	@GeneratedValue
	@Column(name="job_Id")
	private int id;
	
	@Column(name="job_Title")
	private String jobTitle;
	
	public Job(int id, String jobTitle) {
		super();
		this.id = id;
		this.jobTitle = jobTitle;
	}
	
	public Job() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
}
