package br.com.gustavopomponi.twitterposts.factory;
import br.com.gustavopomponi.twitterposts.model.TwittModel;
import java.util.Date;

public class TwittFactory {

    public static TwittModel validModel() {

        return TwittModel.builder()
                .id(1313624204810555393L)
                .idStr("1313624204810555393")
                .text("@jornalnacional Mais de 1 bilhão para a @RedeGlobo , segundo o doleiro dos doleiros. Organização criminosa.… https://t.co/Bdm4SFQHba")
                .createdAt(new Date())
                .fromUser("japonesvoador")
                .profileImageUrl("http://pbs.twimg.com/profile_images/378800000217961855/f114cd2fe45e12407609af439b7736d5_normal.jpeg")
                .toUserId(214570761L)
                .inReplyToStatusId(1313622684329181184L)
                .inReplyToUserId(214570761L)
                .inReplyToScreenName("jornalnacional")
                .fromUserId(48933826L)
                .languageCode("pt")
                .source("<a href=\"http://twitter.com/download/android\" rel=\"nofollow\">Twitter for Android</a>")
                .retweetCount(0)
                .retweetedStatus(null)
                .favorited(false)
                .favoriteCount(0)
                .entities(EntitiesFactory.validModel())
                .user(TwitterProfileFactory.validModel())
                .build();
    }

}
