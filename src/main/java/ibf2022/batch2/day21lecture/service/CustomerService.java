package ibf2022.batch2.day21lecture.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibf2022.batch2.day21lecture.model.Customer;
import ibf2022.batch2.day21lecture.repository.CustomerRepository;

@Service
public class CustomerService {
    
    @Autowired
    CustomerRepository custRepo;

    public List<Customer> retrieveAllCustomers() {
        return custRepo.getAllCustomers();
    }

    public List<Customer> retrieverAllCustomersWithLimitOffset(int limit, int offset) {
        return custRepo.getAllCustomersWithLimitOffset(limit, offset);
    }
}
