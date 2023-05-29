package com.api.rekognition;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/")
@RequiredArgsConstructor
public class RekognitionController {

    private final RekognitionService rekognitionService;

    @PostMapping(value ="/validate", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<MessageResponse> validateDocumentation(
            @ModelAttribute @Valid ValidationRequest request
    ) throws IOException {
        return rekognitionService.verifyIdentity(request);
    }

    @GetMapping("/validate")
    public ResponseEntity<MessageResponse> itWorks (){
        return ResponseEntity.ok(new MessageResponse(200,"funca"));
    }

}
