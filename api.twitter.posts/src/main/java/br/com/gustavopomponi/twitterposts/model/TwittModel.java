package br.com.gustavopomponi.twitterposts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tb_Tweet")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TwittModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "idStr")
    private String idStr;

    private String text;

    @Column(name = "createdAt")
    private Date createdAt;

    @Column(name = "fromUser")
    private String fromUser;

    @Column(name = "profileImageUrl")
    private String profileImageUrl;

    @Column(name = "toUserId")
    private Long toUserId;

    @Column(name = "inReplyToStatusId")
    private Long inReplyToStatusId;

    @Column(name = "inReplyToUserId")
    private Long inReplyToUserId;

    @Column(name = "inReplyToScreenName")
    private String inReplyToScreenName;

    @Column(name = "fromUserId")
    private long fromUserId;

    @Column(name = "languageCode")
    private String languageCode;

    private String source;

    @Column(name = "retweetCount")
    private Integer retweetCount;

    private boolean retweeted;

    @Column(name = "retweetedStatus")
    private TwittModel retweetedStatus;

    private boolean favorited;

    @Column(name = "favoriteCount")
    private Integer favoriteCount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private TwitterProfileModel user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entities_id", referencedColumnName = "id")
    private EntitiesModel entities;

}
