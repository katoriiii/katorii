package com.example.tt.Controller;
import com.example.tt.Model.PhatTuDaoTrang;
import com.example.tt.Service.PhatTuDaoTrangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phattudaotrangs")
public class PhatTuDaoTrangController {
    private final PhatTuDaoTrangService phatTuDaoTrangService;

    @Autowired
    public PhatTuDaoTrangController(PhatTuDaoTrangService phatTuDaoTrangService) {
        this.phatTuDaoTrangService = phatTuDaoTrangService;
    }

    @GetMapping
    public List<PhatTuDaoTrang> getAllPhatTuDaoTrangs() {
        return phatTuDaoTrangService.getAllPhatTuDaoTrangs();
    }

    @GetMapping("/{id}")
    public PhatTuDaoTrang getPhatTuDaoTrangById(@PathVariable Long id) {
        return phatTuDaoTrangService.getPhatTuDaoTrangById(id);
    }

    @PostMapping
    public PhatTuDaoTrang createPhatTuDaoTrang(@RequestBody PhatTuDaoTrang phatTuDaoTrang) {
        return phatTuDaoTrangService.savePhatTuDaoTrang(phatTuDaoTrang);
    }

    @DeleteMapping("/{id}")
    public void deletePhatTuDaoTrang(@PathVariable Long id) {
        phatTuDaoTrangService.deletePhatTuDaoTrang(id);
    }
}
