package guru.springframework.spring5jokesappv2.service;

import org.springframework.stereotype.Service;

import guru.springframework.spring5jokesappv2.external.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
    
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this. chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
