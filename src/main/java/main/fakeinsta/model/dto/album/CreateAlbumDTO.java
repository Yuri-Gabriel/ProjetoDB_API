package main.fakeinsta.model.dto.album;


public class CreateAlbumDTO {
	private String name;
	private String description;
	
	public CreateAlbumDTO(String name, String description) {
		this.setName(name.trim());
		this.setDescription(description.trim());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
