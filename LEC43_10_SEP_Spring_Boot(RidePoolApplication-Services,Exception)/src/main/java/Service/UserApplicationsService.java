package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Companies;
import Entity.UserApplications;


public interface UserApplicationsService {
		
	public void registerMotorist(UserApplications user);
	
	public List<UserApplications> getAllUsers();
	
	public Optional<UserApplications> getApplicationById(Integer userId);
	
	public List<UserApplications> getPendingApplications();
	
	public void approveApplication(Integer userId, Integer securityHeadId);
	
	public void rejectApplication(Integer userId , Integer securityHeadId);

}
