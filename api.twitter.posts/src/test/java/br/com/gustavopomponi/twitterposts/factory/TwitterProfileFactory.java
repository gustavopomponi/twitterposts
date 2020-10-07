package br.com.gustavopomponi.twitterposts.factory;

import br.com.gustavopomponi.twitterposts.model.TwitterProfileModel;

import java.util.Date;

public class TwitterProfileFactory {

    public static TwitterProfileModel validModel() {

        return TwitterProfileModel.builder()
                .id(48933826L)
                .screenName("japonesvoador")
                .name("[dan]")
                .profileImageUrl("http://pbs.twimg.com/profile_images/378800000217961855/f114cd2fe45e12407609af439b7736d5_normal.jpeg")
                .description("__________▂▂▂▂▂▂▂▂▂▂▂_________")
                .location("")
                .createdDate(new Date())
                .statusesCount(4989)
                .friendsCount(814)
                .followersCount(164)
                .favoritesCount(1733)
                .listedCount(1)
                .following(false)
                .followRequestSent(false)
                .notificationsEnabled(false)
                .verified(false)
                .geoEnabled(false)
                .contributorsEnabled(false)
                .translator(false)
                .utcOffset(0)
                .sidebarBorderColor("FFFFFF")
                .sidebarFillColor("FF0000")
                .backgroundColor("5588BB")
                .backgroundImageUrl("http://abs.twimg.com/images/themes/theme6/bg.gif")
                .backgroundImageTiled(false)
                .textColor("000000")
                .linkColor("9E3939")
                .profileBannerUrl("https://pbs.twimg.com/profile_banners/48933826/1348453229")
                .isProtected(false)
                .profileImageUrl("http://twitter.com/japonesvoador")
                .build();
    }

}
