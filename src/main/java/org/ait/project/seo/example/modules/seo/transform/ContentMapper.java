package org.ait.project.seo.example.modules.seo.transform;

import org.ait.project.seo.example.modules.seo.dto.request.ContentRequest;
import org.ait.project.seo.example.modules.seo.dto.response.ContentResponse;
import org.ait.project.seo.example.modules.seo.model.entity.Content;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ContentMapper {

    Content convertToEntity (ContentRequest request);

    ContentResponse convertToResponse (Content content);

}
