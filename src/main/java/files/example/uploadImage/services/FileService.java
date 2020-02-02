package files.example.uploadImage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import files.example.uploadImage.entities.Image;
import files.example.uploadImage.repositories.FileRepository;

@Service("fileService")
public class FileService implements IServiceFile{

	@Autowired
	FileRepository fileRepository;

    @Override
    public void uploadFile(MultipartFile file) {
            Image image = new Image(file.getOriginalFilename());
            fileRepository.save(image);
    }
    @Override
    public String getFileName(int id) {
           Image image =  fileRepository.findById(id).get();
           return image.getImageName();
    }
}