package com.myprojects.inventory.domain;

import java.time.LocalDate;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class BookDTO {

	private Long id;
	private String title;
	private String author;
	private LocalDate published_date;
	private int isbn;
}
