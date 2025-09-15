package Service;

import java.util.List;

import org.springframework.stereotype.Service;

import Entity.Companies;


public interface CompaniesService {
	
	public List<Companies> getAllCompanies();
}
