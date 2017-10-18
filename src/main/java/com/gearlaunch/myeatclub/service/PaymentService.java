package com.gearlaunch.myeatclub.service;

import com.gearlaunch.myeatclub.model.Payment;
import com.gearlaunch.myeatclub.model.User;

import java.math.BigDecimal;

/**
 */
public interface PaymentService {

	Payment createPayment(User user, String referenceNumber, BigDecimal amount);
}
