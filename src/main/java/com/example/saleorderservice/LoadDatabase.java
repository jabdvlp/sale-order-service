package com.example.saleorderservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.format.annotation.DateTimeFormat;


class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);
    DateTimeFormat dateTime;
    @Bean
    CommandLineRunner initDatabase(SaleOrderRepository repository){

        return args -> {
            log.info("Preloading " + repository.save(new SaleOrder("Bob Marley", "w420", 10,"boxes", dateTime, true)));
            log.info("Preloading " + repository.save(new SaleOrder("Jimi Hendrix", "lsd420", 50,"units", dateTime, true)));
        };


    }
}
