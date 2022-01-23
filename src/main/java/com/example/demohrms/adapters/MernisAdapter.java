package com.example.demohrms.adapters;

import com.example.demohrms.core.services.Mernis;
import com.example.demohrms.externalServices.mernisService.TTSKPSPublicSoap;

public class MernisAdapter implements Mernis {
    @Override
    public boolean TCKimlikNoDogrula(String nationalIdentity, String firstName, String lastName, int birthYear) {
        TTSKPSPublicSoap client = new TTSKPSPublicSoap();
        boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(
                    Long.parseLong(nationalIdentity),
                    firstName.toUpperCase(),
                    lastName.toUpperCase(),
                    birthYear);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  result;
    }
}
