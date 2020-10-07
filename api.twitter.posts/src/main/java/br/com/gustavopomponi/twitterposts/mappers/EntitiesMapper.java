package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.EntitiesModel;
import org.springframework.social.twitter.api.Entities;

import java.util.stream.Collectors;

public class EntitiesMapper {

    public static EntitiesModel fromEntityToModel(Entities entity) {

        if(entity == null){
            return null;
        }

        return EntitiesModel.builder()
                .media(entity.getMedia().stream().map(MediaMapper::fromEntityToModel).collect(Collectors.toList()))
                .mentions(entity.getMentions().stream().map(MentionMapper::fromEntityToModel).collect(Collectors.toList()))
                .tags(entity.getHashTags().stream().map(HashTagMapper::fromEntityToModel).collect(Collectors.toList()))
                .tickerSymbols(entity.getTickerSymbols().stream().map(TickerSymbolMapper::fromEntityToModel).collect(Collectors.toList()))
                .urls(entity.getUrls().stream().map(UrlMapper::fromEntityToModel).collect(Collectors.toList()))
                .build();
    }


}
