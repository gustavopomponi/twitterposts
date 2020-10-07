package br.com.gustavopomponi.twitterposts.controller;

import br.com.gustavopomponi.twitterposts.mappers.TweetMapper;
import br.com.gustavopomponi.twitterposts.service.implementation.BuscaTweetsService;
import br.com.gustavopomponi.twitterposts.service.implementation.SaveTweetsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TweetsController {

    private BuscaTweetsService service;
    private SaveTweetsService serviceSave;

    public TweetsController (BuscaTweetsService service, SaveTweetsService serviceSave) {
        this.service = service;
        this.serviceSave = serviceSave;
    }

    @GetMapping("/tweets")
    public ResponseEntity<List<Tweet>> get(@RequestParam String hashtag){

        List<Tweet> result = service.findTweets(hashtag);
        result.forEach(twt -> {
            this.serviceSave.save(TweetMapper.fromEntityToModel(twt));
        });

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                .body(result);

    }

}
