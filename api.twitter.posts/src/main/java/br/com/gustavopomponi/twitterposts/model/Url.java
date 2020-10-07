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
@Table(name = "tb_Url")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Url implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column
    private String display;

    @Column
    private String expanded;

    @Column
    private String url;

    @Column
    private int[] indices;

}
