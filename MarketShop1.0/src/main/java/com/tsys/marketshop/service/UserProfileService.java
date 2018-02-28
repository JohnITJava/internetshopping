package com.tsys.marketshop.service;

import com.tsys.marketshop.model.UserProfile;
import java.util.List;

public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}
