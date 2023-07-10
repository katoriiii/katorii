package com.example.tt.Service;
import com.example.tt.Model.PhatTu;
import com.example.tt.Repository.PhatTuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhatTuService {
    private final PhatTuRepository phatTuRepository;

    @Autowired
    public PhatTuService(PhatTuRepository phatTuRepository) {
        this.phatTuRepository = phatTuRepository;
    }

    public List<PhatTu> getAllPhatTus() {
        return phatTuRepository.findAll();
    }

    public PhatTu getPhatTuById(Long id) {
        return phatTuRepository.findById(id).orElse(null);
    }

    public PhatTu savePhatTu(PhatTu phatTu) {
        return phatTuRepository.save(phatTu);
    }

    public void deletePhatTu(Long id) {
        phatTuRepository.deleteById(id);
    }
}
