package com.example.tt.Controller;
import com.example.tt.Model.KieuThanhVien;
import com.example.tt.Service.KieuThanhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/kieuthanhviens")
public class KieuThanhVienController {
    private final KieuThanhVienService kieuThanhVienService;

    @Autowired
    public KieuThanhVienController(KieuThanhVienService kieuThanhVienService) {
        this.kieuThanhVienService = kieuThanhVienService;
    }

    @GetMapping
    public List<KieuThanhVien> getAllKieuThanhViens() {
        return kieuThanhVienService.getAllKieuThanhViens();
    }

    @GetMapping("/{id}")
    public KieuThanhVien getKieuThanhVienById(@PathVariable Long id) {
        return kieuThanhVienService.getKieuThanhVienById(id);
    }

    @PostMapping
    public KieuThanhVien createKieuThanhVien(@RequestBody KieuThanhVien kieuThanhVien) {
        return kieuThanhVienService.saveKieuThanhVien(kieuThanhVien);
    }

    @DeleteMapping("/{id}")
    public void deleteKieuThanhVien(@PathVariable Long id) {
        kieuThanhVienService.deleteKieuThanhVien(id);
    }
}
