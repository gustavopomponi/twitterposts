package br.com.gustavopomponi.twitterposts.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CollectionId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "tb_TwitterProfile")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TwitterProfileModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private long id;

    @Column(name = "screenName")
    private String screenName;

    private String name;
    private String url;

    @Column(name = "profileImageUrl")
    private String profileImageUrl;

    private String description;
    private String location;

    @Column(name = "createdDate")
    private Date createdDate;

    private String language;

    @Column(name = "statusesCount")
    private int statusesCount;

    @Column(name = "friendsCount")
    private int friendsCount;

    @Column(name = "followersCount")
    private int followersCount;

    @Column(name = "favoritesCount")
    private int favoritesCount;

    @Column(name = "listedCount")
    private int listedCount;

    private boolean following;

    @Column(name = "followRequestSent")
    private boolean followRequestSent;

    @Column(name = "isProtected")
    private boolean isProtected;

    @Column(name = "notificationsEnabled")
    private boolean notificationsEnabled;

    private boolean verified;

    @Column(name = "geoEnabled")
    private boolean geoEnabled;

    @Column(name = "contributorsEnabled")
    private boolean contributorsEnabled;

    private boolean translator;

    @Column(name = "timeZone")
    private String timeZone;

    @Column(name = "utcOffset")
    private int utcOffset;

    @Column(name = "sidebarBorderColor")
    private String sidebarBorderColor;

    @Column(name = "sidebarFillColor")
    private String sidebarFillColor;

    @Column(name = "backgroundColor")
    private String backgroundColor;

    @Column(name = "useBackgroundImage")
    private boolean useBackgroundImage;

    @Column(name = "backgroundImageUrl")
    private String backgroundImageUrl;

    @Column(name = "backgroundImageTiled")
    private boolean backgroundImageTiled;

    @Column(name = "textColor")
    private String textColor;

    @Column(name = "linkColor")
    private String linkColor;

    @Column(name = "showAllInlineMedia")
    private boolean showAllInlineMedia;

    @Column(name = "profileBannerUrl")
    private String profileBannerUrl;

}

