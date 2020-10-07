package br.com.gustavopomponi.twitterposts.repository;

import br.com.gustavopomponi.twitterposts.model.TwittModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITweetsRepository extends JpaRepository<TwittModel, Long> {




}
