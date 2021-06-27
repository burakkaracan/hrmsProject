package karacan.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import karacan.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job,Integer>{

}
