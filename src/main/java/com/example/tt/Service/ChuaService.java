package com.example.tt.Service;
import com.example.tt.Model.Chua;
import com.example.tt.Repository.ChuaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChuaService {
    private final ChuaRepository chuaRepository;

    @Autowired
    public ChuaService(ChuaRepository chuaRepository) {
        this.chuaRepository = chuaRepository;
    }

    public List<Chua> getAllChuas() {
        return chuaRepository.findAll();
    }

    public Chua getChuaById(Long id) {
        return chuaRepository.findById(id).orElse(null);
    }

    public Chua saveChua(Chua chua) {
        return chuaRepository.save(chua);
    }

    public void deleteChua(Long id) {
        chuaRepository.deleteById(id);
    }
}
