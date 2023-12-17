package org.devicedata.service;

import org.devicedata.model.DeviceData;
import org.devicedata.repository.DeviceDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceDataService {
    @Autowired
    private DeviceDataRepository deviceDataRepository;

    public String saveDeviceData(DeviceData deviceData) {
        deviceDataRepository.save(deviceData);
        return "Success";
    }
}
