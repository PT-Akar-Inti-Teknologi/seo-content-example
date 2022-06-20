package org.ait.project.seo.example.modules.seo.controller;

import lombok.RequiredArgsConstructor;
import org.ait.project.seo.example.modules.seo.dto.request.ContentRequest;
import org.ait.project.seo.example.modules.seo.dto.response.ContentResponse;
import org.ait.project.seo.example.modules.seo.service.internal.ContentService;
import org.ait.project.seo.example.shared.dto.template.ResponseDetail;
import org.ait.project.seo.example.shared.dto.template.ResponseTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController implements ContentService {

    private final ContentService contentService;

    @Override
    @GetMapping("/{url}")
    public ResponseEntity<ResponseTemplate<ResponseDetail<ContentResponse>>> getByUrl(@PathVariable String url) {
        return contentService.getByUrl(url);
    }

    @Override
    @PostMapping
    public ResponseEntity<ResponseTemplate<ResponseDetail<ContentResponse>>> add(@RequestBody @Valid ContentRequest request) {
        return contentService.add(request);
    }
}
