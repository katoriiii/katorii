package com.example.tt.Controller;
import com.example.tt.Model.Chua;
import com.example.tt.Service.ChuaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chuas")
public class ChuaController {
    private final ChuaService chuaService;

    @Autowired
    public ChuaController(ChuaService chuaService) {
        this.chuaService = chuaService;
    }

    @GetMapping
    public List<Chua> getAllChuas() {
        return chuaService.getAllChuas();
    }

    @GetMapping("/{id}")
    public Chua getChuaById(@PathVariable Long id) {
        return chuaService.getChuaById(id);
    }

    @PostMapping
    public Chua createChua(@RequestBody Chua chua) {
        return chuaService.saveChua(chua);
    }

    @DeleteMapping("/{id}")
    public void deleteChua(@PathVariable Long id) {
        chuaService.deleteChua(id);
    }
}
