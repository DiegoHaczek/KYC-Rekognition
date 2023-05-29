package com.api.rekognition;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class ValidationRequest {
    @NotNull(message = "Front Image can't be null")
    private MultipartFile frontImage;

    @NotNull(message = "Back Image can't be null")
    private MultipartFile backImage;

    @NotNull(message = "Selfie can't be null")
    private MultipartFile selfie;
}
