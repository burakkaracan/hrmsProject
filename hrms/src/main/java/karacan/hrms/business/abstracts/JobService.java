package karacan.hrms.business.abstracts;

import java.util.List;

import karacan.hrms.entities.concretes.Job;

public interface JobService {
	
	List<Job> getAll();
}
