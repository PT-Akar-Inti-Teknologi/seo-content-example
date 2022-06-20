package org.ait.project.seo.example.shared.constant.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ResponseEnum {
  SUCCESS("WGY-000", "success", HttpStatus.OK),
  DATA_NOT_FOUND("WGY-0001", "data.not.found", HttpStatus.NOT_FOUND),

  INVALID_PARAM("WGY-0009", "invalid.param", HttpStatus.BAD_REQUEST),
  INTERNAL_SERVER_ERROR("WGY-9999", "internal.server.error", HttpStatus.INTERNAL_SERVER_ERROR),

  ;

  private final String responseCode;
  private final String responseMessage;
  private final HttpStatus httpStatus;

}
