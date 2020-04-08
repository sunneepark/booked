package kr.or.connect.booked.VO;

public class File {
	private int id;
	private String file_name;
	private String save_file_name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getSave_file_name() {
		return save_file_name;
	}
	public void setSave_file_name(String save_file_name) {
		this.save_file_name = save_file_name;
	}
	@Override
	public String toString() {
		return "File [id=" + id + ", file_name=" + file_name + ", save_file_name=" + save_file_name + "]";
	}
	
	
}
