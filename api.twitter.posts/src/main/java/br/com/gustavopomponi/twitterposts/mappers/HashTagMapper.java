package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.HashTag;
import org.springframework.social.twitter.api.HashTagEntity;

public class HashTagMapper {

    public static HashTag fromEntityToModel(HashTagEntity entity) {

        if(entity == null){
            return null;
        }

        return HashTag.builder()
                .indices(entity.getIndices())
                .text(entity.getText())
                .build();
    }

}
