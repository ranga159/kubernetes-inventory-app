package com.myprojects.inventory.domain;

import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class AuthorDTO {
	private Long id;
	private String firstName;
	private String lastName;
	private Set<BookDTO> books;
}
