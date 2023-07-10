package com.example.tt.Service;
import com.example.tt.Model.DonDangKy;
import com.example.tt.Repository.DonDangKyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonDangKyService {
    private final DonDangKyRepository donDangKyRepository;

    @Autowired
    public DonDangKyService(DonDangKyRepository donDangKyRepository) {
        this.donDangKyRepository = donDangKyRepository;
    }

    public List<DonDangKy> getAllDonDangKys() {
        return donDangKyRepository.findAll();
    }

    public DonDangKy getDonDangKyById(Long id) {
        return donDangKyRepository.findById(id).orElse(null);
    }

    public DonDangKy saveDonDangKy(DonDangKy donDangKy) {
        return donDangKyRepository.save(donDangKy);
    }

    public void deleteDonDangKy(Long id) {
        donDangKyRepository.deleteById(id);
    }
}
