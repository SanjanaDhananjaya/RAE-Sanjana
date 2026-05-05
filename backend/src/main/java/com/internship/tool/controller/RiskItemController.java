package com.internship.tool.controller;

import com.internship.tool.entity.RiskItem;
import com.internship.tool.service.RiskItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/risks")
@CrossOrigin(origins = "http://localhost:5173")
public class RiskItemController {

    private final RiskItemService riskItemService;

    public RiskItemController(RiskItemService riskItemService) {
        this.riskItemService = riskItemService;
    }

    @GetMapping
    public List<RiskItem> getAllRisks() {
        return riskItemService.getAllRisks();
    }

    @PostMapping
    public RiskItem createRisk(@RequestBody RiskItem riskItem) {
        return riskItemService.createRisk(riskItem);
    }
}