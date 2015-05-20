package model.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the shares database table.
 * 
 */
@Entity
@Table(name="shares")
@NamedQuery(name="Share.findAll", query="SELECT s FROM Share s")
public class Share implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int ID_share;

	private int ID_news;

	private int ID_receiver;

	private int ID_sender;

	public Share() {
	}

	public int getID_share() {
		return this.ID_share;
	}

	public void setID_share(int ID_share) {
		this.ID_share = ID_share;
	}

	public int getID_news() {
		return this.ID_news;
	}

	public void setID_news(int ID_news) {
		this.ID_news = ID_news;
	}

	public int getID_receiver() {
		return this.ID_receiver;
	}

	public void setID_receiver(int ID_receiver) {
		this.ID_receiver = ID_receiver;
	}

	public int getID_sender() {
		return this.ID_sender;
	}

	public void setID_sender(int ID_sender) {
		this.ID_sender = ID_sender;
	}

}