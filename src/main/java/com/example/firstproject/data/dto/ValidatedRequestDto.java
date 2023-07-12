package com.example.firstproject.data.dto;


import com.example.firstproject.config.annotation.Telephone;
import com.example.firstproject.data.group.ValidationGroup1;
import com.example.firstproject.data.group.ValidationGroup2;
import lombok.*;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ValidatedRequestDto {

    @NotBlank
    private String name;

    @Email
    private String email;

    @Telephone
    private String phoneNumber;

    @Min(value = 20, groups = ValidationGroup1.class)
    @Max(value = 40, groups = ValidationGroup1.class)
    private int age;

    @Size(min = 0, max = 40)
    private String description;

    @Positive(groups = ValidationGroup2.class)
    private int count;

    @AssertTrue
    private boolean booleanCheck;

}
