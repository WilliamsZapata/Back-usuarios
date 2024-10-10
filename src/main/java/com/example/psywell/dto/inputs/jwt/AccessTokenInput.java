package com.example.psywell.dto.inputs.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccessTokenInput {
    @NotNull
    private String access_token;

}
