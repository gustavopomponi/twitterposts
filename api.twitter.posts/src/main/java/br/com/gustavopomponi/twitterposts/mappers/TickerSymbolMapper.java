package br.com.gustavopomponi.twitterposts.mappers;

import br.com.gustavopomponi.twitterposts.model.TickerSymbol;
import org.springframework.social.twitter.api.TickerSymbolEntity;

public class TickerSymbolMapper {

    public static TickerSymbol fromEntityToModel(TickerSymbolEntity entity) {

        if(entity == null){
            return null;
        }

        return TickerSymbol.builder()
                .url(entity.getUrl())
                .tickerSymbol(entity.getTickerSymbol())
                .indices(entity.getIndices())
                .url(entity.getUrl())
                .build();
    }

}
