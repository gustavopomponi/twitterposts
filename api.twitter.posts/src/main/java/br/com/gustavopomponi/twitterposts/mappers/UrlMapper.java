package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.Url;
import org.springframework.social.twitter.api.UrlEntity;

public class UrlMapper {

    public static Url fromEntityToModel(UrlEntity entity) {

        if(entity == null){
            return null;
        }

        return Url.builder().display(entity.getDisplayUrl())
                .expanded(entity.getExpandedUrl())
                .url(entity.getUrl())
                .indices(entity.getIndices())
                .build();
    }

}
