//package bilyi.trspo.controller;
//
//
//import bilyi.trspo.model.Customer;
//import bilyi.trspo.service.CustomerService;
//import lombok.AllArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1/customers")
//@AllArgsConstructor
//public class CustomerController {
//
//    private final CustomerService customerService;
//
//
//    @PostMapping("create_customer")
//    public Customer createCustomer(Customer customer) {
//        return customerService.createCustomer(customer);
//    }
//
//
//    @GetMapping("/{id}")
//    public Customer getCustomerById(@PathVariable Long id) {
//        return customerService.getCustomerById(id);
//    }
//
//}
