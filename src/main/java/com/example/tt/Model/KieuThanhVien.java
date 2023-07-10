package com.example.tt.Model;
import javax.persistence.*;

@Entity
@Table(name = "kieuthanhvien")
public class KieuThanhVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Code;
    private String TenKieu;
}
