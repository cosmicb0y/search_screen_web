package com.hackday.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screenshot {
    private String area;
    private String query;
    private String type;
    private String num;
    private String description;
}
