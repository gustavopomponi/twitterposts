package br.com.gustavopomponi.twitterposts.factory;

import br.com.gustavopomponi.twitterposts.model.HashTag;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class HashTagFactory {

    public static List<HashTag> validModelList() {

        List<HashTag> lista = new ArrayList<>();

        lista.add(hashTagBuilder("delivery", new int[]{0,9}));
        lista.add(hashTagBuilder("RAPPI", new int[]{10,16}));
        lista.add(hashTagBuilder("GLOBO", new int[]{17,23}));
        lista.add(hashTagBuilder("CABA", new int[]{41,46}));

        return lista;

    }

    private static HashTag hashTagBuilder(String text, int[] indices) {
        return HashTag.builder()
                .text(text)
                .indices(indices)
                .build();
    }
}