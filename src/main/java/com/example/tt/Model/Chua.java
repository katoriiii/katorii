package com.example.tt.Model;
import javax.persistence.*;
@Entity
@Table(name = "Chua")
public class Chua {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tenChua;
    private String ngayThanhLap;
    private String diaChi;
    private String truTri;
    private String capNhat;
}
