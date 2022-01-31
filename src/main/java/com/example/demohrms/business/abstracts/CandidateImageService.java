package com.example.demohrms.business.abstracts;

import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.entities.concretes.CandidateImage;
import com.example.demohrms.entities.dtos.CandidateImageDto;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface CandidateImageService {
     Map uploadFile(MultipartFile file, int candidateId) throws IOException;
     Result save(CandidateImage candidateImage);
     Map deleteFromCloudinary(String id) throws IOException;
     void deleteFromDatabase(int id);
     DataResult<CandidateImage> getByCandidateId(int candidateId);
     DataResult<CandidateImage> getOne(int id);
     DataResult<CandidateImageDto> getDtoByCandidateId(int candidateId);
     boolean exists(int id);
}
