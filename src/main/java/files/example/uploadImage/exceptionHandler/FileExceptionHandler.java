package files.example.uploadImage.exceptionHandler;

import java.nio.file.NoSuchFileException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import files.example.uploadImage.utlis.FileError;
import files.example.uploadImage.utlis.FileStorageException;


@ControllerAdvice
public class FileExceptionHandler {

    @ExceptionHandler(FileStorageException.class)
    protected ResponseEntity<Object> handleFileException(
    		FileStorageException ex) {
        FileError fileError = new FileError(HttpStatus.BAD_REQUEST);
        fileError.setMessage(ex.getMessage());
        return buildResponseEntity(fileError);
    }
    @ExceptionHandler(NoSuchFileException.class)
    protected ResponseEntity<Object> handleNoSuchFileException(
    		NoSuchFileException ex) {
        FileError fileError = new FileError(HttpStatus.NOT_ACCEPTABLE);
        fileError.setMessage(ex.getMessage());
        return buildResponseEntity(fileError);
    }
    
    private ResponseEntity<Object> buildResponseEntity(FileError fileError) {
        return new ResponseEntity<>(fileError, fileError.getStatus());
    }
}