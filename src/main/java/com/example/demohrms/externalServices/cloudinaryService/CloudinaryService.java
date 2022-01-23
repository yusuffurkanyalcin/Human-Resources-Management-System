package com.example.demohrms.externalServices.cloudinaryService;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CloudinaryService {

     Map uploadFile(MultipartFile file) throws IOException;
     Map deleteImage(String id) throws IOException;
}
