package org.devicedata.repository;

import org.devicedata.model.DeviceData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceDataRepository extends JpaRepository<DeviceData, Long> {
}
