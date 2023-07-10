package com.example.tt.Controller;
import com.example.tt.Model.PhatTu;
import com.example.tt.Repository.PhatTuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/phattu")
public class PhatTuController {

    @Autowired
    private PhatTuRepository phatTuRepository;

    @GetMapping("/filter")
    public ResponseEntity<List<PhatTu>> filterPhatTu(@RequestParam(required = false) String keyword,
                                                     @RequestParam(required = false) String phapDanh,
                                                     @RequestParam(required = false) String gioiTinh,
                                                     @RequestParam(required = false) Boolean daHoanTuc) {
        List<PhatTu> filteredPhatTuList = phatTuRepository.filterPhatTu(keyword, phapDanh, gioiTinh, daHoanTuc);

        return ResponseEntity.ok(filteredPhatTuList);
    }
}
