package data.repositories;

import data.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public default User findByPhoneNumber(String phoneNumber){
        User foundUser = new User();
        for (User user : findAll()){
            if (user.getPhoneNumber().equals(phoneNumber)){
                foundUser = user ;
            }
        }
        return foundUser;
    }

}
