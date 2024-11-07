package com.example.saleorderservice.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;

interface SaleOrderRepository extends JpaRepository<SaleOrder, Long>{

}