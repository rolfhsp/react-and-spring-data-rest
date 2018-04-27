package com.example.payroll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final AssetRepository assetRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public DatabaseLoader(AssetRepository assetRepository, EmployeeRepository employeeRepository) {
        this.assetRepository = assetRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.assetRepository.save(new Asset("car", "Kia Cee'd"));
        this.assetRepository.save(new Asset("motorcycle", "Honda VT 750 C2 Shadow ACE"));
        this.employeeRepository.save(new Employee("Frodo", "Baggins", "ring bearer"));
    }
}
