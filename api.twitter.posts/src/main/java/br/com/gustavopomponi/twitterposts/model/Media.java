package br.com.gustavopomponi.twitterposts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "tb_Media")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Media implements Serializable {
    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name = "mediaHttp")
    private String mediaHttp;

    @Column(name = "mediaHttps")
    private String mediaHttps;

    @Column
    private String url;

    @Column
    private String display;

    @Column
    private String expanded;

    @Column
    private String type;

    @Column
    private int[] indices;

}
