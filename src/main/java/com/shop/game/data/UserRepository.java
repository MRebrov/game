/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.game.data;


import com.shop.game.model.User;
        
/**
 *
 * @author mrebrov
 */
public interface UserRepository {
    
    Iterable<User> findAll();
    
    User findOne(String id);
    
    User save(User user);
    
}
