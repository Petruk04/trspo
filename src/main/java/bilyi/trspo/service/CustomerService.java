package bilyi.trspo.service;

import bilyi.trspo.model.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface CustomerService {

    Customer createCustomer(Customer customer);

    Customer getCustomerById(Long id);

}
