package com.tirmizee.controllers;

import com.tirmizee.services.BarcodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class BarcodeController {

    @Autowired private BarcodeService barcodeService;

    @GetMapping(path = "/128/base64")
    public ResponseEntity<String> barcode128Base64() throws IOException {
        return ResponseEntity.ok(barcodeService.generate128Base64());
    }

}
