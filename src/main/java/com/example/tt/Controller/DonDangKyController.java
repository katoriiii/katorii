package com.example.tt.Controller;
import com.example.tt.Model.DonDangKy;
import com.example.tt.Service.DonDangKyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dondangkys")
public class DonDangKyController {
    private final DonDangKyService donDangKyService;

    @Autowired
    public DonDangKyController(DonDangKyService donDangKyService) {
        this.donDangKyService = donDangKyService;
    }

    @GetMapping
    public List<DonDangKy> getAllDonDangKys() {
        return donDangKyService.getAllDonDangKys();
    }

    @GetMapping("/{id}")
    public DonDangKy getDonDangKyById(@PathVariable Long id) {
        return donDangKyService.getDonDangKyById(id);
    }

    @PostMapping
    public DonDangKy createDonDangKy(@RequestBody DonDangKy donDangKy) {
        return donDangKyService.saveDonDangKy(donDangKy);
    }

    @DeleteMapping("/{id}")
    public void deleteDonDangKy(@PathVariable Long id) {
        donDangKyService.deleteDonDangKy(id);
    }
}
