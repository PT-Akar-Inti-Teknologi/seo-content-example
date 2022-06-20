package org.ait.project.seo.example.modules.seo.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContentRequest {

    @JsonProperty("title")
    @NotBlank(message = "{title.required}")
    private String title;

    @JsonProperty("contents")
    @NotBlank(message = "{content.required}")
    private String contents;

}
