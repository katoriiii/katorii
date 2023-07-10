package com.example.tt.Controller;
import com.example.tt.Model.DaoTrang;
import com.example.tt.Service.DaoTrangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/daotrangs")
public class DaoTrangController {
    private final DaoTrangService daoTrangService;

    @Autowired
    public DaoTrangController(DaoTrangService daoTrangService) {
        this.daoTrangService = daoTrangService;
    }

    @GetMapping
    public List<DaoTrang> getAllDaoTrangs() {
        return daoTrangService.getAllDaoTrangs();
    }

    @GetMapping("/{id}")
    public DaoTrang getDaoTrangById(@PathVariable Long id) {
        return daoTrangService.getDaoTrangById(id);
    }

    @PostMapping
    public DaoTrang createDaoTrang(@RequestBody DaoTrang daoTrang) {
        return daoTrangService.saveDaoTrang(daoTrang);
    }

    @DeleteMapping("/{id}")
    public void deleteDaoTrang(@PathVariable Long id) {
        daoTrangService.deleteDaoTrang(id);
    }
}
