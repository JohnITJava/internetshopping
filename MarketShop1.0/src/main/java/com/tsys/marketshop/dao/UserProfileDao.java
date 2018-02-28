package com.tsys.marketshop.dao;

import java.util.List;
import com.tsys.marketshop.model.UserProfile;


public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
