package main.fakeinsta.enitties.dto.photo;

public class CreatePhotoDTO {
	private String name;
	private String description;
	
	public CreatePhotoDTO(String name, String description) {
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
