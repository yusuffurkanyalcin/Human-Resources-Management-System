package com.example.demohrms.externalServices.cloudinaryService;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public interface CloudinaryService {

    public Map uploadFile(MultipartFile file) throws IOException;
    public Map deleteImage(String id) throws IOException;
}
