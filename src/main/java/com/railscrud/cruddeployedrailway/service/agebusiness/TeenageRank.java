package com.railscrud.cruddeployedrailway.service.agebusiness;

import com.railscrud.cruddeployedrailway.model.CategoryPlace;
import com.railscrud.cruddeployedrailway.model.User;
import org.springframework.stereotype.Component;

@Component
public class TeenageRank implements RankCheck {
    @Override
    public CategoryPlace rankCategory(User user, Integer age) {
        if (age <= 17 && age>10) {
            return user.setCategoryPlace(CategoryPlace.TEENAGE);
        } else return null;
    }
}
