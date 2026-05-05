package com.internship.tool.repository;

import com.internship.tool.entity.RiskItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RiskItemRepository extends JpaRepository<RiskItem, Long> {

    List<RiskItem> findByStatus(String status);

    List<RiskItem> findByCategory(String category);
}