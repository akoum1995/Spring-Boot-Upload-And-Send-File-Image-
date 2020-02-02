package files.example.uploadImage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import files.example.uploadImage.entities.Image;

@Repository("imageRepository")
public interface FileRepository extends JpaRepository<Image, Integer> {

}
