package org.ait.project.seo.example.modules.seo.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContentResponse {

    @JsonProperty("title")
    private String title;

    @JsonProperty("contents")
    private String contents;

    @JsonProperty("url")
    private String url;
}
