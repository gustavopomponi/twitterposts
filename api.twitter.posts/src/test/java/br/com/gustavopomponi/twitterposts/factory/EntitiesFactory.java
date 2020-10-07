package br.com.gustavopomponi.twitterposts.factory;

import br.com.gustavopomponi.twitterposts.model.EntitiesModel;

public class EntitiesFactory {

    public static EntitiesModel validModel() {

        return EntitiesModel.builder()
                .urls(UrlFactory.validModelList())
                .mentions(MentionFactory.validModelList())
                .media(MediaFactory.validModelList())
                .tags(HashTagFactory.validModelList())
                .build();

    }

}
