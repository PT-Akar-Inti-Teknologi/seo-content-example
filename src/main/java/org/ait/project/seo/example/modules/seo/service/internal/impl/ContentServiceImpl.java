package org.ait.project.seo.example.modules.seo.service.internal.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.seo.example.modules.seo.dto.request.ContentRequest;
import org.ait.project.seo.example.modules.seo.dto.response.ContentResponse;
import org.ait.project.seo.example.modules.seo.model.entity.Content;
import org.ait.project.seo.example.modules.seo.service.delegate.ContentDelegate;
import org.ait.project.seo.example.modules.seo.service.internal.ContentService;
import org.ait.project.seo.example.modules.seo.transform.ContentMapper;
import org.ait.project.seo.example.shared.constant.enums.ResponseEnum;
import org.ait.project.seo.example.shared.dto.template.ResponseDetail;
import org.ait.project.seo.example.shared.dto.template.ResponseTemplate;
import org.ait.project.seo.example.shared.utils.Helper;
import org.ait.project.seo.example.shared.utils.ResponseHelper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentServiceImpl implements ContentService {

    private final ResponseHelper responseHelper;

    private final ContentDelegate service;

    private final ContentMapper mapper;

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ContentResponse>>> getByUrl(
        String url) {

        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
            mapper.convertToResponse(service.getByUrl(url)));
    }

    @Override
    public ResponseEntity<ResponseTemplate<ResponseDetail<ContentResponse>>> add(ContentRequest request) {

        Content content = mapper.convertToEntity(request);
        content.setUrl(Helper.generateUrl(request.getTitle()));

        return responseHelper.createResponseDetail(ResponseEnum.SUCCESS,
            mapper.convertToResponse(service.add(content)));
    }
}
