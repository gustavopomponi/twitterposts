package br.com.gustavopomponi.twitterposts.service.implementation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.social.ApiException;
import org.springframework.social.twitter.api.*;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BuscaTweetsTest {

    @Mock
    private Twitter twitter;

    @InjectMocks
    private BuscaTweetsService service;

    private Tweet myPojo;

    @BeforeEach
    void setUp() {

        PodamFactory factory = new PodamFactoryImpl();
        myPojo = factory.manufacturePojo(Tweet.class);

        List<Tweet> lista = new ArrayList<>();
        lista.add(myPojo);

        when(twitter.searchOperations()).thenReturn(new SearchOperations() {
            @Override
            public SearchResults search(String s) {
                if(s != "#globo"){
                    lista.clear();
                }
                return new SearchResults(lista, new SearchMetadata(1L,1L));
            }

            @Override
            public SearchResults search(String s, int i) {
                return null;
            }

            @Override
            public SearchResults search(String s, int i, long l, long l1) {
                return null;
            }

            @Override
            public SearchResults search(SearchParameters searchParameters) {
                return null;
            }

            @Override
            public List<SavedSearch> getSavedSearches() {
                return null;
            }

            @Override
            public SavedSearch getSavedSearch(long l) {
                return null;
            }

            @Override
            public SavedSearch createSavedSearch(String s) {
                return null;
            }

            @Override
            public void deleteSavedSearch(long l) {

            }

            @Override
            public Trends getLocalTrends(long l) {
                return null;
            }

            @Override
            public Trends getLocalTrends(long l, boolean b) {
                return null;
            }
        });

    }

    @Test
    public void RetornoUltimosTweets() {

        List<Tweet> listaTweet = service.findTweets("#globo");

        assertTrue(listaTweet.size() > 0);
        assertEquals(listaTweet.get(0), myPojo);

    }

    @Test
    public void RetornoVazio() {

        List<Tweet> listaTweet = service.findTweets("#blablabla");
        assertFalse(listaTweet.size() > 0);

    }

    @Test
    public void RetornaTweetsErroApi() {

        when(twitter.searchOperations()).thenThrow(ApiException.class);
        assertThrows(ApiException.class, () -> {
            List<Tweet> listaTweet = service.findTweets("#teste");
        });
    }

}
