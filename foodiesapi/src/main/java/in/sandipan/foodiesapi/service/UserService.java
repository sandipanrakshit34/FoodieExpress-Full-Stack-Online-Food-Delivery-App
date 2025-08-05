package in.sandipan.foodiesapi.service;

import in.sandipan.foodiesapi.io.UserRequest;
import in.sandipan.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
