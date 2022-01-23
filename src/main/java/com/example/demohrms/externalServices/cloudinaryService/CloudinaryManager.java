package com.example.demohrms.externalServices.cloudinaryService;

import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;
import com.cloudinary.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CloudinaryManager implements CloudinaryService{


    private Cloudinary cloudinary;

    private Map<String, String> valuesMap = new HashMap<>();

    public CloudinaryManager(){
        valuesMap.put("cloud_name","dtf9gkmf8");
        valuesMap.put("api_key","155533659987778");
        valuesMap.put("api_secret","Pu0WEECSz6cMw94S2wnAPJIw17g");

        cloudinary = new Cloudinary(valuesMap);
    }

    @Override
    public Map uploadFile(MultipartFile file) throws IOException {
        File newFile = convertMultipartToFile(file);
        Map map = cloudinary.uploader().upload(newFile, ObjectUtils.emptyMap());
        newFile.delete();

        return map;
    }

    @Override
    public Map deleteImage(String id) throws IOException {
        Map result = cloudinary.uploader().destroy(id,ObjectUtils.emptyMap());
        return result;
    }

    private File convertMultipartToFile(MultipartFile file) throws IOException {
        File convFile = new File(file.getOriginalFilename());
        FileOutputStream fos = new FileOutputStream(convFile);
        fos.write(file.getBytes());
        fos.close();
        return convFile;
    }
}
