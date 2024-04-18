package edu.miu.cs.cs489.Lab11.adsLab7.service.Implementation;

import edu.miu.cs.cs489.Lab11.adsLab7.dao.UserRepository;
import edu.miu.cs.cs489.Lab11.adsLab7.models.Users;
import edu.miu.cs.cs489.Lab11.adsLab7.service.IUserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users save(Users users) {
        return userRepository.save(users);
    }
}
