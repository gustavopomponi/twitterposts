package br.com.gustavopomponi.twitterposts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="tb_entities")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class EntitiesModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="urls_id")
    private List<Url> urls;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="tags_id")
    private List<HashTag> tags;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="mentions_id")
    private List<Mention> mentions;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="media_id")
    private List<Media> media;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="tickerSymbols_id")
    private List<TickerSymbol> tickerSymbols;

}
