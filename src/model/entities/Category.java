package model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the categories database table.
 * 
 */
@Entity
@Table(name="categories")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_cat;

	private String catName;

	private String color;

	public Category() {
	}

	public int getID_cat() {
		return this.ID_cat;
	}

	public void setID_cat(int ID_cat) {
		this.ID_cat = ID_cat;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}