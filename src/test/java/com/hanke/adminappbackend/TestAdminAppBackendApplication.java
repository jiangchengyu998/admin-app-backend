package com.hanke.adminappbackend;

import org.springframework.boot.SpringApplication;

public class TestAdminAppBackendApplication {

    public static void main(String[] args) {
        SpringApplication.from(AdminAppBackendApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
