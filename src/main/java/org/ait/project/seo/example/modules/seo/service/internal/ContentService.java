package org.ait.project.seo.example.modules.seo.service.internal;

import org.ait.project.seo.example.modules.seo.dto.request.ContentRequest;
import org.ait.project.seo.example.modules.seo.dto.response.ContentResponse;
import org.ait.project.seo.example.shared.dto.template.ResponseDetail;
import org.ait.project.seo.example.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;

public interface ContentService {

  ResponseEntity<ResponseTemplate<ResponseDetail<ContentResponse>>> getByUrl(String url);

  ResponseEntity<ResponseTemplate<ResponseDetail<ContentResponse>>> add(ContentRequest request);

}
