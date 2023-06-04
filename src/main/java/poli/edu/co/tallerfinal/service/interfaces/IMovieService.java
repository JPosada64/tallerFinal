package poli.edu.co.tallerfinal.service.interfaces;

import poli.edu.co.tallerfinal.dto.response.MessageResponse;
import poli.edu.co.tallerfinal.persistence.entity.Movies;

public interface IMovieService {
    MessageResponse createMovie(Movies movie);
    MessageResponse deleteMovie(Long id_movie);
    MessageResponse findMovie(Long id_movie);
    MessageResponse listMovies();
}
