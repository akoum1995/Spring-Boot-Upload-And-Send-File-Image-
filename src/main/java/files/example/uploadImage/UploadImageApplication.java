package files.example.uploadImage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import files.example.uploadImage.utlis.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class UploadImageApplication {

	public static void main(String[] args) {
		SpringApplication.run(UploadImageApplication.class, args);
	}

}
