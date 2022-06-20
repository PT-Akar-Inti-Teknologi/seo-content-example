package org.ait.project.seo.example.modules.seo.service.delegate.impl;

import lombok.RequiredArgsConstructor;
import org.ait.project.seo.example.modules.seo.exception.DataNotFoundException;
import org.ait.project.seo.example.modules.seo.model.entity.Content;
import org.ait.project.seo.example.modules.seo.model.repository.ContentRepository;
import org.ait.project.seo.example.modules.seo.service.delegate.ContentDelegate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContentDelegateImpl implements ContentDelegate {

  private final ContentRepository repository;

  @Override
  public Content getByUrl(String url) {
    return repository.findByUrl(url).orElseThrow(DataNotFoundException::new);
  }

  @Override
  public Content add(Content content) {
    return repository.save(content);
  }
}
