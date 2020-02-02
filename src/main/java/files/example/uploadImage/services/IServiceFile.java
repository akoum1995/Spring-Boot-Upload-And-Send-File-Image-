package files.example.uploadImage.services;

import org.springframework.web.multipart.MultipartFile;

public interface IServiceFile {
	
	public void uploadFile(MultipartFile file);
    public String getFileName(int id);
	
}
