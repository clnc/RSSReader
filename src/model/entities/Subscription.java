package model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the subscriptions database table.
 * 
 */
@Entity
@Table(name="subscriptions")
@NamedQuery(name="Subscription.findAll", query="SELECT s FROM Subscription s")
public class Subscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_subscription;

	private int ID_user;

	private String url;

	public Subscription() {
	}

	public int getID_subscription() {
		return this.ID_subscription;
	}

	public void setID_subscription(int ID_subscription) {
		this.ID_subscription = ID_subscription;
	}

	public int getID_user() {
		return this.ID_user;
	}

	public void setID_user(int ID_user) {
		this.ID_user = ID_user;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}