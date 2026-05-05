package com.internship.tool.service;

import com.internship.tool.entity.RiskItem;
import com.internship.tool.repository.RiskItemRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class RiskItemService {

    private final RiskItemRepository riskItemRepository;

    public RiskItemService(RiskItemRepository riskItemRepository) {
        this.riskItemRepository = riskItemRepository;
    }

    public List<RiskItem> getAllRisks() {
        return riskItemRepository.findAll();
    }

    public RiskItem createRisk(RiskItem riskItem) {
        riskItem.setCreatedAt(LocalDateTime.now());
        riskItem.setUpdatedAt(LocalDateTime.now());

        if (riskItem.getStatus() == null || riskItem.getStatus().isBlank()) {
            riskItem.setStatus("OPEN");
        }

        return riskItemRepository.save(riskItem);
    }
}