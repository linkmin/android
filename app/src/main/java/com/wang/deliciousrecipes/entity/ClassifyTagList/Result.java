/**
  * Copyright 2016 bejson.com
  */
package com.wang.deliciousrecipes.entity.ClassifyTagList;
import java.util.List;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
/**
 * Auto-generated: 2016-12-27 18:49:15
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Result {

    @JsonProperty("parentId")
    private String parentid;
    private String name;
    private List<List> list;
    public void setParentid(String parentid) {
         this.parentid = parentid;
     }
     public String getParentid() {
         return parentid;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setList(List<List> list) {
         this.list = list;
     }
     public List<List> getList() {
         return list;
     }

}