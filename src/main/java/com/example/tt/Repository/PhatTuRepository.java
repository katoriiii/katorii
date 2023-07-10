package com.example.tt.Repository;
import com.example.tt.Model.PhatTu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhatTuRepository extends JpaRepository<PhatTu, Long> {
    @Query("SELECT pt FROM PhatTu pt WHERE " +
            "(LOWER(pt.hoTenDem) LIKE LOWER(concat('%', :keyword, '%')) OR " +
            "LOWER(pt.ten) LIKE LOWER(concat('%', :keyword, '%'))) " +
            "AND (:phapDanh IS NULL OR pt.phapDanh = :phapDanh) " +
            "AND (:gioiTinh IS NULL OR pt.gioiTinh = :gioiTinh) " +
            "AND (:daHoanTuc IS NULL OR pt.daHoanTuc = :daHoanTuc)")
    List<PhatTu> filterPhatTu(@Param("keyword") String keyword,
                              @Param("phapDanh") String phapDanh,
                              @Param("gioiTinh") String gioiTinh,
                              @Param("daHoanTuc") Boolean daHoanTuc);
}
