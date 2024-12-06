package com.example.demo.component.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class DemoValidateModel {

	@NotEmpty
    @Size(min= 1, max = 100, message = "{0}は1～100文字（常識の範囲）を入力してください")
    private String title;

	@NotEmpty
    @Size(min= 1, max = 10000, message = "{0}は1～10000文字（常識の範囲）を入力してください")
    private String post;

}
