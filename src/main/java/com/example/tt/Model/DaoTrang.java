package com.example.tt.Model;
import javax.persistence.*;
@Entity
@Table(name = "DaoTrang")
public class DaoTrang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String noiToChuc;
    private int soThanhVienThamGia;
    private Long nguoiChuTriId;
    private String thoiGianToChuc;
    private String noiDung;
    private boolean daKetThuc;
}
