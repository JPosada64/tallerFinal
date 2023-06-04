package poli.edu.co.tallerfinal.service;

import org.springframework.stereotype.Service;
import poli.edu.co.tallerfinal.dto.response.MessageResponse;
import poli.edu.co.tallerfinal.persistence.entity.Users;
import poli.edu.co.tallerfinal.service.interfaces.IUserService;

import java.util.List;

@Service
public class UsersService implements IUserService {
    @Override
    public MessageResponse createUser(Users user) {
        return null;
    }

    @Override
    public MessageResponse deleteUser(Long id_user) {
        return null;
    }

    @Override
    public List<Users> listUsers() {
        return null;
    }
}
