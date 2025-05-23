package Model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Post {

	
	private int ID;
	private String content;
	private User user;
	private LocalDateTime dateTime;
	private ArrayList<Comment> comment;
	private ArrayList<User> likes;
	
	public Post() {}
	
	public int getID() {
		return ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	
	public ArrayList<Comment> getComment() {
		return comment;
	}
	public void setComment(ArrayList<Comment> comment) {
		this.comment = comment;
	}
	
	public ArrayList<User> getLikes() {
		return likes;
	}
	public void setLikes(ArrayList<User>likes) {
		this.likes = likes;
	}
}
