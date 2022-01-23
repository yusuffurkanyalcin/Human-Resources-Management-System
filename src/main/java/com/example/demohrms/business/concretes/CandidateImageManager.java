package com.example.demohrms.business.concretes;

import com.example.demohrms.business.abstracts.CandidateImageService;
import com.example.demohrms.core.results.DataResult;
import com.example.demohrms.core.results.Result;
import com.example.demohrms.core.results.SuccessDataResult;
import com.example.demohrms.core.results.SuccessResult;
import com.example.demohrms.dataAccess.CandidateImageDao;
import com.example.demohrms.entities.concretes.CandidateImage;
import com.example.demohrms.externalServices.cloudinaryService.CloudinaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

@Service
public class CandidateImageManager implements CandidateImageService {

    private CandidateImageDao candidateImageDao;
    private CloudinaryService cloudinaryService;

    @Autowired
    public CandidateImageManager(CandidateImageDao candidateImageDao,
                                 CloudinaryService cloudinaryService){
        this.candidateImageDao=candidateImageDao;
        this.cloudinaryService=cloudinaryService;
    }

    @Override
    public Map uploadFile(MultipartFile file, int candidateId) throws IOException {
        Map result = cloudinaryService.uploadFile(file);
        CandidateImage candidateImage = new CandidateImage(candidateId,(String)result.get("url"),(String)result.get("original_filename"),
                (String)result.get("public_id"));

        this.save(candidateImage);
        return result;
    }

    @Override
    public Result save(CandidateImage candidateImage) {
        this.candidateImageDao.save(candidateImage);
        return new SuccessResult("Image added!");
    }

    @Override
    public Map deleteFromCloudinary(String id) throws IOException {
        Map result = this.cloudinaryService.deleteImage(id);
        return result;
    }

    @Override
    public void deleteFromDatabase(int id) {
        this.candidateImageDao.deleteById(id);
    }

    @Override
    public DataResult<CandidateImage> getByCandidateId(int candidateId) {
        return new SuccessDataResult<>(this.candidateImageDao.getByCandidateId(candidateId));
    }

    @Override
    public DataResult<CandidateImage> getOne(int id) {
        return new SuccessDataResult<>(this.candidateImageDao.findById(id).get());
    }

    @Override
    public boolean exists(int id) {
        return this.candidateImageDao.existsById(id);
    }


}
