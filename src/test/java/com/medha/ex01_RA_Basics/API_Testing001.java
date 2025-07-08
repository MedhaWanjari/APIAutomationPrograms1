package com.medha.ex01_RA_Basics;

import io.restassured.RestAssured;

public class API_Testing001 {
    public static void main(String[] args) {

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
