package karacan.hrms.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import karacan.hrms.business.abstracts.JobService;
import karacan.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

	private JobService jobservice;
	
	@Autowired
	public JobsController(JobService jobservice) {
		super();
		this.jobservice = jobservice;
	}
	
	@GetMapping("/getall")
	List<Job> getAll(){
		return this.jobservice.getAll();
	}
}
