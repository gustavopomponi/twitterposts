package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.TwitterProfileModel;
import org.springframework.social.twitter.api.TwitterProfile;

public class TweeterProfileMapper {

    public static TwitterProfileModel fromEntityToModel(TwitterProfile entity) {

        if(entity == null){
            return null;
        }

        return TwitterProfileModel.builder()
                .backgroundColor(entity.getBackgroundColor())
                .backgroundImageUrl(entity.getBackgroundImageUrl())
                .createdDate(entity.getCreatedDate())
                .description(entity.getDescription())
                .favoritesCount(entity.getFavoritesCount())
                .followersCount(entity.getFollowersCount())
                .following(entity.isFollowing())
                .contributorsEnabled(entity.isContributorsEnabled())
                .followRequestSent(entity.isFollowRequestSent())
                .backgroundImageTiled(entity.isBackgroundImageTiled())
                .friendsCount(entity.getFriendsCount())
                .geoEnabled(entity.isGeoEnabled())
                .id(entity.getId())
                .isProtected(entity.isProtected())
                .language(entity.getLanguage())
                .linkColor(entity.getLinkColor())
                .listedCount(entity.getListedCount())
                .location(entity.getLocation())
                .name(entity.getName())
                .notificationsEnabled(entity.isNotificationsEnabled())
                .profileBannerUrl(entity.getProfileBannerUrl())
                .profileImageUrl(entity.getProfileImageUrl())
                .screenName(entity.getScreenName())
                .showAllInlineMedia(entity.showAllInlineMedia())
                .sidebarBorderColor(entity.getSidebarBorderColor())
                .sidebarFillColor(entity.getSidebarFillColor())
                .statusesCount(entity.getStatusesCount())
                .textColor(entity.getTextColor())
                .timeZone(entity.getTimeZone())
                .translator(entity.isTranslator())
                .url(entity.getUrl())
                .useBackgroundImage(entity.useBackgroundImage())
                .utcOffset(entity.getUtcOffset())
                .verified(entity.isVerified())
                .build();
    }

}
