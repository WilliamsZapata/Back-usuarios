package com.example.psywell.dto.outputs.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DecodeRefreshTokenOutput {
    private String sub;
    private Long exp;

}
