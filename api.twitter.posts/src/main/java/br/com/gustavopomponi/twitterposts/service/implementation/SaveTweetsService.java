package br.com.gustavopomponi.twitterposts.service.implementation;

import br.com.gustavopomponi.twitterposts.model.TwittModel;
import br.com.gustavopomponi.twitterposts.repository.ITweetsRepository;
import br.com.gustavopomponi.twitterposts.service.ISaveTweets;
import org.springframework.stereotype.Service;

@Service
public class SaveTweetsService implements ISaveTweets {

    private ITweetsRepository repository;

    public SaveTweetsService(ITweetsRepository repository) {
        this.repository = repository;
    }

    public void save(TwittModel tweetModel){
        this.repository.save(tweetModel);
    }

}
