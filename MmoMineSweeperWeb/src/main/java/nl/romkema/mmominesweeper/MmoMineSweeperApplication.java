package nl.romkema.mmominesweeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MmoMineSweeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(MmoMineSweeperApplication.class, args);
	}

//	@Bean
//	CommandLineRunner init(UserRepository userRepository) {
//		return args -> {
//			Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
//				User user = new User(name, name.toLowerCase() + "@domain.com");
//				userRepository.save(user);
//			});
//			userRepository.findAll().forEach(System.out::println);
//		};
//	}
}
