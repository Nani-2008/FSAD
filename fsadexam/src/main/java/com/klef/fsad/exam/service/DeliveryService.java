package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Delivery;
import com.klef.fsad.exam.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public String addDelivery(Delivery delivery) {
        deliveryRepository.save(delivery);
        return "Delivery Record Added Successfully";
    }

    public String deleteDelivery(int deliveryId) {
        deliveryRepository.deleteById(deliveryId);
        return "Delivery Record Deleted Successfully";
    }
}
