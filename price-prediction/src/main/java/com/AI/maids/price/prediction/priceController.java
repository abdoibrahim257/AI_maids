package com.AI.maids.price.prediction;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class priceController {

    private Map<Long, price> devices = new HashMap<>();

    public priceController() {
        devices.put(1L, new price(1L, 1043, 1, 1.8f, 1, 14, 0, 5, 0.1f, 193, 3, 16, 226, 1412, 3476, 12, 7, 2, 0, 1, 0));
        devices.put(2L, new price(2L, 841, 1, 0.5f, 1, 4, 1, 61, 0.8f, 191, 5, 12, 746, 857, 3895, 6, 0, 7, 1, 0, 0));
        devices.put(3L, new price(3L, 1807, 1, 2.8f, 0, 1, 0, 27, 0.9f, 186, 3, 4, 1270, 1366, 2396, 17, 10, 10, 0, 1, 1));
        devices.put(4L, new price(4L, 1546, 0, 0.5f, 1, 18, 1, 25, 0.5f, 96, 8, 20, 295, 1752, 3893, 10, 0, 7, 1, 1, 0));
    }

    // Retrieve list of all devices
    @GetMapping("/api/devices")
    public Collection<price> getDevices() {
        return devices.values();
    }
}