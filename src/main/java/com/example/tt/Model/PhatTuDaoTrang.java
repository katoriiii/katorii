package com.example.tt.Model;
import javax.persistence.*;
@Entity
@Table(name = "PhatTuDaoTrang")
public class PhatTuDaoTrang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long phatTuId;
    private Long daoTrangId;
    private boolean daThamGia;
    private String lyDoKhongThamGia;

}
