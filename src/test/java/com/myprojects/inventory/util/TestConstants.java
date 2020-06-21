package com.myprojects.inventory.util;

import lombok.experimental.UtilityClass;

import java.time.LocalDate;

@UtilityClass
public class TestConstants {
    public final int ISBN = 1234;
    public final String FIRST_NAME = "John";
    public final String LAST_NAME = "Doe";
    public final String BOOK_TITLE = "junit testing";
    public final LocalDate PUBLISHED_DATE = LocalDate.of(2020,06,20);
}
