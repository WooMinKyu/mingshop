package com.woo.mingshop.validator;

import com.woo.mingshop.model.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        User u = (User) obj;
        if(StringUtils.isEmpty(u.getUsername())) {
            errors.rejectValue("username","key", "내용을 입력하세요.");
        }
    }
}
