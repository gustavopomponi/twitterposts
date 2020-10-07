package br.com.gustavopomponi.twitterposts.service;

import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;

import java.util.List;

public interface IBuscaTweets {
    List<Tweet> findTweets(String hashtag);
}
