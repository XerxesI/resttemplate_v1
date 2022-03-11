package com.progile.resttemplate;

import com.progile.resttemplate.dto.UserResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class UserResponseList {
    private List<UserResponse> userResponses;

    public UserResponseList() {
        userResponses = new ArrayList<>();
    }
}
