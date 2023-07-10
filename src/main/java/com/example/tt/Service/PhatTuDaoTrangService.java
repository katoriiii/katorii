package com.example.tt.Service;
import com.example.tt.Model.PhatTuDaoTrang;
import com.example.tt.Repository.PhatTuDaoTrangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhatTuDaoTrangService {
    private final PhatTuDaoTrangRepository phatTuDaoTrangRepository;

    @Autowired
    public PhatTuDaoTrangService(PhatTuDaoTrangRepository phatTuDaoTrangRepository) {
        this.phatTuDaoTrangRepository = phatTuDaoTrangRepository;
    }

    public List<PhatTuDaoTrang> getAllPhatTuDaoTrangs() {
        return phatTuDaoTrangRepository.findAll();
    }

    public PhatTuDaoTrang getPhatTuDaoTrangById(Long id) {
        return phatTuDaoTrangRepository.findById(id).orElse(null);
    }

    public PhatTuDaoTrang savePhatTuDaoTrang(PhatTuDaoTrang phatTuDaoTrang) {
        return phatTuDaoTrangRepository.save(phatTuDaoTrang);
    }

    public void deletePhatTuDaoTrang(Long id) {
        phatTuDaoTrangRepository.deleteById(id);
    }
}
