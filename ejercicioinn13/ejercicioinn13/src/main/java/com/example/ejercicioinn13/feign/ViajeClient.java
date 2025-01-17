package com.example.ejercicioinn13.feign;

import com.example.ejercicioinn13.response.Viaje;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "viajes", url = "https://6721642e98bbb4d93ca84a26.mockapi.io/api/v4")
public interface ViajeClient {
    @GetMapping("/viajes")
    public List<Viaje> getData();
    @PostMapping("/viajes")
    public Viaje postData();
}
