package model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the repository database table.
 * 
 */
@Entity
@NamedQuery(name="Repository.findAll", query="SELECT r FROM Repository r")
public class Repository implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_repository;

	private int ID_news;

	private int ID_user;

	private int status;

	public Repository() {
	}

	public int getID_repository() {
		return this.ID_repository;
	}

	public void setID_repository(int ID_repository) {
		this.ID_repository = ID_repository;
	}

	public int getID_news() {
		return this.ID_news;
	}

	public void setID_news(int ID_news) {
		this.ID_news = ID_news;
	}

	public int getID_user() {
		return this.ID_user;
	}

	public void setID_user(int ID_user) {
		this.ID_user = ID_user;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

}