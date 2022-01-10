package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "user")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "pwd")
    private String pwd;

    private long sexid;

    //  //一对一
    @OneToOne(cascade = CascadeType.MERGE,targetEntity=Gender.class)
    @JoinColumn(name = "id",referencedColumnName="sex")
    private Gender gender;

    //FetchType.EAGER立即加载
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "uid")
    private List<Goods> goodsList;
}
