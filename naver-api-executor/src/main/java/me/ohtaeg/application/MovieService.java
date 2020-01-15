package me.ohtaeg.application;

import me.ohtaeg.api.dto.SearchWord;
import me.ohtaeg.domain.repository.SearchRepository;
import me.ohtaeg.domain.response.Movie;
import me.ohtaeg.domain.response.SearchApi;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements SearchService {

    private SearchRepository searchRepository;

    public MovieService(final SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public SearchApi search(final SearchWord searchWord) {
        return searchRepository.search(new Movie(searchWord), Movie.class);
    }
}
