package br.com.gustavopomponi.twitterposts.factory;

import br.com.gustavopomponi.twitterposts.model.Url;

import java.util.ArrayList;
import java.util.List;

public class UrlFactory {

    public static List<Url> validModelList() {

        int[] indices = {109, 132};
        List<Url> lista = new ArrayList<>();

        lista.add(Url.builder().indices(indices)
                .url("https://t.co/Bdm4SFQHba")
                .display("twitter.com/i/web/status/1…")
                .expanded("https://twitter.com/i/web/status/1313624204810555393")
                .build());

        return lista;

    }
}
