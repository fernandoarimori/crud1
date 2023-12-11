package com.railscrud.cruddeployedrailway.service.agebusiness;

import com.railscrud.cruddeployedrailway.model.CategoryPlace;
import com.railscrud.cruddeployedrailway.model.User;

public interface RankCheck {
    CategoryPlace rankCategory (User user, Integer age);
}
