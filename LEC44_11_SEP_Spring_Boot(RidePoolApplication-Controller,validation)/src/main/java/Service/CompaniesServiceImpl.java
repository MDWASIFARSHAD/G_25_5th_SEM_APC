package Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Companies;
import Repository.CompaniesRepo;

import java.util.List;

@Service
public class CompaniesServiceImpl implements CompaniesService {

	@Autowired
    private CompaniesRepo companiesRepo;

    public CompaniesServiceImpl(CompaniesRepo companiesRepo) {
        this.companiesRepo = companiesRepo;
    }

    // API 1: Get list of companies
    public List<Companies> getAllCompanies() {
        return companiesRepo.findAll();
    }
}

