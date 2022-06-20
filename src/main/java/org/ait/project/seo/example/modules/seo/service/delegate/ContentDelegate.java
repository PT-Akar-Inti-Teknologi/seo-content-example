package org.ait.project.seo.example.modules.seo.service.delegate;

import org.ait.project.seo.example.modules.seo.model.entity.Content;

public interface ContentDelegate {

    Content getByUrl (String url);

    Content add (Content content);

}
