package org.devicedata.controller;

import org.devicedata.model.DeviceData;
import org.devicedata.service.DeviceDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeviceDataController {
    @Autowired
    private DeviceDataService deviceDataService;

    @PostMapping("/device-data")
    @ResponseStatus(HttpStatus.OK)
    public String addDeviceData(@RequestBody DeviceData deviceData) {
        return deviceDataService.saveDeviceData(deviceData);
    }

}
