package br.com.gustavopomponi.twitterposts.service.implementation;

import br.com.gustavopomponi.twitterposts.service.IBuscaTweets;
import org.springframework.social.twitter.api.SearchOperations;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuscaTweetsService implements IBuscaTweets {

    private Twitter twitter;

    public BuscaTweetsService(Twitter twitter) {
        this.twitter = twitter;
    }

    public List<Tweet> findTweets(String hashtag) {
        return twitter.searchOperations().search(hashtag).getTweets();
    }

}
