package com.myprojects.inventory.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.myprojects.inventory.entity.Author;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {

	public BookDTO(Long id2, String title2, LocalDate published_date2, int isbn2, Author author2,
			LocalDateTime modified, String modifiedBy, LocalDateTime created, String createdBy) {
		// TODO Auto-generated constructor stub
	}
	private Long id;
	private String title;
	private AuthorDTO author;
	private LocalDate published_date;
	private int isbn;
}
