package com.javarush.task.task36.task3608.model;

import com.javarush.task.task36.task3608.model.service.UserService;
import com.javarush.task.task36.task3608.model.service.UserServiceImpl;

/**
 * Created by Asus on 011 11.07.17.
 */
public class MainModel implements Model {
    private ModelData modelData = new ModelData();
    private UserService userService = new UserServiceImpl();

   /* private UserService userService(){

        return (UserService) getModelData();
    }

*/

    @Override
    public ModelData getModelData() {

        return modelData;
    }

    @Override
    public void loadUsers() {
//        getUsersBetweenLevels(1, 100){
//        userService.getUsersBetweenLevels(1, 100);
//        modelData.setDisplayDeletedUserList(false);
        modelData.setUsers(userService.getUsersBetweenLevels(1, 100));
    }


}
