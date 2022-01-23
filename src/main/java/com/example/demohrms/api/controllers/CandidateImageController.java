package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.CandidateImageService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.entities.concretes.CandidateImage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/candidate-image")
public class CandidateImageController {

    private CandidateImageService candidateImageService;

    @Autowired
    public CandidateImageController(CandidateImageService candidateImageService){
        this.candidateImageService=candidateImageService;
    }

    @PostMapping("/upload")
    public ResponseEntity<?> upload(@RequestParam MultipartFile multipartFile, @RequestParam int candidateId) throws IOException{
        BufferedImage bi = ImageIO.read(multipartFile.getInputStream());
        if(bi==null){
            return new ResponseEntity("Image no valid", HttpStatus.BAD_REQUEST);
        }
        Map result = this.candidateImageService.uploadFile(multipartFile,candidateId);

        return new ResponseEntity(result,HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<Map> delete(@PathVariable("id") int id) throws IOException {
        if (!candidateImageService.exists(id)) {
            return new ResponseEntity("No exists", HttpStatus.NOT_FOUND);
        }
        DataResult<CandidateImage> image = candidateImageService.getOne(id);
        Map result = this.candidateImageService.deleteFromCloudinary(image.getData().getImageId());
        candidateImageService.deleteFromDatabase(id);
        return new ResponseEntity("Image deleted", HttpStatus.OK);
    }


    @GetMapping("/getbycandidateid")
    public ResponseEntity<?> getById(@RequestParam int candidateId) {
        return ResponseEntity.ok(this.candidateImageService.getByCandidateId(candidateId));
    }
}
