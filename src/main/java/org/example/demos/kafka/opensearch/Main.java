package org.example.demos.kafka.opensearch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class Main {

    private CV myCv;

    @BeforeClass
    public void setupCv() {
        myCv = new CV();
        System.out.println("CV Setup Completed!");
    }

    @Test
    public void printCv() {
        System.out.println("----- MY CV -----");
        System.out.println("Name   : " + myCv.getName());
        System.out.println("Age    : " + myCv.getAge());
        System.out.println("Address: " + myCv.getAddress());
        System.out.println("Email  : " + myCv.getEmail());
        System.out.println("----------------");
    }

    @AfterClass
    public void validateCv() {
        assertThat(myCv.getName()).isNotBlank();
        assertThat(myCv.getAge()).isPositive();
        assertThat(myCv.getAddress()).isNotBlank();
        assertThat(myCv.getEmail()).isNotBlank();
        System.out.println("✅ All CV fields are valid!");
    }
}
