package Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Entity.Companies;
import Service.CompaniesService;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

    @Autowired
	private CompaniesService companiesService;

    public CompaniesController(CompaniesService companiesService) {
        this.companiesService = companiesService;
    }

    // API 1: Get list of companies
    @RequestMapping("/")
    public ResponseEntity<List<Companies>> getAllCompanies() {
        return ResponseEntity.ok(companiesService.getAllCompanies());
    }
}
