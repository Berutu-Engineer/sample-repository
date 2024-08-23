/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.controller;

import ester.preparation.sample.model.request.SampleRequest;
import ester.preparation.sample.model.response.SampleResponse;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: SampleController.java , v 0.1 2024-08-23 21.05 Yosepri Disyandro Berutu Exp $$
 */
@RestController
public class SampleController {

    @GetMapping("/api/sample")
    public SampleResponse sampleCall(@RequestBody final SampleRequest request, final HttpServletResponse response){
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setMessage("Hai " + request.getName() + ". Ini adalah sample API");

        return sampleResponse;
    }
}
