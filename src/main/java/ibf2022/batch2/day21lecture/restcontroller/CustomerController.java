package ibf2022.batch2.day21lecture.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ibf2022.batch2.day21lecture.model.Customer;
import ibf2022.batch2.day21lecture.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    
    @Autowired
    CustomerService custService;

    @GetMapping
    public List<Customer> getCustomers() {
        return custService.retrieveAllCustomers();
    }

    @GetMapping("/limit")
    public List<Customer> getAllCustomersWithLimitOffset(@RequestParam("limit") int limit, @RequestParam("offset") int offset) {
        return custService.retrieverAllCustomersWithLimitOffset(limit, offset);
    }
}
