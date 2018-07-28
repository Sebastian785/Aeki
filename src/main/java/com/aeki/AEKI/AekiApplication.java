package com.aeki.AEKI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AekiApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(AekiApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(AekiApplication.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTempale;

    @Override
    public void run(String... strings) throws Exception {

        log.info("Creating tables");

        jdbcTempale.execute("CREATE TABLE customers("+
                "id INT, name VARCHAR(255))");
    }

}