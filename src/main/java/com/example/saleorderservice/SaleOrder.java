package com.example.saleorderservice;

import java.util.Objects;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
class SaleOrder{
    private @Id
    @GeneratedValue Long id;
    private String client;
    private String sku;
    private int quantity;
    private String unit;
    private DateTimeFormat time;
    private Boolean status;

    SaleOrder(){}

    SaleOrder(String client, String sku, int quantity, String unit, DateTimeFormat time, Boolean status){
        this.client = client;
        this.sku = sku;
        this.quantity = quantity;
        this.unit = unit;
        this.time = time;
        this.status = status;
    }

    public Long getId(){
        return this.id;
    }

    public String getClient(){
        return this.client;
    }

    public String getSku(){
        return this.sku;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public String getUnit(){
        return this.unit;
    }

    public DateTimeFormat getTime(){
        return this.time;
    }

    public Boolean getStatus(){
        return this.status;
    }

    public void setId(Long id){
        this.id = id;
    }

    public void setClient(String client){
        this.client = client;
    }

    public void setSku(String sku){
        this.sku = sku;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setUnit(String unit){
        this.unit = unit;
    }

    public void setTime(DateTimeFormat time){
        this.time = time;
    }

    public void setState(Boolean status){
        this.status = status;
    }

    @Override
    public boolean equals(Object o){
        if(this == o)
            return true;
        if(!(o instanceof SaleOrder))
            return false;
        SaleOrder saleOrder = (SaleOrder) o;
        return Objects.equals(this.id, saleOrder.id) && Objects.equals(this.client, saleOrder.client)
                && Objects.equals(this.sku, saleOrder.sku) && Objects.equals(this.quantity, saleOrder.quantity)
                && Objects.equals(this.unit, saleOrder.unit) && Objects.equals(this.time, saleOrder.time)
                && Objects.equals(this.status, saleOrder.status);
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.id, this.client, this.sku, this.quantity,
                this.unit, this.time, this.status);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", client='" + this.client + '\'' + ", sku='" + this.sku + '\'' +
                ", quantity='" + this.unit + '\'' + ", time='" + this.time + '\'' + ", status='" + this.status + '\'' + '}';
    }
}