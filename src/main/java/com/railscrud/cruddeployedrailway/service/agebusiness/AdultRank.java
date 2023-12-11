package com.railscrud.cruddeployedrailway.service.agebusiness;

import com.railscrud.cruddeployedrailway.model.CategoryPlace;
import com.railscrud.cruddeployedrailway.model.User;
import org.springframework.stereotype.Component;

@Component
public class AdultRank implements RankCheck {
    @Override
    public CategoryPlace rankCategory(User user, Integer age) {
        if (age <= 60 && age>17) {
            return user.setCategoryPlace(CategoryPlace.ADULT);
        } else {
            return null;
        }
    }
}
