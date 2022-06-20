package org.ait.project.seo.example.modules.seo.exception;

import lombok.extern.slf4j.Slf4j;
import org.ait.project.seo.example.config.exception.ModuleException;
import org.ait.project.seo.example.shared.constant.enums.ResponseEnum;

@Slf4j
public class DataNotFoundException extends ModuleException {

  public DataNotFoundException() {
    super(ResponseEnum.DATA_NOT_FOUND);
    log.error("Data not found");
  }
}
