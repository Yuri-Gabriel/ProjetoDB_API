package main.fakeinsta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import main.fakeinsta.model.dto.user.CreateUserDTO;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String email;
	private String password;
	private String biography;

	public User() {}
	
	public User(Long id, String name, String email, String password, String biography) {
		this.setId(id);
		this.setName(name.trim());
		this.setEmail(email.trim());
		this.setPassword(password.trim());
		this.setBiography(biography.trim());
	}

	public User(CreateUserDTO user) {
		this.setName(user.getName().trim());
		this.setEmail(user.getEmail().trim());
		this.setPassword(user.getPassword().trim());
		this.setBiography(user.getBiography().trim());
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return String.format("id: %d | name: %s | email: %s | password: %s | biography: %s", this.getId(), this.getName(), this.getEmail(), this.getPassword(), this.getBiography());
	}
}
