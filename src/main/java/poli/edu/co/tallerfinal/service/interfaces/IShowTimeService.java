package poli.edu.co.tallerfinal.service.interfaces;

import poli.edu.co.tallerfinal.dto.response.MessageResponse;
import poli.edu.co.tallerfinal.persistence.entity.Showtimes;

public interface IShowTimeService {
    MessageResponse createShowTime(Showtimes showtimes);
    MessageResponse deleteShowTime(Long id_showtimes);
    MessageResponse findShowTime(Long id_showtimes);
    MessageResponse listShowTimes();
}
