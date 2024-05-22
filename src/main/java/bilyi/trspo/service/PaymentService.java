package bilyi.trspo.service;

import bilyi.trspo.model.Payment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PaymentService {

    Payment createPayment(Long accountId, Payment payment);

    List<Payment> getPayments(Long accountId);
}
