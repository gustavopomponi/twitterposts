package br.com.gustavopomponi.twitterposts.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BadRequestExceptionModel {

    @JsonProperty("codigo")
    @Builder.Default
    private String codigo = "erro";

    @JsonProperty("mensagem")
    @Builder.Default
    private String mensagem = "Erro de requisição";

}
