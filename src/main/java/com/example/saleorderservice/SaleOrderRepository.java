package com.example.saleorderservice;
import org.springframework.data.jpa.repository.JpaRepository;

interface SaleOrderRepository extends JpaRepository<SaleOrder, Long>{

}