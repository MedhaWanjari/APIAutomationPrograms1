package com.medha.ex01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class API_Testing001_User_input {
    public static void main(String[] args) {
        // Gherkins Syntax
        // Given() -> Pre Req. - URL, Headers, Auth, Body....
        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
        // Then() -> Validation -> 200 oK, firstname == MEDHA

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Pincode: ");
        String pincode = scanner.nextLine();

        // Full URL - https://api.zippopotam.us/IN/560016
        // base URI - https://api.zippopotam.us
        // bath Path - /IN/560016

        RestAssured
                .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/560016")
                .when()
                   .get()
                .then()
                   .log().all().statusCode(200);


    }
}
