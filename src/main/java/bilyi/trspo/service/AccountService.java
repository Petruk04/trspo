package bilyi.trspo.service;

import bilyi.trspo.model.Account;
import org.springframework.http.ResponseEntity;

import java.math.BigDecimal;

public interface AccountService {

    Account getAccount(Long id);

    Account deposit(Long id, BigDecimal amount); //поповнити рахунок

    Account blockAccount(Long id);

    Account unblockAccount(Long id);

}
