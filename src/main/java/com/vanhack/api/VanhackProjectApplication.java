package com.vanhack.api;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.r2d2apps.api.entities.Empresa;
import com.vanhack.api.entitites.Product;
import com.vanhack.api.repositories.ProductRepository;
import com.vanhack.api.security.entities.Usuario;
import com.vanhack.api.security.repositories.UsuarioRepository;
import com.vanhack.api.security.enums.PerfilEnum;
import com.vanhack.api.utils.SenhaUtils;

@SpringBootApplication
public class VanhackProjectApplication {

	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ProductRepository productRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(VanhackProjectApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner commandLinerRunner() {
		return args -> {
			
			// Creating a users default
			Usuario usuario = new Usuario();
			usuario.setEmail("user@email.com");
			usuario.setPerfil(PerfilEnum.ROLE_USUARIO);
			usuario.setSenha(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(usuario);
			
			Usuario admin = new Usuario();
			admin.setEmail("admin@email.com");
			admin.setPerfil(PerfilEnum.ROLE_ADMIN);
			admin.setSenha(SenhaUtils.gerarBCrypt("123456"));
			this.usuarioRepository.save(admin);
			
			
			/*
			// Creating a products Default
			Product product1 = new Product();
			product1.setName("Italian Pizza");
			product1.setDescription("Ingredients: cheese, ham, salt");
			product1.setValue(10.3f);
			
			productRepository.save(product1);
			
			Product product2 = new Product();
			product2.setName("Mac Pizza");
			product2.setDescription("Ingredients: double big mac");
			product2.setValue(13.3f);
			
			productRepository.save(product2);
			
			
			productRepository
				.findAll()
				.stream()
				.forEach(c -> System.out.println("Product " + c.getName()));
			*/
			
			
		};
	}
}
