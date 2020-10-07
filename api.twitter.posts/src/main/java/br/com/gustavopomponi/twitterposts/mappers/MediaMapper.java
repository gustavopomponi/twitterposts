package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.HashTag;
import br.com.gustavopomponi.twitterposts.model.Media;
import org.springframework.social.twitter.api.HashTagEntity;
import org.springframework.social.twitter.api.MediaEntity;

public class MediaMapper {

    public static Media fromEntityToModel(MediaEntity entity) {

        if(entity == null){
            return null;
        }

        return Media.builder()
                .url(entity.getUrl())
                .type(entity.getType())
                .mediaHttp(entity.getMediaUrl())
                .mediaHttps(entity.getMediaSecureUrl())
                .display(entity.getDisplayUrl())
                .expanded(entity.getExpandedUrl())
                .indices(entity.getIndices())
                .id(entity.getId())
                .build();
    }
}
