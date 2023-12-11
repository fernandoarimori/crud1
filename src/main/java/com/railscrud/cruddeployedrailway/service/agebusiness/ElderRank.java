package com.railscrud.cruddeployedrailway.service.agebusiness;

import com.railscrud.cruddeployedrailway.model.CategoryPlace;
import com.railscrud.cruddeployedrailway.model.User;
import org.springframework.stereotype.Component;

@Component
public class ElderRank implements RankCheck {
    @Override
    public CategoryPlace rankCategory(User user, Integer age) {
        if (age >= 61) {
            return user.setCategoryPlace(CategoryPlace.ELDER);
        }
        return null;
    }
}
