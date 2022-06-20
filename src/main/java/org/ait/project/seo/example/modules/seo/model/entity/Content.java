package org.ait.project.seo.example.modules.seo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Content {

  @Id
  @GeneratedValue
  private Integer id;

  @Column(unique=true)
  private String title;

  private String contents;

  private String url;

}
