package com.example.demohrms.api.controllers;

import com.example.demohrms.business.abstracts.VerificationCodeEmployerService;
import com.example.demohrms.core.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/verification-code-employer")
public class VerificationCodeEmployerController {

    private final VerificationCodeEmployerService verificationCodeEmployerService;

    @Autowired
    public VerificationCodeEmployerController(VerificationCodeEmployerService verificationCodeEmployerService){
        this.verificationCodeEmployerService=verificationCodeEmployerService;
    }

    @GetMapping("/getall")
    public Result getAll(){
        return verificationCodeEmployerService.getAll();
    }

    @GetMapping("/update-to-confirm")
    public Result updateToConfirm(@RequestParam(name = "id") String id , @RequestParam(name = "verificationcode") String verificationcode){
        return this.verificationCodeEmployerService.updateToConfirm(Integer.valueOf(id),verificationcode);
    }
}
