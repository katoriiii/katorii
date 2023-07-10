package com.example.tt.Service;
import com.example.tt.Model.KieuThanhVien;
import com.example.tt.Repository.KieuThanhVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KieuThanhVienService {
    private final KieuThanhVienRepository kieuThanhVienRepository;

    @Autowired
    public KieuThanhVienService(KieuThanhVienRepository kieuThanhVienRepository) {
        this.kieuThanhVienRepository = kieuThanhVienRepository;
    }

    public List<KieuThanhVien> getAllKieuThanhViens() {
        return kieuThanhVienRepository.findAll();
    }

    public KieuThanhVien getKieuThanhVienById(Long id) {
        return kieuThanhVienRepository.findById(id).orElse(null);
    }

    public KieuThanhVien saveKieuThanhVien(KieuThanhVien kieuThanhVien) {
        return kieuThanhVienRepository.save(kieuThanhVien);
    }

    public void deleteKieuThanhVien(Long id) {
        kieuThanhVienRepository.deleteById(id);
    }
}
