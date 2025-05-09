package main.fakeinsta.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Aplica a todas as rotas
                .allowedOriginPatterns("https://probable-memory-rw6rw6gvgpxhx67v-8080.app.github.dev:*") // Permite o localhost
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Permite os métodos GET, POST, PUT, DELETE
                .allowedHeaders("*") // Permite todos os headers
                .allowCredentials(true); // Permite envio de cookies/autenticação se necessário
			}
			
		};
	}

}