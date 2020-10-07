package br.com.gustavopomponi.twitterposts.factory;

import br.com.gustavopomponi.twitterposts.model.Mention;

import java.util.ArrayList;
import java.util.List;

public class MentionFactory {

    public static List<Mention> validModelList() {

        List<Mention> lista = new ArrayList<>();
        lista.add(Mention.builder()
                .id(214570761L)
                .screenName("jornalnacional")
                .name("Jornal Nacional")
                .indices(new int[]{0,15})
                .build());
        lista.add(Mention.builder()
                .id(18219976L)
                .screenName("RedeGlobo")
                .name("RedeGlobo")
                .indices(new int[]{40,50})
                .build());

        return lista;

    }

}
