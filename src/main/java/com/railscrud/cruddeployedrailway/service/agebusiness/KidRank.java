package com.railscrud.cruddeployedrailway.service.agebusiness;

import com.railscrud.cruddeployedrailway.model.CategoryPlace;
import com.railscrud.cruddeployedrailway.model.User;
import org.springframework.stereotype.Component;

@Component
public class KidRank implements RankCheck {
    @Override
    public CategoryPlace rankCategory(User user, Integer age) {
        if (age <= 10 && age > 0) {
            return user.setCategoryPlace(CategoryPlace.KID);
        } else return null;
    }
}
