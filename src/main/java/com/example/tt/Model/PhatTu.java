package com.example.tt.Model;
import javax.persistence.*;
@Entity
@Table(name = "PhatTu")
public class PhatTu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String hoTenDem;
    private String ten;
    private String phapDanh;
    private String anhChup;
    private String soDienThoai;
    private String email;
    private String ngaySinh;
    private String ngayXuatGia;
    private boolean daHoanTuc;
    private String ngayHoanTuc;
    private String gioiTinh;
    private Long kieuThanhVienId;
    private String ngayCapNhat;
    private Long chuaId;
    private String matKhau;
}
