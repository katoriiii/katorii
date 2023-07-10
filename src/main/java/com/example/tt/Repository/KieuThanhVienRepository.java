package com.example.tt.Repository;
import com.example.tt.Model.KieuThanhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KieuThanhVienRepository extends JpaRepository<KieuThanhVien, Long> {
}
