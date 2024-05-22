package bilyi.trspo.service;

import bilyi.trspo.model.CreditCard;

import java.util.List;


public interface CreditCardService {

    CreditCard addCreditCard(Long customerId, CreditCard creditCard);

    List<CreditCard> getCreditCardsByCustomerId(Long customerId);

}
