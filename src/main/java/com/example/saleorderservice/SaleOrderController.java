package com.example.saleorderservice;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
public class SaleOrderController {
    private final SaleOrderRepository repository;

    SaleOrderController(SaleOrderRepository repository){this.repository = repository;}

    @GetMapping("/saleOrders")
    CollectionModel<EntityModel<SaleOrder>> all(){
        List<EntityModel<SaleOrder>> saleOrder = repository.findAll().stream()
                .map(saleOrder1 -> EntityModel.of(saleOrder1,
                        linkTo(methodOn(SaleOrderController.class).one(saleOrder1.getId())).withSelfRel())),
                        linkTo(methodOn(SaleOrderController.class).all().withRel("saleOrder")))
                .collect(Collectors.toList());

        return CollectionModel.of(saleOrder, linkTo(methodOn(SaleOrderController.class).all()).withSelfRel());

    }
}
