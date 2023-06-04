package poli.edu.co.tallerfinal.service.interfaces;

import poli.edu.co.tallerfinal.dto.response.MessageResponse;
import poli.edu.co.tallerfinal.persistence.entity.Bookings;

public interface IBookingService {
    MessageResponse createBooking(Bookings booking);
    MessageResponse deleteBooking(Long id_booking);
    MessageResponse findBooking_ById(Long id_booking);
    MessageResponse findBooking_ByUser(Long id_user);
    MessageResponse listBooking();
}
