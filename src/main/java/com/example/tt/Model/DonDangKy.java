package com.example.tt.Model;
import javax.persistence.*;
@Entity
@Table(name = "DonDangKy")
public class DonDangKy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long phatTuId;
    private String trangThaiDon;
    private String ngayGuiDon;
    private String ngaySuLy;
    private String nguoiSuLy;
}
