package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.TwittModel;
import org.springframework.social.twitter.api.Tweet;

public class TweetMapper {

    public static TwittModel fromEntityToModel(Tweet entity){

       if(entity == null){
           return null;
       }

       return TwittModel.builder()
               .createdAt(entity.getCreatedAt())
               .favoriteCount(entity.getFavoriteCount())
               .favorited(entity.isFavorited())
               .fromUser(entity.getFromUser())
               .fromUserId(entity.getFromUserId())
               .id(entity.getId())
               .idStr(entity.getIdStr())
               .inReplyToScreenName(entity.getInReplyToScreenName())
               .inReplyToStatusId(entity.getInReplyToStatusId())
               .inReplyToUserId(entity.getInReplyToUserId())
               .languageCode(entity.getLanguageCode())
               .profileImageUrl(entity.getProfileImageUrl())
               .retweetCount(entity.getRetweetCount())
               .retweeted(entity.isRetweeted())
               .source(entity.getSource())
               .text(entity.getText())
               .toUserId(entity.getToUserId())
               .user(TweeterProfileMapper.fromEntityToModel(entity.getUser()))
               .entities(EntitiesMapper.fromEntityToModel(entity.getEntities()))
               .build();

    }
}
