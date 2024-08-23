/**
 * Copyright (c) 2024 All Rights Reserved
 */
package ester.preparation.sample.template;

import ester.preparation.sample.model.response.BaseResponse;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Yosepri Disyandro Berutu (yosepri.berutu@binus.ac.id)
 * @version $Id: ServiceTemplate.java , v 0.1 2024-08-23 22.50 Yosepri Disyandro Berutu Exp $$
 */
public class ServiceTemplate {

    public static void execute(BaseResponse response, HttpServletResponse httpServletResponse, ServiceCallback callback) {
        try {
            callback.checkParam();
            callback.process();
        } catch (IllegalArgumentException illegalArgumentException) {
            response.setMessage(illegalArgumentException.getMessage());
            httpServletResponse.setStatus(400);
        } catch (Exception e) {
            response.setMessage(e.getMessage());
            httpServletResponse.setStatus(500);
        }
    }
}
