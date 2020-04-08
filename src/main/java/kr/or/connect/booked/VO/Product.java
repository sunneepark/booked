package kr.or.connect.booked.VO;

import org.apache.ibatis.type.Alias;

public class Product {
	private int id;
	private int category_id;
	private String description;
	private String content;
	private String event;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	
	@Override
	public String toString() {
		return "product [id=" + id + ", category_id=" + category_id + ", description=" + description + ", content="
				+ content + ", event=" + event + "]";
	}
	
	
}
