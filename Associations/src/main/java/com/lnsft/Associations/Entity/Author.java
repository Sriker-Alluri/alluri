package com.lnsft.Associations.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Author")
public class Author {
	@Id
	private Long id;
	private String name;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name="zipcode_id")
	private Zipcode zipcode;
	@ManyToMany(mappedBy = "categories",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Book> books=new ArrayList<Book>();

	public void addBook(Book book) {
		books.add(book);
	}
	public void removeBook(Book book) {
		books.remove(book);
	}
}
