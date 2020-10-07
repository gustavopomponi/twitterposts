package br.com.gustavopomponi.twitterposts.factory;

import br.com.gustavopomponi.twitterposts.model.Media;

import java.util.ArrayList;
import java.util.List;

public class MediaFactory {

    public static List<Media> validModelList(){

        List<Media> lista = new ArrayList<>();

        lista.add(Media.builder()
                .id(1313620168749219840L)
                .url("https://t.co/5KsJLjm2qL")
                .type("photo")
                .indices(new int[]{95,118})
                .mediaHttp("http://pbs.twimg.com/media/EjrqlWgWAAAYDJj.jpg")
                .mediaHttps("https://pbs.twimg.com/media/EjrqlWgWAAAYDJj.jpg")
                .display("pic.twitter.com/5KsJLjm2qL")
                .expanded("https://twitter.com/Marpaulcan/status/1313620180313026560/photo/1")
                .build());

        return lista;

    }
}
