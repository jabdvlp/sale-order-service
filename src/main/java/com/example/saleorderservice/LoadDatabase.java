package com.example.saleorderservice;
import com.example.saleorderservice.SaleOrderRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.util.logging.Logger;

class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(SaleOrderRepository repository){



    }
}
