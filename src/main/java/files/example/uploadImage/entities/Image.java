package files.example.uploadImage.entities;

import javax.persistence.*;

@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String imageName;
	
	public Image() {
		
	}
	public Image(int id, String imageName) {
		this.id = id;
		this.imageName = imageName;
	}
	public Image(String imageName) {
		this.imageName = imageName;

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	
}
