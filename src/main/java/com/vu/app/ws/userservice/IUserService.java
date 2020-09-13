package com.vu.app.ws.userservice;

import com.vu.app.ws.ui.model.request.UserDetailsRequestModel;
import com.vu.app.ws.ui.model.response.UserRest;

public interface IUserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
