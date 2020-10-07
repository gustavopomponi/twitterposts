package br.com.gustavopomponi.twitterposts.exception.handler;

import br.com.gustavopomponi.twitterposts.model.BadRequestExceptionModel;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.social.ApiException;
import org.springframework.social.MissingAuthorizationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.context.request.ServletWebRequest;

@ControllerAdvice
public class ExceptionHandlerConfig {

    private static final Logger appLogger = LoggerFactory.getLogger(ExceptionHandlerConfig.class);

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ApiException.class)
    public ResponseEntity<BadRequestExceptionModel> handler(ApiException ex, ServletWebRequest request){
        BadRequestExceptionModel model = BadRequestExceptionModel.builder().mensagem("Problemas ao tentar fazer requisição à API do Twitter. Erro durante a comunicação").build();
        return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body(model);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MissingAuthorizationException.class)
    public ResponseEntity<BadRequestExceptionModel> handler(MissingAuthorizationException  ex, ServletWebRequest request){
        BadRequestExceptionModel model = BadRequestExceptionModel.builder().mensagem("Problemas ao tentar fazer requisição à API do Twitter. Credenciais Incorretas ou Token Inválido").build();
        return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body(model);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(ResourceAccessException.class)
    public ResponseEntity<BadRequestExceptionModel> handler(ResourceAccessException  ex, ServletWebRequest request){
        BadRequestExceptionModel model = BadRequestExceptionModel.builder().mensagem("Problemas ao tentar fazer requisição à API do Twitter. Sem conectividade de rede").build();
        return ResponseEntity.badRequest().contentType(MediaType.APPLICATION_JSON).body(model);
    }

}
