package poli.edu.co.tallerfinal.service.interfaces;

import poli.edu.co.tallerfinal.dto.response.MessageResponse;
import poli.edu.co.tallerfinal.persistence.entity.Users;

import java.util.List;

public interface IUserService {
    MessageResponse createUser(Users user);
    MessageResponse deleteUser(Long id_user);
    List<Users> listUsers();
}
