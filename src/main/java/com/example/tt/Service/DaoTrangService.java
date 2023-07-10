package com.example.tt.Service;
import com.example.tt.Model.DaoTrang;
import com.example.tt.Repository.DaoTrangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaoTrangService {
    private final DaoTrangRepository daoTrangRepository;

    @Autowired
    public DaoTrangService(DaoTrangRepository daoTrangRepository) {
        this.daoTrangRepository = daoTrangRepository;
    }

    public List<DaoTrang> getAllDaoTrangs() {
        return daoTrangRepository.findAll();
    }

    public DaoTrang getDaoTrangById(Long id) {
        return daoTrangRepository.findById(id).orElse(null);
    }

    public DaoTrang saveDaoTrang(DaoTrang daoTrang) {
        return daoTrangRepository.save(daoTrang);
    }

    public void deleteDaoTrang(Long id) {
        daoTrangRepository.deleteById(id);
    }
}
