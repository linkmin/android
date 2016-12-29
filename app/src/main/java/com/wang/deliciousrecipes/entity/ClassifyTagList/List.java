/**
  * Copyright 2016 bejson.com
  */
package com.wang.deliciousrecipes.entity.ClassifyTagList;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2016-12-27 18:49:15
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class List {

    private String id;
    private String name;
    @JsonProperty("parentId")
    private String parentid;
    public void setId(String id) {
         this.id = id;
     }
     public String getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setParentid(String parentid) {
         this.parentid = parentid;
     }
     public String getParentid() {
         return parentid;
     }

}