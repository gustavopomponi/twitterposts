package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.Mention;
import org.springframework.social.twitter.api.MentionEntity;

public class MentionMapper {

    public static Mention fromEntityToModel(MentionEntity entity) {

        if(entity == null){
            return null;
        }

        return Mention.builder()
                .screenName(entity.getScreenName())
                .name(entity.getName())
                .indices(entity.getIndices())
                .id(entity.getId())
                .build();

    }
}
